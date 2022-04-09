package cn.dustchat;

import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) {
        ClientServer clientServer = new ClientServer(new InetSocketAddress(8888));
        clientServer.start();
    }
}
