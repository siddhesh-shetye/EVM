public class EVMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		BallotingUnit bu = new BallotingUnit();
		ControlUnit cu = new Adapter();
		
		cu.addcandidate();
		cu.ballotbutton();
		while(count<3){
			bu.machineready();
			String a = bu.castVote();
			if(a=="true"){
				bu.sendoutput(cu);
				cu.success();
				cu.ballotbutton();
			}
			count++;
		}
		cu.totalvotes();	
	}
}