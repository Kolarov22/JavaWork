package ex1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TCPServerSimple {
	public static void main(String[] args) {
		DataInputStream in = null;
		DataOutputStream out = null;
		Socket socket = null;
		ServerSocket serverSocket = null;
		try {
			// listen on port 2999
			serverSocket = new ServerSocket(2999);
			socket = serverSocket.accept();
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			System.out.println("Connection accepted: " + socket.getInetAddress().getHostName());
			out.flush();
			String s;

			//out.writeUTF("What is your birthday? yyyy-MM-dd format");
			//out.flush();
			//incoming = in.readUTF();
			//System.out.println(incoming + " was received");
			//DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//LocalDate inputDate=null;
			boolean fail = false;
			while (!fail) {

					s = in.readUTF();
					if (s.equals("END")) {
							System.out.println("Connection ended");
							fail = true;
							break;
					} else {
						out.writeUTF(s);
						out.flush();
						System.out.println(s);
					}
				}




		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			try{
				out.close();
				in.close();
				socket.close();
				serverSocket.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}

	}
}


//			try {
//				inputDate = LocalDate.parse(incoming, dateformat);
//			} catch (DateTimeParseException ex) {
//				out.writeUTF("Wrong format!!!");
//				out.flush();
//				fail=true;
//			}
//			if(!fail) {
//			LocalDate today = LocalDate.now();
//			if (today.getMonth().equals(inputDate.getMonth()) && today.getDayOfMonth() == inputDate.getDayOfMonth())
//				out.writeUTF("Happy birthday!");
//			else
//				out.writeUTF("Not today!");
//			out.flush();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				out.close();
//				in.close();
//				socket.close();
//				serverSocket.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

