public class Rack {
	private Node[] nodeliste;
	private int antNoder = 0;
	
	// constructor
	public Rack(int npr) {
		nodeliste = new Node[npr];
	}
	
	// legge til ny node
	public boolean nyNode(Node nynode) {
		if (antNoder < nodeliste.length) {
			nodeliste[antNoder] = nynode;
			antNoder++;
			return true;
		}
		else {
			return false;
		}
	}
	
	// returnere node
	public Node getNode(int nr) {
		if (nr < antNoder) {
			return nodeliste[nr];
		}
		else {
			return null;
		}
	}
}