class L08 {
	public static void main(String[] args){
		char[] arrayA = new char[3];
		int[] arrayB = {10,20,30};
		arrayA[0] = 'a';
		arrayA[1] = 'b';
		arrayA[2] = 'c';
		System.out.println("arrayAの値は" + arrayA[0] + arrayA[1] + arrayA[2] + "です");
		System.out.println("arrayB要素数は" + arrayB.length + "です");
		System.out.println(arrayB[0]);
		System.out.println(arrayB[1]);
		System.out.println(arrayB[2]);
	}
}