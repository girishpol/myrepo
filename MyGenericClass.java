package collections;

public class MyGenericClass<T> {
	
	T obj;
	
	MyGenericClass(T obj){
		this.obj = obj;
	}
	
	public void getDetailsOfObject() {
		System.out.println("Object type is : " + obj.getClass().getName());
	}
	
	public T getObject() {
		return this.obj;
	}

}
