class Rensyu2_str {
	public static void main(String[] args) {
		String str = "Hello";
		String name = "“c’†";
		char x = '!';
		String san = "‚³‚ñ";
		System.out.println(str + x + name + san);
		
		System.out.println();
		
		String a = "‚è‚ñ‚²";
		
		int b = 3;
		
		System.out.println(a + b + 'ŒÂ');
		
		System.out.println();
		
		String s1 = "tanaka";
		
		int num = s1.length();
		
		char c = s1.charAt(2);
		
		System.out.println(s1 + "‚Ì•¶š”‚Í" + num);
		System.out.println(s1 + "‚Ì2•¶š–Ú‚Í" + c);
	}
}