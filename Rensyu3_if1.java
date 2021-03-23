class Rensyu3_if1{
	public static void main(String[] args){
		/*----- Stringその1 それぞれ代入しているが、同じ場所を参照する -----*/
		String s1 = "ABC";
		String s2 = "ABC";
		
		/* 参照先が同じかどうか */
		if (s1 == s2){
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 == s2 ではない");
		}
		
		/* 値が同じかどうか */
		if (s1.equals(s2)){
			System.out.println("s1.equals(s2)");
		} else {
			System.out.println("s1.equals(s2) ではない");
		}
		
		/*----- Stringその2 newで生成すると、別々の場所を参照する-----*/
		String s3 = new String("ABC");
		String s4 = new String("ABC");

		/* 参照先が同じかどうか */
		if (s3 == s4){
			System.out.println("s3 == s4");
		} else {
			System.out.println("s3 == s4 ではない");
		}

		/* 値が同じかどうか */
		if (s3.equals(s4)){
			System.out.println("s3.equals(s4)");
		} else {
			System.out.println("s3.equals(s4) ではない");
		}
		
		
	}
}
