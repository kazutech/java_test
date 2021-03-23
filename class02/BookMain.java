class Book {
	String title;
	int price;
	int pagecnt;
	void show() {
		System.out.println("タイトル：" + title);
		System.out.println("単　　価：" + price);
		System.out.println("ページ数：" + pagecnt);
	}
	
	void shopping(int num) {
		int kingaku = price * num;
		System.out.println(num + "冊買いました。合計金額は" + kingaku + "円です。");
	}
	
	int readTime(int time){
		int allTime = time * pagecnt;
		return allTime;
	}
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
		System.out.println("＜オブジェクトb1＞");
		b1.show();
		b1.shopping(10);
		b1.shopping(5);
		
		System.out.println("1ページ2分で読むと" + b1.readTime(2) + "分かります。");
		System.out.println("1ページ5分で読むと" + b1.readTime(5) + "分かります。");
		
		Book b2;
		b2 = new Book();
		b2.title = "JavaScriptの絵本";
		b2.price = 1500;
		b2.pagecnt = 250;
		System.out.println("\n＜オブジェクトb2＞");
		b2.show();
		b2.shopping(10);
		b2.shopping(5);
		
		System.out.println("1ページ2分で読むと" + b2.readTime(2) + "分かります。");
		System.out.println("1ページ5分で読むと" + b2.readTime(5) + "分かります。");
	}
}