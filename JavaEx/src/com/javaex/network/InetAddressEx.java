package com.javaex.network;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressEx {
		public static void main(String[] args) {
			printLocalIp();
		//���� �ּҸ� Ȯ��
			printServerIp("www.naver.com");
			printServerIp("www.google.com");
		}
		
		private static void printServerIp(String hostname) {
			try {
				InetAddress[] adrs = InetAddress.getAllByName(hostname);
				for(InetAddress remote : adrs) {
					System.out.println(hostname + " : IP : " + remote.getHostAddress();
				}catch (UnknownHostException e) {
					e.printStackTrace();
				}
			}
		}
		//�� ��ǻ�Ͱ� �Ҵ� ���� ipȮ��(localhost)
		private static void printLocalIp() {
			try {
				//��ip�ּ� Ȯ��
				InetAddress local = InetAddress.getLocalHostAddress();
				System.out.println("Local IP : " + local.getHostAddress());
			}catch (UnkownHostException e) {
				e.printStackTrace();
			}
		}
}
