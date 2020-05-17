package sikuli;

public class class1 {

	public static void main(String[] args) {
		System.out.println("before try");
		
		
		try {
		int divide = 10/0;
		System.out.println(divide);
		
		}catch(Exception e) {
			System.out.println("bad math operation");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("after try ");
	}
}
