package codingchallange1;

public class Challange1 {
	
	public static void main(String[] args) {
	
		Customer customer1 = new Customer();
		
		customer1.fullName = "Sachin Mehta GL";
		customer1.age = 21;
		
		System.out.println("Customer Full Name : " + customer1.fullName);
		System.out.println("Customer Age : " + customer1.age);
		}

}


class Customer{
	
	String fullName;
	int age;
	
}