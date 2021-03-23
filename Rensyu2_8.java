class Rensyu2_8 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2 = "DEF";
		
		System.out.println(s1);
		System.out.println(s2);
	}
}