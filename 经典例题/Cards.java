package test3;

import java.util.Scanner;

/**
 * ����n�ֿ�Ƭ���ͣ�������Ҫ�������Ƭ����
 * Ҫ��֤ÿһ�ֿ�Ƭ������1��
 * (��Ҫ����Math.random()��ʹ�ã�����һ��[0,1)�������)
 * @author ������
 *
 */
public class Cards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		type���ڴ洢��Ƭ����
		int type = sc.nextInt();
		boolean[] isCollected = new boolean[type]; //��Ƭ�Ƿ��Ѿ����ռ�
		int count = 0; //�ռ��Ŀ�����
		int distinct = 0;
		
		/**
		 * �������������һ����Ƭ���ж����Ƿ��ռ���
		 */
		while(distinct < type){
			int value = (int) (Math.random() * type);
			count ++;
			if(!isCollected[value]){
				distinct++;
				isCollected[value] = true;
			}
		}
		
		System.out.println(count);
	}

}
