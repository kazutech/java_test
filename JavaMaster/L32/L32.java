class Lucky {
	int ransu;
	String kekka;
	String getColor() {
		ransu = Integer.parseInt(Math.random() * 6);
		switch(ransu) {
		case 0:
			kekka = "��";
			break;
			
		case 1:
			kekka = "��";
			break;
			
		case 2:
			kekka = "��";
			break;
			
		case 3:
			kekka = "��";
			break;
			
		case 4:
			kekka = "��";
			break;
			
		case 5:
			kekka = "��";
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
		System.out.println("�����̃��b�L�[�J���[�� " + color);
	}
}