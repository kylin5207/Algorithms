package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��������
 * ʹ�÷��β��԰Ѵ������������зֳ����������У�
 * 	 1. ���ȴ�����������һ��Ԫ�أ���Ԫ�س�Ϊ����׼��
 *   2. ɨ��һ�����У������бȡ���׼��С��Ԫ���Ż�׼ǰ�棬���бȡ���׼���Ԫ�أ����ڻ�׼����
 *   3. ͨ���ݹ飬���������л���Ϊ��С�����У�ֱ����С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������
 * @author Kylin
 *
 */
public class QuickSort {

	/**
	 * ���ݷָ��
	 * @param a
	 * @param left
	 * @param right
	 * @return
	 */
	public static int partion(int[] a, int left, int right){
		int pivot = a[left]; //�趨�зֵ㣬������Ԫ��
		while(left < right){
			while(left < right && a[right] >= pivot){
				//���������ҵ��Ȼ�׼С������
				right--;
			}
			a[left] = a[right];
			while(left < right && a[left] <= pivot){
				//���������ҵ��Ȼ�׼�������
				left++;
			}
			a[right] = a[left];
		}
		//����׼Ԫ�ط��õ�������
		a[left] = pivot;
		return left; //���ػ�׼Ԫ���������ڵ�λ��
	}
	
	/**
	 * ������
	 * @param a
	 * @param left
	 * @param right
	 */
	public static void sort(int a[], int left, int right){
		int i;
		if(left < right){
			i = partion(a, left, right);
			sort(a, left, i-1);
			sort(a, i+1, right);
		}
	}
	
	public static void sort(int a[]){
		sort(a, 0, a.length-1);
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
		
		QuickSort.sort(array);
		System.out.println("------�����------");
		System.out.println(Arrays.toString(array));

	}

}
