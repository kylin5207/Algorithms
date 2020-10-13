package unionFound;

import java.util.Scanner;

/**
 * ������ͨͼ�����ݽṹ
 * @author Kylin
 *
 */
public class UF {
	private int[] id; //����id
	private int count; //��������
	
	//һ��ʼ��N�����������Ų��ϵĺϲ��������������С
	public UF(int N){
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	/**
	 * ���ص�ǰ��ͨͼ�ķ�������
	 * @return
	 */
	public int count(){
		return count;
	}
	
	/**
	 * ����p���ڵķ�����ʶ��
	 * @param p
	 * @return
	 */
	public int find(int p){
		while(p != id[p]) {
			p = id[p];
		}
		return p;
	}
	
	/**
	 * ��p��q֮���һ������ 
	 * @param p
	 * @param q
	 */
	public void union(int p, int q){
		int pIDRoot = find(p);
		int qIDRoot = find(q);
		
		if(pIDRoot == qIDRoot){
			return;
		}
		
		id[pIDRoot] = qIDRoot;
		count--;
	}

	/**
	 * �ж�p��q�Ƿ�����
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected(int p, int q){
		return find(p) == find(q);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //���ýڵ�����
		int notNum = sc.nextInt(); //����������
		
		UF uf = new UF(N);
		
		for (int i = 0; i < notNum ; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(uf.connected(p, q)){
				continue;
			}
			uf.union(p, q);
		}
		System.out.println("��ͨͼ��������" + uf.count);
	}
}
