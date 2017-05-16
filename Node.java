public class Node {
	private int minne;
	private Prosessor prosessor1;
	private Prosessor prosessor2;
	
	// constructor
	public Node(int m, long kh1, int antk1) {
		minne = m;
		prosessor1 = new Prosessor(kh1, antk1);
	}
	
	// constructor
	public Node(int m, long kh1, int antk1, long kh2, int antk2) {
		minne = m;
		prosessor1 = new Prosessor(kh1, antk1);
		prosessor2 = new Prosessor(kh2, antk2);
	}
	
	// returnere prosessor
	public Prosessor getProsessor(int nr) {
		if (nr == 1) {
			return prosessor1;
		}
		else if (nr == 2) {
			return prosessor2;
		}
		else {
			return null;
		}
	}
	
	// returnere minne
	public int getMinne() {
		return minne;
	}
}