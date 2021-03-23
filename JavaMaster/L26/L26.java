class L26 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		int i;
		int suryo;
		int kingaku;
		int goukei = 0;
		int tanka[] = {100,50,1000};
		String hinmei[] = {"‚è‚ñ‚²","‚İ‚©‚ñ","ƒƒƒ“"};
		for(i = 0;i < 3; i++ ) {
			suryo = Integer.parseInt(args[i]);
			if(suryo == 0) continue;
			kingaku = tanka[i] * suryo;
			System.out.println(hinmei[i] + ":" + kingaku);
			goukei += kingaku;
		}
		System.out.println("‡ Œv:" + goukei);
	}
}