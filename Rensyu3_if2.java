class Rensyu3_if2 {
	public static void main(String[] args){
		/* �z�񂻂�1 */
		int[]  a = {10, 20, 30};	/* �z�� */
		int[]  b = a;				/* ������邱�ƂŁA�����ꏊ���Q�Ƃ��� */

		/* String�ȊO�̎Q�ƌ^�́A==��equals�����������ɂȂ� */
		if (a == b){
			System.out.println("a == b");
		} else {
			System.out.println("a == b �ł͂Ȃ�");
		}
		
		if (a.equals(b)){
			System.out.println("a.equals(b)");
		} else {
			System.out.println("a.equals(b) �ł͂Ȃ�");
		}

		/* �z�񂻂�2 */
		int[] c = {10, 20, 30};		/* �z�� */
		int[] d = {10, 20, 30};		/* ���ꂼ��w�肷��ƕʁX�̏ꏊ���Q�Ƃ��� */

		/* String�ȊO�̎Q�ƌ^�́A==��equals�����������ɂȂ� */
		if (c == d){
			System.out.println("c == d");
		} else {
			System.out.println("c == d �ł͂Ȃ�");
		}
		
		if (c.equals(d)){
			System.out.println("c.equals(d)");
		} else {
			System.out.println("c.equals(d) �ł͂Ȃ�");
		}

	}
}
