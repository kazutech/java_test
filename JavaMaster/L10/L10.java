class L10 {
	public static void main(String args[]){
		int suuji1 = Integer.parseInt(args[0]);
		int suuji2 = Integer.parseInt(args[1]);
		int maxSuuji = Math.max(suuji1,suuji2);
		System.out.println("数値1:" + suuji1);
		System.out.println("数値2:" + suuji2);
		System.out.println(maxSuuji + "のほうが大きい");
	}
}