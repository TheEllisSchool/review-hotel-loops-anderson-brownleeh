import javax.swing.JOptionPane;

public class ReviewAssignmentHotelCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numNights;
		do{
			String input1 = JOptionPane.showInputDialog(null, "How many nights are you staying?");
			numNights = Integer.parseInt(input1);
		} while(numNights<0);
// penguin hotel costs 500 $ a night
// Melting motel costs 50 $ a night
// Exploer's Inn = 200$
		String numStarsPen="";
		String numStarsMelt="";
		String numStarsExplor="";
		
		int totalCostPen = 500*numNights;//pen
		int printedCostPen = totalCostPen;
		while (totalCostPen>=0) {
			numStarsPen+=("* ");
			totalCostPen-=50;
		}
		
		
		int totalCostMelt = 50*numNights;//melt
		int printedCostMelt = totalCostMelt;
		while (totalCostMelt>=0) {
			numStarsMelt+=("* ");
			totalCostMelt-=50;
		}
	
		
		int totalCostExplor = 200*numNights;//explor
		int printedCostExplor = totalCostExplor;
		while (totalCostExplor>=0) {
			numStarsExplor+=("* ");
			totalCostExplor-=50;
		}
		
		// display results
		System.out.println("For "+ numNights+" nights, your cost will be:");
		System.out.println(numStarsPen + "("+ printedCostPen +"$) at the Penguin Hotel - Live Penguins to pet!");
		System.out.println(numStarsMelt + "("+ printedCostMelt+"$) at the Melting Motel - Learn about climate change as the hotel melts. Plus, we're cheap!");
		System.out.println(numStarsExplor + "("+ printedCostExplor+"$) at the Explers's Inn - Have an adventure!");
		
		System.out.println("(Each * represents 50$)");
	
	
	//
	
	}

}
