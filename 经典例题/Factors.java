package test3;

import java.util.Scanner;

/**
 * �����ֽ�
 * ����һ�����ݵ������ֽ�
 * ����8�ķֽ⣺2 2 2
 * ����17�ķֽ⣺17
 * @author Kylin
 *
 */
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long t = num;
		
		System.out.println(num + "�������ֽ�Ϊ��");
		
		for (long i = 2; i*i < t; i++) {
			while (t % i == 0){
				System.out.print(i + " ");
				t /= i;
			}
		}
		
	
		if(t > 1){
			System.out.println(t);
		}
		else{
			System.out.println();
		}
	}

}
