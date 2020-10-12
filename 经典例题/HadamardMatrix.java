package test3;

import java.util.Scanner;

/**
 * ���������
 * n�׹����������һ�����������������������������ж���n/2λ��ͬ�� 
 * �������Զ�����ƾ���������á���
 * ���磺
 * 		H��1���ǵ���Ϊtrue��1�׾���
 * 		����n> 1��H��2n��ʱͨ������H(n)���ĸ�������һ��������������ʾ��Ȼ�����½�n��n�ķ�ʽ��ת������Ŀ
 *     ���ճ���T����true��F����false����
 * @author Kylin
 *
 */

public class HadamardMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] Hadmard = new boolean[n][n];
		
		Hadmard[0][0] = true;
		for (int k = 1; k < n; k+=k) {
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					Hadmard[i+k][j] = Hadmard[i][j];
					Hadmard[i][j+k] = Hadmard[i][j];
					Hadmard[i+k][j+k] = !Hadmard[i][j];
				}
			}
		}
		
		//output
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(Hadmard[i][j]){
					System.out.print("T");
				}
				else{
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}

}
