
public class MethodRule_3 {
	public static void main(String[] args) {
		MethodRule_3 obj = new MethodRule_3();
		obj.TestMethod2();
		obj.TestMethod();
		System.out.println ("Main Method ends");
	}
	public void TestMethod() {
		System.out.println ("test Method");
		MethodRule_3 obj2 = new MethodRule_3();
		obj2.TestMethod2();
	}
	public void TestMethod2() {
		System.out.println("test Method2");
	}


}
