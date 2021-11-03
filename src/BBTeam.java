import java.text.DecimalFormat;

public class BBTeam {

	private String tName;
	private BBPlayer[] player = new BBPlayer[20];
	private int count = 0;	
	private double OFGP;
	private double OFTP;
	DecimalFormat formatter = new DecimalFormat("#0.00");  //how to use decimal formatter
		
	public BBTeam(String name) {
		tName = name;
		
		
	}

	public void addPlayer(String name, String position, double fGPercentage, double fTPercentage) {
		player[count] = new BBPlayer(name, position, fGPercentage, fTPercentage);
		count++;
	}
	


	public void printPlayers() {
		System.out.println("Team name: " + tName);
		System.out.println("");
		System.out.println("Player Name, " + "Position, " + " Field Goal Percentage, " + "Free Throw Percentage ");
	
		for (int i = 0; i < count; i++) {
			System.out.println(player[i].getName() + ", " + player[i].getPos() +  ", " + formatter.format(player[i].getFG()) + ", " + formatter.format(player[i].getFT()));
		}
	}
	
	public void CalcFG(){
		double OFGP = 0.0;
		for (int i = 0; i < count; i++){
			OFGP += player[i].getFG();
		}
		System.out.println();
		
		System.out.println("The overall field goal percentage for " + tName + " is: " + OFGP/count);
	}
	public void CalcFT(){
		double OFTP = 0.0;
		for (int i = 0; i < count; i++){
			OFTP += player[i].getFT();
		}
		System.out.println();
	
		System.out.println("The overall free throw percentage for " + tName + " is: " + OFTP/count);
	}
	


}


