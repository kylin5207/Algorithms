package test3;

import java.util.Scanner;

/**
 * ��һ���������ö����Ʊ�ʾ����ת��Ϊһ��String����
 * @author Kylin
 *
 */

public class NumToBinaryString {

	/**
	 * �Զ��巽��ʵ�ֶ����Ʊ�ʾ
	 * @param num
	 * @return
	 */
	public static String toBinaryString(int num){
		String s = "";
		for(int i = num; i > 0; i /= 2){
			s = (i%2) + s;
		}
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(NumToBinaryString.toBinaryString(num));
//		�Զ���ʵ��
		
		
//		ʹ��Integer�����÷���ʵ��
//		System.out.println(Integer.toBinaryString(num));
	}

}
