class L25 {
	public static void main(String args[]){
		int kensaku;
		int i;
		int bango[] = {1001,1002,2010,2015,3011};
		String namae[] = {"�R�c���Y","����z�q","�ē�����","�֌��T��","�㓡���b"};
		kensaku = Integer.parseInt(args[0]);
		for(i = 1;i <= 5; i++){
			if(bango[i] == kensaku) break;
			if(i < 5) {
				System.out.print(namae[i]);
			} else if (i >= 5) {
				System.out.print("�Y���������͑��݂��܂���");
			}
		}
	}
}