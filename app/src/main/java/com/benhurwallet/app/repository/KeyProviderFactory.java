package com.benhurwallet.app.repository;

public class KeyProviderFactory
{
    public static KeyProvider get() {
        return new KeyProviderJNIImpl();
    }
}
