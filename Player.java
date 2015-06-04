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
	}

	public String toString(){
		String buffer = "Main :\n";

		for (Card card : listCard){
			buffer += card + "\n";
		}

		buffer += "\npts :" + pts;

		return buffer;
	}
}