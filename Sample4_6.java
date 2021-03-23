class Sample4_6 {
	public static void main(String args[]){
		int count1 = 0;
		for (; count1 < 5; count1++) {
			System.out.print(count1);
		}
		System.out.println();
		for (int count2 = 0; count2 < 5; ) {
			System.out.print(count2++);
		}
	}
}