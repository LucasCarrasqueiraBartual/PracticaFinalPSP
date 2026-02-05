package utils;

import java.io.Serializable;

public class packet implements Serializable{
    byte[] message;
    byte[] hash;
    public packet(byte[] m, byte[] k){
        message = m;
        hash = k;
    }
}
