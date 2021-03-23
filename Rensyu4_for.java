class Rensyu4_for {
	public static void main(String args[]){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		if(args.length == 0) System.exit(0);
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}