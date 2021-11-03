

public class BBPlayer {

	private String playerName = "";
	private String position = "";
	private double fGPercentage = 0.0;
	private double fTPercentage = 0.0;


	public BBPlayer() {
		playerName = "";
		position = "";
		fGPercentage = 0.0;
		fTPercentage = 0.0;
	}

	public BBPlayer(String n, String pos, double FG, double FT) {
		playerName = n;
		position = pos;
		fGPercentage = FG;
		fTPercentage = FT;
	}

	public void setName(String n) {
		playerName = n;
	}

	public void setPos(String pos) {
		position = pos;
	}

	public void setFG(double FG) {
		fGPercentage = FG;
	}

	public void setFT(double FT) {
		fTPercentage = FT;
	}
	
	public String getName() { // ask about the parentheses
		return playerName;
	}

	public String getPos() {
		return position;
	}

	public Double getFG() {
		return fGPercentage;
	}

	public Double getFT() {
		return fTPercentage;
	}
	

}

