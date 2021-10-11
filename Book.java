interface Book{
void book1();
}
interface Book2 extends Book{
void book2();
}

class note implements Book, Book2{
public void book1(){
	System.out.println("Print book1 method");
}	
public void book2(){
System.out.println("Print book2 method");
	
}
}	
class main{
	public static void main(String[] args){
note ref = new note();

ref.book1();
ref.book2();

	}
}	
	