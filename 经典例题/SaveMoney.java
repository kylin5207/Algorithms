package test4;

import java.util.Scanner;

/**
 * ���ֵ���Ǯ֮·���������ȡ
 * ������ÿ��������1000�� �����������ڵ�48���µ�ʱ��������ϢҪȡ1000Ԫ����ô�������Ҫ�������Ǯ��
 * �ؼ�������
 * @author Kylin
 *
 */
public class SaveMoney {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������е�������Ϊ1.71%
		double ratio = 0.0171;
		double[] moneylist = new double[49];
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		moneylist[48] = (double) money;
		
		for(int i = 47; i >= 0; i--){
			moneylist[i] = (moneylist[i+1]+money)/(1 + ratio/12);
		}
		
		for (int i = 0; i < moneylist.length; i++) {
			System.out.println("��" + i + "���µ�ǮΪ" + moneylist[i]);
		}
		
	}

}
