package ru.geekbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8088)) {

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");

                BufferedReader input = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter output = new PrintWriter(socket.getOutputStream());

                while (!input.ready());

                while (input.ready()) {
                    System.out.println(input.readLine());
                }

                output.println("HTTP/1.1 200 OK");
                output.println("Content-Type: text/html; lang=ru");
                output.println();
                output.println("<h1>Шалом, православные!</h1>");
                output.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}