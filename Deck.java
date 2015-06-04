import java.util.*;

public class Deck implements Comparable{
	private ArrayList<Card> deck = new ArrayList<Card>();

	Deck(){
		ArrayList<String> color = new ArrayList<String>();
		color.add("♠");
		color.add("♥");
		color.add("♦");
		color.add("♣");

		Card c = new Card();
		for (int i=0;i<4;i++) {
			for (int j=1;j<15;j++) {
				c.setValue(j);
				c.setColor(color.get(i));
				this.deck.add(c);
			}
		}
	}

	public int compareTo(Object o){
		Card c = (Card)o;
		return 0;
	}

}