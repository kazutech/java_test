class Member {
	int id;
	String name;
	void show() {
		System.out.println("ID:" + id);
		System.out.println("名前:" + name);
	}
}

class MyClass {
	public static void main(String args[]){
		Member m = new Member();
		m.id = 100;
		m.name = "鈴木次郎";
		m.show();
	}
}