package test3;

import java.util.Scanner;

/**
 * �ж�����
 * �ܱ�4�����Ҳ��ܱ�100�������꣬������400�ı���
 * @author Kylin
 *
 */
public class LeapYear {

	/**
	 * 
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year){
		if(year % 400 == 0){
			return true;
		}
		else if(year % 4 == 0 && year % 100 != 0){
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
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(LeapYear.isLeapYear(year));
		
		
	}

}
