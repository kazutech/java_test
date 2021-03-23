class L22 {
	public static void main(String args[]){
		int su;
		int ransu;
		int kaisu = 0;
		su = Integer.parseInt(args[0]);
		do {
			ransu = (int)(Math.random() * 10);
			kaisu++;
			System.out.print(ransu);
		} while(su == ransu);
	}
}