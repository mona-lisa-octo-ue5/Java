package com.ls.aip.util;

import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class LSAipClientConfiguration {
    private int connectionTimeoutMillis;
    private int socketTimeoutMills;
    private Proxy proxy;
    public LSAipClientConfiguration() {
        this.connectionTimeoutMillis=0;
        this.socketTimeoutMills=0;
        this.proxy=Proxy.NO_PROXY;
    }
    public LSAipClientConfiguration(int connectionTimeoutMillis, int socketTimeoutMills, Proxy proxy) {
        this.connectionTimeoutMillis=connectionTimeoutMillis;
        this.socketTimeoutMills=socketTimeoutMills;
        this.proxy=proxy;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public void setConnectionTimeoutMillis(int connectionTimeoutMillis) {
        this.connectionTimeoutMillis = connectionTimeoutMillis;
    }

    public int getSocketTimeoutMills() {
        return this.socketTimeoutMills;
    }

    public void setSocketTimeoutMills(int socketTimeoutMills) {
        this.socketTimeoutMills = socketTimeoutMills;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public void setProxy(String host, int port, Type type){
        SocketAddress addr = new InetSocketAddress(host, port);
        this.proxy=new Proxy(type, addr);
    }
}
