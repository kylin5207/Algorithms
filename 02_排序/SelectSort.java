package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ѡ������
 * 	��n����¼����ɨ�裬ѡ����С�ļ�¼�����������������ʣ�µ�n-1�ļ�¼��ɨ�裬ѡ����С�ļ�¼����
 *  ��������Ϊn�Σ�������������أ��Ƚϴ���N2/2
 * @author Kylin 
 *
 */
public class SelectSort {
	public static void sort(int[] a){
		int t, min;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]){
					min = j;
				}
			}
			t = a[i];
			a[i] = a[min];
			a[min] = t;
			
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
		
		SelectSort.sort(array);
		System.out.println("------�����------");
		System.out.println(Arrays.toString(array));

	}

}
