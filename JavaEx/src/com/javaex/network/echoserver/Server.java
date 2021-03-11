package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
		public static void main(String[] args) {
			//���� ����
			ServerSocket serverSocket = null;
			
			try {
				//���ε� - IP����
				serverSocket = new ServerSocket();
				InetSocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
				serverSocket.bind(ips);
				
				//���۸޽���
				System.out.println("<���� ����>");
				System.out.println("SERVER : [������ ��ٸ��ϴ�.]");
			
				//������
				Socket socket = serverSocket.accept();
				// Ŭ���̾�Ʈ ���� Ȯ��
				InetSocketAddress socketAddress = 
					(InetSocketAddress)socket.getRemoteSocketAddress();	//������ ������ �ּ�
				System.out.println("SERVER : [Ŭ���̾�Ʈ�� ����Ǿ����ϴ�]");
				System.out.println("    Ŭ���̾�Ʈ : " + socketAddress.getAddress()
											+ ":" + socketAddress.getPort());
				//��ó��
				 System.out.println("SERVER : [������ �����մϴ�]");
				 
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					serverSocket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}
}
