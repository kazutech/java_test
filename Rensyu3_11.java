class Rensyu3_11 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		int a = Integer.parseInt(args[0]);
		if(a > 0) {
			System.out.println("a�͐��̒l�ł��B");
			if(a % 2 == 0) {
				System.out.println("a�͋����ł��B");
			}
		} else {
			if(a == 0) {
				System.out.println("a��0�ł��B");
			} else {
				System.out.println("a�͕��̒l�ł��B");
			}
		}
	}
}