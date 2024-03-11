package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientSimple {
	public static void main(String[] args) {
		DataInputStream in = null;
		DataOutputStream out = null;
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 2999);
			out = new DataOutputStream(socket.getOutputStream());
			out.flush();
			System.out.println("socket=  " + socket.getInetAddress().getHostName());
			out.flush();
			in = new DataInputStream(socket.getInputStream());
			//System.out.println(in.readUTF());
			Scanner scan = new Scanner(System.in);
			for(int i=0;i<10;i++){
				String s = "I am " + i;
				out.writeUTF(s);
				out.flush();
				s = in.readUTF();
				System.out.println(s);
			}

			out.writeUTF("END");
			out.flush();


			scan.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}