class Member {
	int id;
	String namae;
	
	void show() {
		System.out.println("ID:" + id);
		System.out.println("名前:" + namae);
	}
}

class MyClass {
	public static void main(String args[]){
		Member obj;
		obj = new Member();
		obj.id = 100;
		obj.namae = "鈴木次郎";
		obj.show();
	}
}