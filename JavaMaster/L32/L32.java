class Lucky {
	int ransu;
	String kekka;
	String getColor() {
		ransu = Integer.parseInt(Math.random() * 6);
		switch(ransu) {
		case 0:
			kekka = "赤";
			break;
			
		case 1:
			kekka = "黄";
			break;
			
		case 2:
			kekka = "青";
			break;
			
		case 3:
			kekka = "緑";
			break;
			
		case 4:
			kekka = "黒";
			break;
			
		case 5:
			kekka = "白";
			break;
			
			return kekka;
		}
	}
}

class L32 {
	public static void main(String args[]){
		String color;
		Lucky myLucky = new Lucky();
		color = myLucky.getColor();
		System.out.println("今日のラッキーカラーは " + color);
	}
}