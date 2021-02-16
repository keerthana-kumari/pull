
public class MethodRule_1 {

	public static void main(String[] args) {
		//We can call non-static method we do object creation and call the    method  
				MethodRule_1 obj=new MethodRule_1();
						obj.TestMethod();
						//We can call static method by class name  
						MethodRule_1.TestMethod2();
						//We can call static method by direct method name  
						TestMethod2();
					}
					public  void TestMethod() {
						System.out.println("test Method");
					}
					public static void TestMethod2() {
						System.out.println("test Method");
					}


	

}
