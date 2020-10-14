package sort;

import java.util.Arrays;
import java.util.Scanner;


/**
 * ð������
 * �Ӻ���ǰ�����ߴ�ǰ�������α������飬���������������ؼ��ֵĴ���������Ҫ��Ĳ�����ʱ��
 * �ͽ���������¼���н������������ؼ��ֽ����ƶ����������ݴ�ˮ�и�����һ����
 * 
 * @author Kylin
 *
 */
public class PopSort {

	public static void sort(int[] a){
		int t;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]){
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�����������������������
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();
		int[] array = RandomGenerator.generate(n, min, max);
		System.out.println("-----����ǰ-------");
		System.out.println(Arrays.toString(array));
		
		PopSort.sort(array);
		System.out.println("------�����------");
		System.out.println(Arrays.toString(array));
	}

}
