class Rensyu2_str {
	public static void main(String[] args) {
		String str = "Hello";
		String name = "田中";
		char x = '!';
		String san = "さん";
		System.out.println(str + x + name + san);
		
		System.out.println();
		
		String a = "りんご";
		
		int b = 3;
		
		System.out.println(a + b + '個');
		
		System.out.println();
		
		String s1 = "tanaka";
		
		int num = s1.length();
		
		char c = s1.charAt(2);
		
		System.out.println(s1 + "の文字数は" + num);
		System.out.println(s1 + "の2文字目は" + c);
	}
}