class L20 {
	public static void main(String args[]){
		int kekka;
		kekka = (int)(Math.random() * 4);
		switch(kekka) {
			case 0:
				System.out.print("はずれ");
				break;
			case 1:
				System.out.print("1等");
				break;
			case 2:
				System.out.print("2等");
				break;
			case 3:
				System.out.print("3等");
			default:
		}
	}
}