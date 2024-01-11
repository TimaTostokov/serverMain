package com.wintendor.messenger.server;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUs {
    private int port;
    private DatagramSocket socket;
    private Thread ServerRun, manage, receive;
    private boolean Running = false;

    public ServerUs(int port) {
        this.port = port;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        ServerRun = new Thread(() -> {
            Running = true;
            manage();
            receive();

        }, "ServerRun");
    }

    private void manage() {
        manage = new Thread(() -> {
            while (Running) {
                //TODO(winterdor): manage the clients
            }
        });
        manage.start();
    }

    private void receive() {
        receive = new Thread(() -> {
            while (Running) {
                //TODO(winterdor): receive
            }
        });
        receive.start();
    }
}
