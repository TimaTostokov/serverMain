package com.wintendor.messenger.server;

public class Server {
    private int port;
    private Server server;
    public Server(int port){
        this.port = port;
        new Server(port);
    }   
    public static void main(String[] args) {
        int port;
        if(args.length != 1){
            System.out.println("Usage: jar -jar program.jar [port]");
            System.exit(1);
        }
        port = Integer.parseInt(args[0]);
        new Server(port);
    }
}
