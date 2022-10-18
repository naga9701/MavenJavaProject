class student {
	String name;
	int rollno;
	student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student("naga",100);
		student s2 = new student("durga",101);
		student s3 = new student("naga",100);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}

}
