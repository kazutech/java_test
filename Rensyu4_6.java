class Rensyu4_6 {
	public static void main(String args[]){
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		for(int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		for(int i = 10; i <= 100; i = i + 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		for(int i = 1; i <= 100; i++) {
			System.out.print(i);
			if(i == 100) break;
			System.out.print("¨");
		}
	}
}