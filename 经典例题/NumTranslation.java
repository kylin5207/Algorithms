package test4;

import java.util.Scanner;

/**
 * ����ת��
 * @author Kylin
 *
 */
public class NumTranslation {

	public static void translate(int n, int base){
		int c;
		if(n == 0){
			System.out.println();
			return;
		}
		else{
			c = n % base;
			translate(n/base, base);
			System.out.print(c);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫת��������");
		int n = sc.nextInt();
		System.out.println("������ת���Ľ��ƣ�");
		int base = sc.nextInt();
		
		System.out.println("ת�������");
		NumTranslation.translate(n, base);
	}

}
