package com.javaex.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import org.omg.CORBA.SystemException;

public class ExceptionEx {
		public static void main(String[] args) {
//			arithExceptionEx();
//			arrayExceptionEx();
//			nullPointerExceptionEx();
			throwsExceptEx();
			System.out.println("End of Code!");
		}
		private static void throwsExceptEx() {
			// ȣ��� �޼��� ������ �߻��� ���ܴ� ������
			//ȣ���� �޼��� ������ ����ó���� ���ִ°��� ����
			
			ThrowsExcept except = new ThrowsExcept();
			//checked ���� ó�� ����
			//			try {
//			except.executeChecked();
//		}catch(IOException e) {
//			System.err.println("ȣ��� �޼��忡�� checked ���� �߻�");
//			System.err.println("�޽��� : " + e.getMessage());
//		}
			//unchecked ���� ó�� ����
			try {
			//	except.executeRuntime();{
					except.divide(100, 0);		
			}catch (CustomArithmeticException e) {
				System.err.println("�޽��� : " + e.getmessage());
				System.err.println("���������� �� : " + e.getNum2());
				}catch (RuntimeException e) {
					//ȣ��� �޼��� ������ �߻��� ���ܸ� �̰����� ���� ó��
						System.err.println("ȣ��� �޼��忡�� unchecked ���� �߻�");
						System.err.println("�޽��� : " + e.getMessage());
				}catch (Exception e) {
					//�������� �� �ִ� ���ܸ� ���� �������� Exception catch
					e.printStackTrace();
			}finally{
				System.out.println("���� ó�� �Ϸ�");
			}
		}
		private static void nullPointerExceptionEx() {
			//���� ���ϰ�, ���� ������ ����
			String str = new String("Hello");
			
			str = null; //������ ����
			try {
			System.out.println(str.toString());
			}catch (NullPointerException e) {
				System.err.println("���� �޼��� : " + e.getMessage());
				System.err.println("���Դϴ�!");
			}
		}
		private static void arrayExceptionEx() {
			int[] intArray = new int[] {3, 6, 9};
			
			try {
			System.out.println(intArray[3]);	//ArrayExceptionEx
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("�����޼��� : " + e.getMessage());
			System.err.println("�߻��� ���� : " + e.getClass().getSimpleName());
		}
			//finally ����� ���� ���� �ִ�
		}
		
		private static void arithExceptionEx() {
			//Ű����κ��� ������ �Է�
			//100�� �Է¹��� ���� ���� ���ô�
			double result = 0;
			int num;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ �Է��ϼ��� : ");
			
			try {
			//���� �߻� ���� �ڵ�
			num = scanner.nextInt();
			result = 100 / num;
			}catch (InputMismatchException e) {
				System.err.println("������ �ƴմϴ�");
			}catch(ArithmeticException e) {
				//��ü���� ���ܸ� ���ʿ�
				System.err.println("0���δ� ���� �� �����");
				System.err.println("�޽���" + e.getMessage());
			} catch (Exception e ) {	//��� ���� ó���� ���� �ֻ��� ���� Ŭ����
				//��ü���� ���� ó�� �� ���� ���ܵ�
				e.printStackTrace();		//���� �ڵ� ��ü�� ���
			}finally {
				System.out.println("Finally");	//���� �߻�
			}
			
			System.out.println("��� : " + result);
			scanner.close();
		
		}
		
	
		}
		
}
