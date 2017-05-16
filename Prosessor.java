public class Prosessor {
	private long klokkehastighet;
	private int antKjerner;
	
	// constructor
	public Prosessor(long k, int a) {
		klokkehastighet = k;
		antKjerner = a;
	}
	
	// returnere klokkehastighet
	public long getKlokkehastighet() {
		return klokkehastighet;
	}
	
	// returnere antall kjerner
	public int getAntKjerner() {
		return antKjerner;
	}
	
	// returnere flops
	public long getFlops() {
		return klokkehastighet*antKjerner*8;
	}
}