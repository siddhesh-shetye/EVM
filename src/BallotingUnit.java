

import java.util.ArrayList;
import java.util.Scanner;

public class BallotingUnit {

	int totalpoll=0;
	int can1=0, can2=0, can3=0;
	ArrayList <Candidate> candidates = new ArrayList<Candidate>();
	
	public int machineready(){
		System.out.println("Machine is ready");
		return 0;
	}

	
	public String castVote(){
		Scanner s = new Scanner(System.in);
		System.out.println("Select the appropriate button to cast the vote");
		System.out.println("Enter 1- Candidate One");
		System.out.println("Enter 2- Candidate Two");
		System.out.println("Enter 3- Candidate Three");
		System.out.println("Enter 4- Total Votes so far");
		System.out.println("Enter 5- Close the poll");
		System.out.println("Enter 6- Total votes for each candidate");
		System.out.println("Enter 7- Reset Votes");
		int selectedCandidate = s.nextInt();
		
		System.out.println("You have pressed : "+selectedCandidate);
		
		return selectCandidate(selectedCandidate);
	}


	//refactoring extract method
	public String selectCandidate(int selectedCandidate) {
		switch (selectedCandidate) 
        {
            case 1: can1(); //refactoring extract method
                    break;
                    
            case 2: can2(); //refactoring extract method
                    break;
                    
            case 3: can3(); //refactoring extract method
                    break;
                    
            case 4: totalVotes(); //refactoring extract method
                    break;
                    
            case 5: exit(1);
                    break;
                    
            case 6: displayTotalVotesCandidate();
                    break;
                    
            case 7: resetVotes();
                    break;
                    
            default: System.out.println("Invalid Option");
                     break;
        }
		
		return "true";
	}


	public void totalVotes() {
		System.out.println("Total votes so far : "+totalpoll);
	}


	public void can3() {
		can3++;
		totalpoll=totalpoll+1;
	}


	public void can2() {
		can2++;
		totalpoll=totalpoll+1;
	}


	public void can1() {
		can1++;
		totalpoll=totalpoll+1;
	}


	private void resetVotes() {
		can1=0;
		can2=0;
		can3=0;
		totalpoll=0;
		System.out.println("Reset Counter Successful : "+can1+" "+can2+" "+can3+" "+totalpoll);
	}


	private void displayTotalVotesCandidate() {
		System.out.println("Total votes for each candidate : ");
		System.out.println("Candidate 1 : "+can1);
		System.out.println("Candidate 2 : "+can2);
		System.out.println("Candidate 3 : "+can3);
	}


	private void exit(int i) {
		// TODO Auto-generated method stub
		if(i==1) {
			System.out.println("Poll Closed");
			System.exit(0);
		}
	}


	public void sendoutput(ControlUnit cu) {
		// TODO Auto-generated method stub
		cu.receiveInput(totalpoll);
	}
	
	
}

