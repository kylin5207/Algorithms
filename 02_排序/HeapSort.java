package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ������
 * 1. ���������й���һ���ѣ���������������ѡ��󶥶ѻ�С����
 *    ����һ����ô󶥶ѣ�����һ�����С����
 * 2. ���Ѷ�Ԫ����ĩβԪ�ؽ����������Ԫ�س���ĩ��
 * 3. �����ṹ��ʹ������Ѷ���
 * 
 * @author Kylin
 *
 */
public class HeapSort {
	
	/**
	 * ������Ѷ�
	 * @param a ����
	 * @param len ���鳤��
	 */
	public static void buildMaxHeap(int[] a, int len){
		//�����һ����Ҷ�ڵ���ǰ�����������ڵ�
		for (int i = (int)Math.floor(len/2) - 1; i >= 0; i--) {
			heapify(a, i, len);
		}
	}
	
	/**
	 * ��������
	 * @param a
	 * @param i
	 * @param len
	 */
	public static void heapify(int[] a, int i, int len){
		//���ݶѵ����ʣ��ҳ������ҽڵ������
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		//Ĭ�ϵ�ǰ�ڵ�ʹ���ֵ
		int largestIndex = i;
		
		if(left < len && a[left] > a[largestIndex]){
			//�����ڵ��ֵ�ȵ�ǰֵ�������largestIndex
			largestIndex = left;
		}
		
		if(right < len && a[right] > a[largestIndex]){
			largestIndex = right;
		}
		
		if(largestIndex != i){
			//�жϵ�ǰ�ڵ��Ƿ����仯����������仯���͵����ڵ�˳��
			swap(a, i, largestIndex);
			//���µ����ڵ�˳��
			heapify(a, largestIndex, len);
		}
	}
	
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * �������ʵ��
	 * @param a
	 * @param n
	 */
	public static void sort(int a[]){
		int len = a.length;
		
		//���ȹ����Ѷ�
		buildMaxHeap(a, len);
		
		//�����Ѷ��͵�ǰĩβ�Ľڵ㣬���ô�Ѷ�
		for (int i = len-1; i > 0; i--) {
			swap(a, 0, i);
			len--;
			heapify(a, 0, len);
		}
	}
	
	public static void main(String[] args) {
		//�����������������������
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();
		int[] array = RandomGenerator.generate(n, min, max);
		System.out.println("-----����ǰ-------");
		System.out.println(Arrays.toString(array));
		
		HeapSort.sort(array);
		System.out.println("------�����------");
		System.out.println(Arrays.toString(array));
	}

}
