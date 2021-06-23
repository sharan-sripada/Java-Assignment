package assignment3;

import java.io.IOException;
import java.util.Scanner;
import java.net.*;

public class Ping {
    public void median(String ip) throws IOException {
        InetAddress ipAddress = InetAddress.getByName(ip);
        long currentTime = System.currentTimeMillis();
        boolean isPinged =ipAddress.isReachable(2000); // 2 seconds
        currentTime = System.currentTimeMillis() - currentTime;
        if(isPinged) {
            System.out.println("Pinged successfully. Median time: "+ currentTime+ " milliseconds");
        } else {
            System.out.println("Ping failed.");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String ip=scanner.nextLine();
        Ping ping=new Ping();
        ping.median(ip);
    }
}
