package test3;

import java.util.Scanner;

/**
 * ���������ĸ���
 * @author Kylin
 *
 */
public class PrimeSieve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//�������¼�µ�ǰ�����Ƿ�Ϊ����
		boolean[] isPrime = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		
//		num���ڴ洢��������
		int num = 0;
		for (int factor = 2; factor*factor <= n; factor++) {
			if(!isPrime[factor]){
				continue;
			}
			for (int j = 2; factor*j <= n; j++) {
	            isPrime[factor*j] = false;
	        }
		}
		
//		System.out.println("��" + num + "�������� �ֱ��ǣ�");
		for (int i = 2; i < isPrime.length; i++) {
			if(isPrime[i]){
				System.out.print(i + " ");
				num++;
			}
		}
		System.out.println("��" + num + "������");
	}
}
		
