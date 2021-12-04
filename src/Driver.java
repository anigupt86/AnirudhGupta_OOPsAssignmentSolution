//Driver Class
public class Driver {
	
	//Main method
	public static void main(String[] args) {
		//Declaring the objects
		AdminDepartment AD = new AdminDepartment();
		HRDepartment HR = new HRDepartment();
		TechDepartment TD = new TechDepartment();
		
		//Displaying the functionalities of AdminDepartment
		System.out.println("Welcome to "+ AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		
		//Inserting a line break
		System.out.println("\n");
		
		//Displaying the functionalities of HRDepartment
		System.out.println("Welcome to "+ HR.departmentName());
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.isTodayAHoliday());
		
		//Inserting a line break
		System.out.println("\n");
		
		//Displaying the functionalities of TechDepartment
		System.out.println("Welcome to "+ TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(TD.isTodayAHoliday());
		
		
	}

}
