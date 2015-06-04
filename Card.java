public class Card {
	private int value;
	private char color;

	Card(){
		value = 0;
		color = 0;
	}

	public int getValue(){
		return this.value;
	}
	public char getColor(){
		return this.color;
	}
	public void setValue(int val){
		this.value = val;
	}
	public void getColor(char color){
		this.color = color;
	}
	public String toString(){
		String buffer;

		switch (this.value){
			case 1:
				buffer = "A "+this.color;
				break;
			case 11:
				buffer = "J "+this.color;
				break;
			case 12:
				buffer = "Q "+this.color;
				break;
			case 13:
				buffer = "K "+this.color;
				break;
			default:
				buffer = value+" "+this.color;
				break;
		}
		return buffer;
	}
}