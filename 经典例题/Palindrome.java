package test3;

import java.util.Scanner;

/**
 * �жϻ����ַ���
 * @author Kylin
 *
 */
public class Palindrome {
	
	public static boolean isPalindrome(String s){
		int num = s.length();
		
		for (int i = 0; i < num / 2; i++) {
			if(s.charAt(i) != s.charAt(num - 1 - i)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(Palindrome.isPalindrome(s)){
			System.out.println(s + "�ǻ����ַ���");
		}
		else{

			System.out.println(s + "���ǻ����ַ���");
		}
	}

}
