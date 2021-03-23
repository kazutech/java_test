class Rensyu3_if1_1 {
	public static void main(String args[]){
		String s1 = "ABC";
		String s2 = "ABC";
		
		if(s1.equals(s2)){
			System.out.println("s1.equals(s2)");
		} else {
			System.out.println("s1.equals(s2)‚Å‚Í‚È‚¢");
		}
		
		String s3 = new String("ABC");
		String s4 = new String("ABC");
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		} else {
			System.out.println("s3 == s4‚Å‚Í‚È‚¢");
		}
	}
}