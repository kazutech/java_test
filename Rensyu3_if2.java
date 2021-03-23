class Rensyu3_if2 {
	public static void main(String[] args){
		/* 配列その1 */
		int[]  a = {10, 20, 30};	/* 配列 */
		int[]  b = a;				/* 代入することで、同じ場所を参照する */

		/* String以外の参照型は、==もequalsも同じ動きになる */
		if (a == b){
			System.out.println("a == b");
		} else {
			System.out.println("a == b ではない");
		}
		
		if (a.equals(b)){
			System.out.println("a.equals(b)");
		} else {
			System.out.println("a.equals(b) ではない");
		}

		/* 配列その2 */
		int[] c = {10, 20, 30};		/* 配列 */
		int[] d = {10, 20, 30};		/* それぞれ指定すると別々の場所を参照する */

		/* String以外の参照型は、==もequalsも同じ動きになる */
		if (c == d){
			System.out.println("c == d");
		} else {
			System.out.println("c == d ではない");
		}
		
		if (c.equals(d)){
			System.out.println("c.equals(d)");
		} else {
			System.out.println("c.equals(d) ではない");
		}

	}
}
