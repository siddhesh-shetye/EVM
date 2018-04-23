

public class Candidate {
	
	String Name;
	int candidateID;
	int myVotersCount;
	
	public Candidate(String name, int candidateID, int myVotersCount) {
		super();
		Name = name;
		this.candidateID = candidateID;
		this.myVotersCount = 0;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}
	
}