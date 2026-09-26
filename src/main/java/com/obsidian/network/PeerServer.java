package com.obsidian.network;

import java.io.*;
import java.net.*;

public class PeerServer {

    private final int port;

    public PeerServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {

        try (ServerSocket server =
                     new ServerSocket(port)) {

            System.out.println(
                    "Obsidian node listening on "
                            + port
            );

            while (true) {

                Socket socket =
                        server.accept();

                System.out.println(
                        "Peer connected: "
                                + socket.getInetAddress()
                );

                handle(socket);
            }
        }
    }

    private void handle(Socket socket)
            throws IOException {

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        socket.getInputStream()
                                )
                        )
        ) {

            String message;

            while ((message = reader.readLine()) != null) {

                System.out.println(
                        "Received: " + message
                );
            }
        }
    }
}
