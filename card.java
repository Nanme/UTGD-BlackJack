public Card {
	private int value;
	private char color;

	Card(){
		value = 0;
		char = 0;
	}

	public int getValue(){
		return this.value;
	}
	public String getColor(){
		return this.color
	}
	public String toString(){
		switch (this.value){
			case 1:
				return "A "+this.color;
				break;
			case 11:
				return "J "+this.color;
				break;
			case 12:
				return "Q "+this.color;
				break;
			case 13:
				return "K "+this.color;
				break;
			default:
				return value+" "+this.color;
				break;
		}
	}
}