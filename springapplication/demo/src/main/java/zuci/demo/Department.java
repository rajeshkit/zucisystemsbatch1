package zuci.demo;

public class Department {
	public Student student;
	public Product product;
	
	public Department(Product product) {
		super();
		this.product = product;
	}

	public Department(Student student) {
		super();
		this.student = student;
	}

//	public void setStudent(Student student) {
//		this.student = student;
//	}

	public void getDepartment() {
		System.out.println("get department called");
		product.getProduct();
		student.getStudent();
	}
}
