package day3;

public class Teststudent {
	int sid;
	String sname;
	public static void main(String[] args) 
	{
		
		Teststudent s1=new Teststudent();
		s1.sid=112;
		s1.sname="praveen";
		Teststudent s2=new Teststudent();
		s2.sid=113;
		s2.sname="M.praveen";
		System.out.println("sid:"+s1.sid+" sname:"+s1.sname);
		System.out.println("sid:"+s2.sid+" sname:"+s2.sname);
	}

}
