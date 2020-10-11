package search;

/**
 * ���ֲ��ҵ�ʵ�֣�
 * 
 * ǰ�᣺
 * 	    ��������
 * 
 * @author Kylin
 *
 */

public class BinarySearch {
	/**
	 * �������в����Ƿ����keyԪ��
	 * 	�������򷵻����±꣬���������򷵻�-1
	 * @param key
	 * @param array
	 * @return
	 */
	public static int rank(int key, int[] array){
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high){
			int mid = low + (high - low) / 2;
			if(key > array[mid]){
				low = mid + 1;
			}
			else if(key < array[mid]){
				high = mid - 1;
			}
			else{
				return mid;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 5, 10};
		System.out.println(BinarySearch.rank(2, array));
	}

}
