package collections;

public class MyGenericClassTest {
	
	public static void main(String[] args) {
	MyGenericClass<String> s = new MyGenericClass<>("Girish");
	
	s.getDetailsOfObject();
	System.out.println(s.getObject());
	}
}
