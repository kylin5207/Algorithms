package test3;

import java.util.Scanner;

/**
 * �ػ���λ������ַ���s�е��ַ�ѭ���ƶ�����λ��֮���ܵõ���һ���ַ���t��s�ͱ���Ϊt�Ļػ���λ
 * ��д���򣬼��������ַ���s��t�Ƿ�Ϊ�ػ���λ
 * @author Kylin
 *
 */
public class Circular {

	public static boolean isCircular(String str1, String str2){
		String s = str1 + str1;
		if(s.indexOf(str2) > -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(Circular.isCircular(str1, str2));
	}

}
