class L16 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		int ten;
		String hantei;
		ten = Integer.parseInt(args[0]);
		hantei = ten >= 80 ? "���i" : "�s���i";
		System.out.println(ten + "�_��" + hantei);
	}
}