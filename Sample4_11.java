class Sample4_11 {
	public static void main(String args[]){
		for(int i = 1;i < 10;i++){
			if((i % 3) == 0){
				System.out.println("�������X�L�b�v���܂��B");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("for���̌�̏���");
	}
}