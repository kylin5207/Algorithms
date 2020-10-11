package test3;

import java.util.Scanner;

/**
 * �ж��Ƿ�Ϊ����
 * @author Kylin
 *
 */
public class Prime {
	/**
	 * �ж�num�Ƿ�Ϊһ������
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num){
		if(num < 2){
			return false;
		}
		for (int i = 2; i*i <= num; i++) {
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean flag = Prime.isPrime(n);
		if(flag){
			System.out.println(n + "������");
		}
		else{
			System.out.println(n + "��������");
		}
		
	}

}
