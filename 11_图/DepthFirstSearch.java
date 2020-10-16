package graph;

import java.util.List;

/**
 * ����������������Թ�����
 * 	�����Թ��е�����ͨ�������˸о��е���ջ��
 * 	1. ѡ��һ��û�б�ǹ���ͨ���� Ȼ����һ�����Ӽ�¼
 *  2. ������е�һ��·����·�ں�ͨ����
 *  3. ������һ����ǹ���·�ڵ�ʱ�򣬻��˵��ϸ�·��
 *  4. �����˵���·������·���ߵ�ʱ�򣬼�������
 *  ���У����Ӽ�¼�����߹���·���������֤���ǲ������ξ���ͬһ��ͨ������·��
 * @author Kylin
 *
 */
public class DepthFirstSearch {
	private boolean[] marked;
	private int count;
	
	
	
	public DepthFirstSearch(Graph graph, int s) {
		this.marked = new boolean[graph.getV()];
		dfs(graph, s);
	}
	
	/**
	 * �����������
	 * 	ÿ�ε���һ������ʱ�����Ƚ������Ϊ�ѷ��ʣ�֮��ݹ�ķ�����������û�б�ǹ����ھӽ��
	 * @param graph ͼ
	 * @param v ����
	 */
	public void dfs(Graph graph, int v){
		//1. ��Ǹýڵ�Ϊ�ѷ���
		marked[v] = true;
		count++; //·�̼�1
		List<Integer> adjs = graph.getAllAdj(v);
		int w;
		for (int i = 0; i < adjs.size(); i++) {
			w = adjs.get(i);
			if(!marked[w]){
				dfs(graph, w);
			}
		}	
		
	}
	
	/**
	 * �鿴ĳ�������Ƿ񱻱��
	 * @param w
	 * @return
	 */
	public boolean isMarked(int w){
		return marked[w];
	}
	
	/**
	 * �鿴�߹���·��
	 * @return
	 */
	public int count(){
		return count;
	}
	



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
