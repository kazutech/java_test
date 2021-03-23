class L12 {
	public static void main(String args[]){
		int eigo; int kokugo; int sugaku; int goukei;
		eigo = Integer.parseInt(args[0]);
		kokugo = Integer.parseInt(args[1]);
		sugaku = Integer.parseInt(args[2]);
		goukei = eigo + kokugo + sugaku;
		System.out.println("英語" + eigo + "点");
		System.out.println("国語" + kokugo + "点");
		System.out.println("数学" + sugaku + "点");
		System.out.println("合計" + goukei + "点");
		System.out.println("平均" + goukei / args.length + "点");
	}
}