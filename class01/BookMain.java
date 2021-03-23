class Book {
	String title;
	int price;
	int pagecnt;
}

class BookMain {
	public static void main(String args[]){
		/*
		Book b1; //宣言
		型　変数名
		(クラス名) (オブジェクト名)
		b1 = new Book(); //生成
		*/
		
		Book b1 = new Book();
		b1.title = "JavaBronze教科書";
		b1.price = 2000;
		b1.pagecnt = 300;
		System.out.println("タイトル：" + b1.title);
		System.out.println("単　　価：" + b1.price);
		System.out.println("ページ数：" + b1.pagecnt);
		
		Book b2;
		b2 = new Book();
		b2.title = "JavaScriptの絵本";
		b2.price = 1500;
		b2.pagecnt = 250;
		System.out.println("タイトル：" + b2.title);
		System.out.println("単　　価：" + b2.price);
		System.out.println("ページ数：" + b2.pagecnt);
	}
}