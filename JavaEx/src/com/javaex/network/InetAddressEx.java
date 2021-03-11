package com.javaex.network;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressEx {
		public static void main(String[] args) {
			printLocalIp();
		//서버 주소를 확인
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
		//내 컴퓨터가 할당 받은 ip확인(localhost)
		private static void printLocalIp() {
			try {
				//내ip주소 확인
				InetAddress local = InetAddress.getLocalHostAddress();
				System.out.println("Local IP : " + local.getHostAddress());
			}catch (UnkownHostException e) {
				e.printStackTrace();
			}
		}
}
