package com.javaex.collection.hash;

public class ClassRoom {
		//�ʵ�
	private String subject;
	private String roomName;
	
	//������
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	public ClassRoom(String subject, String rommName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public int hashCode() {
		// ���� : ������ ������ ���ǽ��� �ٸ� �� �ִ�
		//���� hashCode�� ������ �ĺ��ڰ� ���� ������ ����
		return subject.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			// �ٿ� ĳ���� ����
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject);
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	
	
	
}
