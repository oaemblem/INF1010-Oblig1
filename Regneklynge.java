import java.util.ArrayList;

public class Regneklynge {
	private ArrayList<Rack> rackList = new ArrayList<Rack>();
	private int noderPerRack;
	private int currentRack = 0;
	
	// constructor
	public Regneklynge(int npr) {
		noderPerRack = npr;
		rackList.add(new Rack(noderPerRack));
	}
	
	// sette inn ny node
	public void settInnNode(Node node) {
		if (rackList.get(currentRack).nyNode(node) == false) {
			rackList.add(new Rack(noderPerRack));
			currentRack++;
			rackList.get(currentRack).nyNode(node);
		}
	}
	
	// finne flops for racket
	public long flops() {
		long ftot = 0;
		int i;
		for (Rack rack : rackList) {
			i = 0;
			while ((rack.getNode(i) != null) && (i<noderPerRack)) {
				ftot = ftot + rack.getNode(i).getProsessor(1).getFlops();
				if (rack.getNode(i).getProsessor(2) != null) {
					ftot = ftot + rack.getNode(i).getProsessor(2).getFlops();
				}
				i++;
			}
		}
		return ftot;
	}
	
	// finne antall noder med nok minne
	public int noderMedNokMinne(int paakrevdMinne) {
		int antall = 0;
		int i;
		for (Rack rack : rackList) {
			i = 0;
			while ((rack.getNode(i) != null) && (i<noderPerRack)) {
				if (rack.getNode(i).getMinne() >= paakrevdMinne) {
					antall++;
				}
				i++;
			}
		}
		return antall;
	}
	
	// returnere antall racks
	public int antallRacks() {
		return currentRack+1;
	}
}