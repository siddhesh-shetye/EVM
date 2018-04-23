import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdapterTest {

	BallotingUnit bu = new BallotingUnit();
	ControlUnit cu = new Adapter();
	
	@BeforeEach
	void setUp() throws Exception {
		start(bu,cu);
	}
	
	@Test
	public void testCastVote() {
		//fail("Not yet implemented");
		assertEquals("true", bu.castVote());
	}

	private void start(BallotingUnit bu, ControlUnit cu) {
		// TODO Auto-generated method stub
		int count=0;
		
		cu.addcandidate();
		cu.ballotbutton();
		while(count<1000){
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