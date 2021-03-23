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
		System.out.println("身長:" + sincho);
		System.out.println("体重:" + taiju);
		System.out.println("標準:" + hyoujun);
		if(himando >= 5) {
			System.out.println("判定:太りすぎ");
		} else if (himando <= -5) {
			System.out.println("判定:痩せすぎ");
		} else {
			System.out.println("判定:標準");
		}
		
		
	}
}