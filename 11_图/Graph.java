package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ͼ�����ݽṹ
 * @author Kylin
 *
 */
public class Graph {
	private final int V; //ͼ�Ķ�����
	private int E; //ͼ�ı���
	private List<List> adj; //����ߵ��б�
	
	public Graph(int v, int E, List<List> adj){
		this.V = v;
		this.E = E;
		this.adj = adj;
	}

	public int getE() {
		return E;
	}

	public void setE(int e) {
		E = e;
	}

	public List getAdj() {
		return adj;
	}

	public void setAdj(List adj) {
		this.adj = adj;
	}

	public int getV() {
		return V;
	}
	
	public void addEdge(int v, int w){
		List<Integer> edge = new ArrayList<Integer>();
		edge.add(v);
		edge.add(w);
		this.adj.add(edge);
	}
	
	public void showAdj(){
		for (List edge : adj) {
			System.out.println("[" + edge.get(0) + ", " + edge.get(1)+"]");		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����붥����");
		int V = sc.nextInt(); //������
		System.out.println("���������");
		int E = sc.nextInt();
		System.out.println("��������Ӧ�ߵĶ��㣬�ö��ŷָ�");
		List<List> list = new ArrayList<List>();
		for (int i = 0; i < E; i++) {
			List<Integer> edge = new ArrayList<Integer>();
			String e = sc.next();
			String[] es = e.split(",");
			int e1 = Integer.parseInt(es[0]);
			int e2 = Integer.parseInt(es[1]);
			edge.add(e1);
			edge.add(e2);
			list.add(edge);
		}
		
		Graph graph = new Graph(V, E, list);
		graph.showAdj();
		
	}
	
}
