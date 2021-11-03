/* Ty Thompson
 CSCI 112_Proj_1
 Joey helped me
 */
public class Driver {
	public static void main (String[] args){
		// Creates a BBTeamtee and assigns the BBTeamtee name
		BBTeam team = new BBTeam("Wizards");
		
		
System.out.println("Abbreivations for positions:");

	System.out.println("Point Guard = PG");
	System.out.println("Shooting Guard = SG");
	System.out.println("Small Forward = SF");
	System.out.println("Power Forward = PF");
	System.out.println("Center = C");
	System.out.println("");
	
		// Adds people to the BBTeamtee
		team.addPlayer("Dan Jones", "PG", .45, .64);
		team.addPlayer("Susan Tate", "SG", .35, .25);
		team.addPlayer("Brenda Abbott", "SF", .32, .36);
		team.addPlayer("John Mason", "PF", .29, 1.00 );
		team.addPlayer("Michael Ward", "C", .40, .45);
	
		/*team.averagePercentages(45, 64);
		team.averagePercentages(35, 25);
		team.averagePercentages(32, 25);
		team.averagePercentages(29, 100);
		team.averagePercentages(40, 45);
		*/
		// Prints the BBTeamtee name
		team.printPlayers();
		team.CalcFG();
		team.CalcFT();
	}
}