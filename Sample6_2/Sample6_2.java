class Employee {
	int id;
	void setId(int i){
		id = i;
	}
	
	int getId(){
		return id;
	}
}

class Sample6_2 {
	public static void main(String args[]){
		Employee a = new Employee();
		a.setId(100);
		
		Employee b = new Employee();
		b.setId(200);
		
		System.out.println("AÇ≥ÇÒÅF " + a.getId());
		System.out.println("BÇ≥ÇÒÅF " + b.getId());
	}
}