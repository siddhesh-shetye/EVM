

import java.util.ArrayList;

public class Adapter implements ControlUnit{
	
	int totalpoll;
	
	ArrayList <Candidate> candidates = new ArrayList<Candidate>();
	
	Candidate cd1 = new Candidate("Siya",1,0);
	Candidate cd2 = new Candidate("Siddhesh",2,0);
	Candidate cd3 = new Candidate("Neha",3,0);
	
	@Override
	public int ballotbutton() {
		// TODO Auto-generated method stub
		System.out.println("- - - - - - - - - - - - - - -");
		System.out.println("Blue Ballot Button is Pressed");
		return 0;
	}
	
	public int addcandidate(){
		candidates.add(cd1);
		candidates.add(cd2);
		candidates.add(cd3);
		System.out.println("Candidates Added Successfully\n");
		return 0;
	}
	
	public void success(){
		System.out.println("You have successfully cast your vote");
	}

	@Override
	public void receiveInput(int totalpoll) {
		// TODO Auto-generated method stub
		this.totalpoll=totalpoll;
	}
	
	public void totalvotes() {
		// TODO Auto-generated method stub
		System.out.println("Total Votes cast " + totalpoll);
	}
}
