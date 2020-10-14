package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �����������
 * �������һ������
 * @author Kylin
 *
 */
public class RandomGenerator {

	public static int[] generate(int n, int min, int max){
		int[] num = new int[n];
		int r;
		
		for (int i = 0; i < n; i++) {
			r =(int)((max - min + 1) * Math.random()) + min;
			num[i] = r;
		}
		
		return num;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		int[] array = RandomGenerator.generate(n, min, max);
		System.out.println(Arrays.toString(array));
	}

}
