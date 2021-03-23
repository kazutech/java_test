class Member {
	int id;
	String namae;
	
	void show() {
		System.out.println("ID:" + id);
		System.out.println("–¼‘O:" + namae);
	}
}

class MyClass {
	public static void main(String args[]){
		Member obj;
		obj = new Member();
		obj.id = 100;
		obj.namae = "—é–ØŽŸ˜Y";
		obj.show();
	}
}