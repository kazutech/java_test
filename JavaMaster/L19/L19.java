class L19 {
	public static void main(String args[]){
		double sincho;
		double taiju;
		double hyoujun;
		double himando;
		if(args.length != 2) System.exit(0);
		sincho = Double.parseDouble(args[0]);
		taiju = Double.parseDouble(args[1]);
		hyoujun = (sincho - 100) * 0.9;
		himando = taiju - hyoujun;
		System.out.println("�g��:" + sincho);
		System.out.println("�̏d:" + taiju);
		System.out.println("�W��:" + hyoujun);
		if(himando >= 5) {
			System.out.println("����:���肷��");
		} else if (himando <= -5) {
			System.out.println("����:��������");
		} else {
			System.out.println("����:�W��");
		}
		
		
	}
}