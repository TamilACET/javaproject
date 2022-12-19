package Program1;
import java.io.*;
public class employee {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the employee name, id and salary:");
		String name=br.readLine();
		int eid=Integer.parseInt(br.readLine());
		double sal=Double.parseDouble(br.readLine());
		System.out.println("Employee Name:"+name);
		System.out.println("Emp id:"+eid);
		System.out.println("salary:"+sal);
	}
}
