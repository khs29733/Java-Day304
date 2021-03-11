package com.javaex.IO;

import java.io.File;

//File Ŭ����
//����, ���͸��� ����

public class FileClass {
	//���� ������Ʈ ���� ��Ʈ ���͸� ��ġ
	private static String rootPath = System.getProperty("user.dir" + "//files//");
	
	public static void main(String[] args) {
	//File ��ü ����
		File root = new File(rootPath);
		//������ ���� �����ϴ��� Ȯ��
		System.out.println(rootPath + ":" + root.exists());// ������ ���� ����?
		//���� ���͸��� �������� ������
		if(!root.exists()) {
			root.mkdirs();
		}
		
		printInfo(root);
		
		//���ο� ���� �����ϰ��� �� ���
		File file = new File(rootPath + "\\myFile.txt");
		System.out.println("=> myFile.txt����");
		if(!file.exists()) {//������ ������
			file.createNewFile();	//���� ���� ����
		}catch(IOException e) {
			System.err.println("������ ������ ���߽��ϴ�!");
		}
	}
	printInfo(root);
	
	//���ϻ���
	System.out.println("=> myFile.txt ����");
	file.delete();
	
	printInfo(root);
	private static void printInfo(File file) {
		System.out.println("----------");
		
		//file -> directory -> ���� ��� ���
		//-> file - > ���� ���� ���
		if(file.isDirectory()) {
			("Directory : " + file.getName());
			//���ϸ��
			File[] files = file.listFiles();
			//���� ��� ���
			for(File f : files) {
				System.out.print(f.isDirectory() ? "d" : "f");
				System.out.println(f.getName() + " : " + f.length());
			}
		}else {
			System.out.println("File : " + file.getName() + ":" + file.length());
		}
		System.out.println("----------");
	}
}
