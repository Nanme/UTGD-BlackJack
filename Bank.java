public class Bank extends Player{

	Bank(){
		super();
	}

	// Is used to complete the turn of the Bank.
	public void pullCards(Deck deck){
		while(this.pts < 17){
			this.listCard.add(deck.pullCard());
		}
	}	


	public String toString(){
		String buffer = "Bank :\n";

		for (Card card : listCard){
			buffer += card + " - ";
		}

		buffer += "\npts :" + pts;

		return buffer;
	}
}