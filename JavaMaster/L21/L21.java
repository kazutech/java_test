class L21 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		long chokin;
		long mokuhyou;
		long goukei = 0;
		int nensu;
		int tukisu = 0;
		chokin = Long.parseLong(args[0]);
		mokuhyou = Long.parseLong(args[1]);
		while(goukei < mokuhyou) {
			goukei += chokin;
			tukisu++;
		};
		nensu = tukisu / 12;
		tukisu = tukisu % 12;
		System.out.println("’™‹àŠz:" + chokin);
		System.out.println("–Ú•WŠz:" + mokuhyou);
		System.out.println(nensu + "”N" + tukisu + "ƒ–ŒŽ‚Å’™‚Ü‚è‚Ü‚·");
	}
}