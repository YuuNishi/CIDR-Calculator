package org.Calculator;

public class Ip {
    private int[] address;
    private int prefix;

    public Ip(int[] address , int prefix){
        this.address = address;
        this.prefix = prefix;
    }
    public int[] getAddress() {
        return address;
    }

    public void setAddress(int[] address) {
        this.address = address;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }
}
