import java.util.*;

public class Player {
	public int pts;
	public ArrayList<Card> listCard;

	Player(){
		this.pts = 0;
		listCard = new ArrayList<Card>();
	}

	public void pullCard(Card card){
		this.listCard.add(card);
		System.out.println("You pull the "+card.toString());
		this.determinePoints();
	}

	public String toString(){
		String buffer = "Joueur :\n";

		for (Card card : listCard){
			buffer += card + "\n";
		}

		buffer += "\npts :" + pts;

		return buffer;
	}

	private void determinePoints(){
		pts = 0;
		for(card c : listCard){
			if(c.getValue > 10){
				pts += 10;
			}else{
				if(c.getValue() == 1){
					System.out.println("You have an ace would you like to get 1(0) or 11(1) points:");
					Scanner scanner = new Scanner(System.in);
					do{
						int response = scanner.nextInt();
					}while(response != 0 || response != 1);
					
					if(response == 0){
						pts += 1;
					}else{
						pts += 11;
					}
				}
				pts += c.getValue();
			}
		}
	}

}