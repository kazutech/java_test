class Rensyu3_11 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		int a = Integer.parseInt(args[0]);
		if(a > 0) {
			System.out.println("aは正の値です。");
			if(a % 2 == 0) {
				System.out.println("aは偶数です。");
			}
		} else {
			if(a == 0) {
				System.out.println("aは0です。");
			} else {
				System.out.println("aは負の値です。");
			}
		}
	}
}