class Book {
	String title;
	int price;
	int pagecnt;
	void show() {
		System.out.println("�^�C�g���F" + title);
		System.out.println("�P�@�@���F" + price);
		System.out.println("�y�[�W���F" + pagecnt);
	}
	
	void shopping(int num) {
		int kingaku = price * num;
		System.out.println(num + "�������܂����B���v���z��" + kingaku + "�~�ł��B");
	}
	
	int readTime(int time){
		int allTime = time * pagecnt;
		return allTime;
	}
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
		System.out.println("���I�u�W�F�N�gb1��");
		b1.show();
		b1.shopping(10);
		b1.shopping(5);
		
		System.out.println("1�y�[�W2���œǂނ�" + b1.readTime(2) + "������܂��B");
		System.out.println("1�y�[�W5���œǂނ�" + b1.readTime(5) + "������܂��B");
		
		Book b2;
		b2 = new Book();
		b2.title = "JavaScript�̊G�{";
		b2.price = 1500;
		b2.pagecnt = 250;
		System.out.println("\n���I�u�W�F�N�gb2��");
		b2.show();
		b2.shopping(10);
		b2.shopping(5);
		
		System.out.println("1�y�[�W2���œǂނ�" + b2.readTime(2) + "������܂��B");
		System.out.println("1�y�[�W5���œǂނ�" + b2.readTime(5) + "������܂��B");
	}
}