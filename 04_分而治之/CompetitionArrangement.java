package test4;

import java.util.Scanner;

/**
 * �����ճ̰��ţ�
 * �ص㿼�죺���η�
 * (1)�ֽ⣺��Ҫ�������⻮�ֳ����ɸ���ģ��С��ͬ������
 * (2)��⣺�������⻮�ֵ��㹻Сʱ���ý̼򵥵ķ������
 * (3)�ϲ�������������Ҫ�󣬽�������Ľ����ϲ����������ս�
 * @author Kylin
 *
 */
public class CompetitionArrangement {

	int[][] table;
	
	
	public CompetitionArrangement(int n) {
		//Ϊ�˱��ڴ���0��λ�ò���
		this.table = new int[n+1][n+1];
	}

	/**
	 * �ճ̰��ţ���k��ѡ�ֿ�ʼ������nλѡ�ֵ��ճ̣�
	 * @param k ��Ҫ���ŵ�ѡ�ֵ���ʼ���
	 * @param n ѡ������
	 */
	public void gamecal(int k, int n){
		//ֱ�Ӱ���
		if(n == 2){
			table[k][1] = k;
			table[k][2] = k+1;
			table[k+1][1] = k+1;
			table[k+1][2] = k;
		}
		else{
			//�������Ͻǵ�����
			//���η�����Ҫ����
			gamecal(k,n/2); //ǰn/2����
			gamecal(k+n/2, n/2); //��n/2����
			
			//���ϲ�
			//���Ͻ�
			for (int i = k; i < k + n/2; i++) {
				for (int j = n/2+1 ; j <= n; j++) {
					table[i][j] = table[i+n/2][j-n/2];
				}
			}

			//���½�
			for (int i = k+n/2; i < k+n; i++) {
				for (int j = n/2+1; j <= n; j++) {
					table[i][j] = table[i-n/2][j-n/2];
				}
			}
			
			
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int competitorNum = sc.nextInt(); //��������
			int i;
			int j = 1;
			for(i = 2; i < 8; i++) {
				j = j * 2;
				if(j == competitorNum){
					break;
				}
			}
			
			if(i >= 8){
				System.out.println("����ѡ����������Ϊ2���������ݣ��Ҳ�����64");
			}
			else{
				CompetitionArrangement c = new CompetitionArrangement(competitorNum);
				c.gamecal(1, competitorNum);
				
				for (int day = 1; day <= competitorNum; day++) {
					System.out.printf("%2d��  ", day);
				}
				System.out.println();
				
				for (int p = 1; p <= competitorNum; p++) {
					for (int q = 1; q <= competitorNum; q++) {
						System.out.printf("%3d ", c.table[p][q]);
					}
					System.out.println();
				}
			}

	}

}
