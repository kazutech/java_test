class L12 {
	public static void main(String args[]){
		int eigo; int kokugo; int sugaku; int goukei;
		eigo = Integer.parseInt(args[0]);
		kokugo = Integer.parseInt(args[1]);
		sugaku = Integer.parseInt(args[2]);
		goukei = eigo + kokugo + sugaku;
		System.out.println("�p��" + eigo + "�_");
		System.out.println("����" + kokugo + "�_");
		System.out.println("���w" + sugaku + "�_");
		System.out.println("���v" + goukei + "�_");
		System.out.println("����" + goukei / args.length + "�_");
	}
}