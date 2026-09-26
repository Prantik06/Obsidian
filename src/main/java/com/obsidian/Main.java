package com.obsidian;

import com.obsidian.crypto.CryptoManager;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;

public class Main {

    public static void main(String[] args) throws Exception {

        KeyPair identity =
                CryptoManager.generateIdentity();

        String message = "Hello from Obsidian";

        byte[] data =
                message.getBytes(StandardCharsets.UTF_8);

        byte[] signature =
                CryptoManager.sign(
                        identity.getPrivate(),
                        data
                );

        boolean valid =
                CryptoManager.verify(
                        identity.getPublic(),
                        data,
                        signature
                );

        System.out.println("Message: " + message);
        System.out.println("Signature valid: " + valid);
    }
}
