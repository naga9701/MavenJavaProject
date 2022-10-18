class students {
	String name;
	int rollno;
	students(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students s1 = new students("naga",100);
		students s2 = new students("naga",100);
		System.out.println(s1.equals(s2));
		System.out.println(s2);
	}

}
