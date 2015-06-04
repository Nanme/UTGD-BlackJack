import java.util.*;

public class Deck implements Comparable{
	private ArrayList deck;

	Deck(){
		ArrayList color;
		color.add('S');
		color.add('H');
		color.add('D');
		color.add('T');

		Card c;
		for (int i=0;i<4;i++) {
			for (int j=1;j<53;j++) {
				c.setValue(j);
				c.setColor(color.get(i));
				this.deck.add(c);
			}
		}
	}

	public int compareTo(Object o){
		Card c = (Card)o;
	}

}