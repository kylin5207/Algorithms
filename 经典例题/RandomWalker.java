package test3;

import java.util.Scanner;

/**
 * ����n����������ߴ�n��n��������Ŀ�ʼ��һ���ƶ�һ�����裬��ѡ����ÿ������������ȵĸ����������ң����ϻ������ƶ��� 
 * ��дһ����������������������е�Ԫ��Ҫ�߶��ٲ���
 * @author Kylin
 *
 */
public class RandomWalker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int cellsToVisit = n*n; //ʣ��Ҫ���ʵĵ�Ԫ��
		int steps = 0; //�����߹��Ĳ���
		double r;
		boolean[][] visited = new boolean[n][n]; //�ж��Ƿ��߹�
		
		//���е㿪ʼ
		for(int i = 0; i < n; i++){
			x[i] = n / 2;
			y[i] = n / 2;
		}
		
		visited[n/2][n/2] = true;
		cellsToVisit--;
		
		while(cellsToVisit > 0){
			steps++;
			
			for (int i = 0; i < n; i++) {
				r = Math.random();
				
				if(r <= 0.25){
					x[i]--;
				}
				else if(r <= 0.5){
					x[i]++;
				}
				else if(r <= 0.75){
					y[i]--;
				}
				else{
					y[i]++;
				}
				
				if(x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]){
					cellsToVisit--;
					visited[x[i]][y[i]] = true;
				}
			}
		}
		
		System.out.println("Need " + steps + "!");
	}

}
