package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
		//6���� �ߺ����� ���� ��������(1~45)
		int[] nums = new int[6];
		int idx = 0; //�ε��� ����
		
		while (idx < nums.length) {
			//���� �߻�
			int choice = (int)(Math.random() * 45);
					//�ߺ� ������ üũ
			boolean isDuplicated = false;
			
			if(idx != 0) {
				//�ߺ�üũ
				for(int i = 0; i < idx; i++) {
					//���� �� üũ
					if(nums[i] == choice) {
						//�ߺ�
					isDuplicated = true;
					break;
					
					}
				}
			
			}
			
		if(!isDuplicated) {
			// �ߺ����� ���� �� �ڵ� ����
			nums[idx] = choice;
			idx++;
		}
		}//���� ����
		for(int value : nums) {
			System.out.println(value + " ");
		}
			System.out.println();
	}

}
