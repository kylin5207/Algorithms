package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ϣ������
 * ���������һ�ָĽ��㷨������˼�룺ʹ������������Ϊh��Ԫ�ض��������
 * ����Ҫ��������л���Ϊ���ɸ���С�����У�����Щ���н���ֱ�Ӳ�������ͨ�������Ĳ�����ʹ
 * ��Ҫ��������л������������ʹ��һ��ֱ�Ӳ�������
 * @author Kylin
 *
 */
public class ShellSort {

	/**
	 * ��Ҫ���������Ԫ��
	 * @param a
	 */
	public static void sort(int a[]){
		int n = a.length;
		int h = n/2; //������ʼΪ���е�һ��
		int x, j;
		while(h >= 1){
			//�������Ϊh����
			for (int i = h; i < n; i++) {
				x = a[i]; //��ȡ�����е���һ������
				j = i-h; //λ��ǰ��j��Ԫ�ص�����
				while(j >= 0 && a[j] > x){
					a[j+h] = a[j];
					j = j-h;
				}
				a[j+h] = x;
			}
			h /= 2; //��������һ��
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
		
		ShellSort.sort(array);
		System.out.println("------�����------");
		System.out.println(Arrays.toString(array));

	}

}
