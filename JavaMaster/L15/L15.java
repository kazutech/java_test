class L15 {
	public static void main(String args[]){
		int a; int b; int c;
		boolean x; boolean y;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		x = a == 7 && b == 7 && c == 7;
		y = a == 7 || b == 7 || c == 7;
		
		System.out.println("‘å“–‚½‚è:" + x);
		System.out.println("¬“–‚½‚è:" + y);
	}
}