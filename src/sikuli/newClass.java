package sikuli;

public class newClass {
	public static void main(String[] args) {
		
		try {
			//DB CONNECTION
			//QUERIES
			System.out.println("Hello");
			int divide = 10/0;
			System.out.println(divide);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Closing DB connection in finally block");
		}
	}

}
