package org.example;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static String id;
    private static Scanner scanner;
    private static PrintWriter writer;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("Connected to server.");

            scanner = new Scanner(System.in);
            writer = new PrintWriter(socket.getOutputStream(), true);

            System.out.print("Enter your ID: ");
            id = scanner.nextLine();

            Thread inputThread = new Thread(() -> {
                while (true) {
                    String receiverId = scanner.nextLine();
                    String message = id + ":" + receiverId + ":" + scanner.nextLine();
                    writer.println(message);
                }
            });
            inputThread.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String message = reader.readLine();
                if (message == null) {
                    break;
                }
                String[] parts = message.split(":");
                if (parts[1].equals(id)) {
                    System.out.println("Message from " + parts[0] + ": " + parts[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
