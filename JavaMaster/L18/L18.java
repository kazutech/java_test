class L18 {
	public static void main(String args[]){
		int su;
		if(args.length == 0) System.exit(0);
		su = Integer.parseInt(args[0]);
		if(su % 2 == 0) {
			System.out.println(su + "‚Í‹ô”‚Å‚·");
		} else {
			System.out.println(su + "‚ÍŠï”‚Å‚·");
		}
	}
}