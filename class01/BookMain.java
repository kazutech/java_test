class Book {
	String title;
	int price;
	int pagecnt;
}

class BookMain {
	public static void main(String args[]){
		/*
		Book b1; //�錾
		�^�@�ϐ���
		(�N���X��) (�I�u�W�F�N�g��)
		b1 = new Book(); //����
		*/
		
		Book b1 = new Book();
		b1.title = "JavaBronze���ȏ�";
		b1.price = 2000;
		b1.pagecnt = 300;
		System.out.println("�^�C�g���F" + b1.title);
		System.out.println("�P�@�@���F" + b1.price);
		System.out.println("�y�[�W���F" + b1.pagecnt);
		
		Book b2;
		b2 = new Book();
		b2.title = "JavaScript�̊G�{";
		b2.price = 1500;
		b2.pagecnt = 250;
		System.out.println("�^�C�g���F" + b2.title);
		System.out.println("�P�@�@���F" + b2.price);
		System.out.println("�y�[�W���F" + b2.pagecnt);
	}
}