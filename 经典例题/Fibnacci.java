package test4;

import java.util.Scanner;

/**
 * 쳲���������
 * @author Kylin
 *
 */
public class Fibnacci {

	/**
	 * �����õĵݹ飬�����������ã��ȽϷ�ʱ
	 * @param n
	 * @return
	 */
	public static int calculate(int n){
		if (n == 0 || n == 1){
			return 1;
		}
		else{
			return calculate(n-1) + calculate(n-2);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = Fibnacci.calculate(n);
		System.out.println("��" + n + "���µ�С���Ӹ���Ϊ" + num);
		
	}

}
