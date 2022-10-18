class student{
	
}

class customer{
	
}



class Program1 {

	public static void main(String[] args) throws Exception 
	
	{
		// TODO Auto-generated method stub
		Object  o = Class.forName(args[0]).newInstance();
		System.out.println("object created for "+o.getClass().getName());
		
	}

}
