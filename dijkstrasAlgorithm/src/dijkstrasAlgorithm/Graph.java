package dijkstrasAlgorithm;
//graph to implement
public class Graph {

	private Node[]nodes;
	private int numOfNodes;
	private Edge[] edges;
	private int numOfEdges;
	
	public Graph(Edge[] edges) {
		this.edges  = edges;
		//create nodes to update with edges
		this.numOfNodes = calculateNumOfNodes(edges);
		this.nodes  =  new Node[this.numOfNodes];
		
		for (int i = 0; i < this.numOfNodes; i++) {
			this.nodes[i] = new Node();
		}
		//add all edges to nodes, each edge added to two nodes (to and from)
		this.numOfEdges = edges.length;
		
		for(int edgeAdd = 0; edgeAdd < this.numOfEdges; edgeAdd++) {
			this.nodes[edges[edgeAdd].getFromNodeIndex()].getEdges().add(edges[edgeAdd]);
		}
	}
	
	private int calculateNumOfNodes(Edge[] edges2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Node[] getNodes() {
		return nodes;
	}
	public int getNumOfNodes() {
		return numOfNodes;
	}
	public Edge[] getEdges() {
		return edges;
	}
	public int getNumOfEdges() {
		return numOfEdges;
	}
	
	
}
