package com.recluit.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client{
public void establishConnection(){
try{
Socket s = new Socket("0.0.0.0", 3550);
InputStreamReader stream = new InputStreamReader(s.getInputStream());
BufferedReader reader = new BufferedReader(stream);
String str = reader.readLine();
System.out.println(" text received from client ;" + str);

PrintWriter pw = new PrintWriter(s.getOutputStream()); //Send info to the server
pw.println("1234567");

pw.flush();
pw.close();

reader.close();
}catch(IOException e){
e.printStackTrace();
}
}

public static void main(String[] args){
new Client().establishConnection();
}
}