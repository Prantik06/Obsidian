package com.obsidian.crypto;

import java.security.*;

public class CryptoManager {

    public static KeyPair generateIdentity() throws GeneralSecurityException {

        KeyPairGenerator generator =
                KeyPairGenerator.getInstance("Ed25519");

        return generator.generateKeyPair();
    }

    public static byte[] sign(
            PrivateKey privateKey,
            byte[] data
    ) throws GeneralSecurityException {

        Signature signature =
                Signature.getInstance("Ed25519");

        signature.initSign(privateKey);
        signature.update(data);

        return signature.sign();
    }

    public static boolean verify(
            PublicKey publicKey,
            byte[] data,
            byte[] signatureBytes
    ) throws GeneralSecurityException {

        Signature signature =
                Signature.getInstance("Ed25519");

        signature.initVerify(publicKey);
        signature.update(data);

        return signature.verify(signatureBytes);
    }
}
