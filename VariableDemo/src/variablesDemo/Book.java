package variablesDemo;

public class Book {
	int a=0;
	void m() {
		int a=10;
		System.out.println(this.a);
		if(a==10) {
			int b = 20;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.m();
	}

}
