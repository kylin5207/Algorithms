package test4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ̰���㷨
 * 
 * �һ���Ǯ
 * �û�������Ҫ�һص�Ǯ���������һط�����
 * @author Kylin
 *
 */
public class Changes {

	//�����Է�Ϊ��λ����Ǯ
	static int value[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10};
	static int nums[];
	public static void exchange(int n){
		int i;
		nums = new int[10];
		for (i = 0; i < 10; i++) {
			if(n >= value[i]){
				//�ҵ���nС����ֵ
				break;
			}
		}
		
		while(n > 0 && i < 10){
			if(n >= value[i]){
				n -= value[i];
				nums[i]++;
			}
			else if(n < 10 && n >= 5){
				nums[9]++;
				break;
			}
			else{
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		int tMoney = (int)(money*100); //ת����λΪ��
		exchange(tMoney);
		for (int i = 0; i < 10; i++) {
			if(Changes.nums[i] > 0){
				System.out.printf("%6.2f: %d��\n", Changes.value[i]/100.0, Changes.nums[i]);
			}
		}
	}
}
