package anima_abstract_nonabstract;

public class mainanimal {

	public static void main(String[] args) {
		animal am;
		am = new deer();
		am.colour();
		am.run();
		
		am.animalkingdom();
		
		am = new Pig();
		am.colour();
		am.run();

	}

}
