
public class ArrayEx {
		public static void main(String[] args) {
	
				//arrayBasic();
			//twoDimens();
			//arrayCopyFor();
			arrayCopySystem();
		}
		//�迭 ���� (system��ü �̿�)
		private static void arrayCopySystem() {
			int source[]= {1, 2, 3};
			int target[] = new int[10];
			
			System.arraycopy(source, //���� �迭
					0,	//���� ���� ��ġ
					target, //Ÿ�� �迭
					0, //Ÿ�� �迭�� ���� �ε���
					source.length); //Ÿ�� �迭�� ���� �ε���
			
			for(int i = 0; i < target.length; i++) {
				System.out.println(target[i]+"\t");
			}
			System.out.println();
			//Enhanced for��
			for(int value : target) {
				System.out.println(value + "\t");
				
			}
			System.out.println();
		}
		//�迭 ����
		//system.arraycopy�� �迭 ���� ����
		private static void arrayCopyFor() {
			//�迭�� ũ�� ������ �Ұ�
			//�߰� ������ Ȯ���Ϸ��� �� �迭�� ����� ���� ��Ұ� ����
			int source[] = {1, 2, 3};
			int target[] = new int [10]; //10�� �迭
			
			//����
			for(int i = 0; i < source.length; i++) {
				target[i] = source[i];
			}
			//��� 
			for(int i = 0; i < target.length; i++) {
				System.out.println(target[i] + "");
			}
			System.out.println();
			
			
		}
			//2�����迭
			private static void twoDimens() {
				int[][] twoDimens = new int[5][]
						
						//�⺻ �����Ͱ� ���� ����� �ʱ�ȭ
						int table[][] = {
								{1, 2, 3, 4, 5,},
								{2, 3, 4, 5, 6,},
								{3, 4, 5, 6, 7,}
						};
				System.out.println("length of table :" + table.length);
				System.out.println("length of table[0] :" + table[0].length);
				
				//table �迭�� ��� ���� �ջ�
				int total = 0;
				for (int row = 0; row < table.length; row++) {
					//�࿡ ����
					for(int col = 0; col < table[row].length; col++) {
						System.out.print(table[row][col] + "\t");
						total += table[row][col];
					}
					System.out.println();
				}
				System.out.println("�迭����� �� ��" + total);
			}
		private static void arrayBasic() {
				//�迭�� ����
			
			String[] names; //Ÿ��[] �ĺ���
			int scores[]; //Ÿ�� �ĺ���[]
			
			//�ʱ�ȭ
			names = new String[] {
					"ȫ�浿",
					"����",
					"�Ӳ���",
					"����ġ"
					
			};
			System.out.println(names);
			
			scores = new int[4]; //4���� ������ ���� �� �迭
			//������ �����Ϸ��� �ε��� ���
			System.out.println("Length of scores" + scores.length);
			scores[0] = 80;
			scores[1] = 90;
			scores[2] = 75;
			scores[3] = 95;
		//	scores[4] = 100;//������ ��� ������ �Ұ�
			
		//	System.out.println(scores);
			
			float heights[] = {
					178.5f,
					185.0f,
					170.5f,
					188.0f
			};
			
			for(int i = 0; i<names.length; i++) {
				//�ε��� ���� : 0~length -1
				System.out.printf("%s(%.2f) : score = %d%n",
						names[i], heights[i], scores[i]);
			}
			int[] scores2 = scores;
			System.out.println("scores�� scores2�� ���� ��ü?" + (scores == scores2 ));
			
			socres2[3] = 100;
			
			for(int i = 0; i < scores.length; i++) {
				System.out.println(scores[i] + "\t");
			
			}
				System.out.println();
			
			
}
}