class Rensyu3_if2_1 {
	public static void main(String args[]){
		int[] a = {10, 20, 30};
		int[] b = a;
		
		if(a == b) {
			System.out.println("a == b");
		} else {
			System.out.println("a == b�ł͂Ȃ�");
		}
		
		if(a.equals(b)) {
			System.out.println("a.equals(b)");
		} else {
			System.out.println("a.equals(b)�ł͂Ȃ�");
		}
		
		int[] c = {10, 20, 30};
		int[] d = {10, 20, 30};
		
		if (c == d) {
			System.out.println("c == d");
		} else {
			System.out.println("c == d�ł͂Ȃ�");
		}
		
		if(c.equals(d)) {
			System.out.println("c.equals(d)");
		} else {
			System.out.println("c.equals(d)�ł͂Ȃ�");
		}
	}
}