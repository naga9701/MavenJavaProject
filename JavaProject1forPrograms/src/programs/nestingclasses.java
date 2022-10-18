class student {
	String name;
	int rollno;
	student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
	return name + " "+ rollno	;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student("naga", 0547);
		System.out.println(s1.toString());
	}

}
