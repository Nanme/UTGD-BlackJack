public class Bank extends Player{

	Bank(){
		super();
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