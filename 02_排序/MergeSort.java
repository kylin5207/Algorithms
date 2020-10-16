package sort;
/**
 * �鲢����
 * ���������������ϲ���һ�������
 * 	�ݹ齫���ֳ�����ֱ�����֮�󽫽���ϲ�����
 * @author Kylin
 *
 */
public class MergeSort {
	
	/**
	 * ��������εĺϲ�
	 * @param a ԭ���� 
	 * @param r ����ϲ��������
	 * @param low ������ʼ���
	 * @param mid ��һ�����н��������
	 * @param high ���еĳ���
	 */
	public static void merge(int[] a, int[] r, int low, int mid, int high){
		int i, j, k;
		k = low;
		i = low;
		j = mid+1;
		//�Ƚ����������
		while(i <= mid && j <= high){
			if(a[i] <= a[j]){
				r[k++] = a[i++];
			}
			else{
				r[k++] = a[j++];
			}
		}
		while(i <= mid ){
			r[k++] = a[i++];
		}
		while(j <= high){
			r[k++] = a[j++];
		}
	}
	
	/**
	 * ��ɶ�·�ϲ��ĺ���
	 * @param a
	 * @param r
	 * @param n
	 * @param len
	 */
	public static void mergePass(int a[], int r[], int n, int len){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
