class Rensyu3_if1{
	public static void main(String[] args){
		/*----- String����1 ���ꂼ�������Ă��邪�A�����ꏊ���Q�Ƃ��� -----*/
		String s1 = "ABC";
		String s2 = "ABC";
		
		/* �Q�Ɛ悪�������ǂ��� */
		if (s1 == s2){
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 == s2 �ł͂Ȃ�");
		}
		
		/* �l���������ǂ��� */
		if (s1.equals(s2)){
			System.out.println("s1.equals(s2)");
		} else {
			System.out.println("s1.equals(s2) �ł͂Ȃ�");
		}
		
		/*----- String����2 new�Ő�������ƁA�ʁX�̏ꏊ���Q�Ƃ���-----*/
		String s3 = new String("ABC");
		String s4 = new String("ABC");

		/* �Q�Ɛ悪�������ǂ��� */
		if (s3 == s4){
			System.out.println("s3 == s4");
		} else {
			System.out.println("s3 == s4 �ł͂Ȃ�");
		}

		/* �l���������ǂ��� */
		if (s3.equals(s4)){
			System.out.println("s3.equals(s4)");
		} else {
			System.out.println("s3.equals(s4) �ł͂Ȃ�");
		}
		
		
	}
}
