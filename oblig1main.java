import java.util.ArrayList;

class oblig1main {
	public static void main(String[] args) {
		
		Regneklynge abel = new Regneklynge(12);
		
		for (int i=1;i<=650;i++) {
			abel.settInnNode(new Node(64, 2600000000L, 8, 2600000000L, 8));
		}
		
		for (int i=1;i<=16;i++) {
			abel.settInnNode(new Node(1024, 2300000000L, 8, 2300000000L, 8));
		}
		
		System.out.println(abel.flops());
		System.out.println(abel.noderMedNokMinne(32));
		System.out.println(abel.noderMedNokMinne(64));
		System.out.println(abel.noderMedNokMinne(128));
		System.out.println(abel.antallRacks());
	}
}