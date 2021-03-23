class L17 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		int intHankei;
		double dblMenseki;
		int intMenseki;
		intHankei = Integer.parseInt(args[0]);
		dblMenseki = intHankei * intHankei * 3.14;
		intMenseki = (int)Math.round(dblMenseki);
		System.out.println("–ÊÏ(double):" + dblMenseki);
		System.out.println("–ÊÏ(int):" + intMenseki);
	}
}