package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
	Socket socket = null;
			
			try {
				//���� ��ü ����
				socket = new Socket();
				
				//���۸޽���
				System.out.println("<Ŭ���̾�Ʈ ����>");
				System.out.println("CLIENT : ������ ��û�մϴ�");
				
				//���ӽõ�
				InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
				socket.connect(remote);
				
				//���� ����
				System.out.println("CLIENT : [������ ����Ǿ����ϴ�]");
				
				//��ó��
				System.out.println("<Ŭ���̾�Ʈ ����>");
			}catch(ConnectException e) {
				System.err.println("[������ �źεǾ����ϴ�]");
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			
}
}
