package lists;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("Jacob", "Smith", 125));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Marry", "Smith", 11));
		
		//employeeList.forEach(employee-> System.out.println(employee));
		//System.out.println(employeeList.get(1));
		
		//System.out.println(employeeList.isEmpty());
		
		employeeList.set(1, new Employee("John", "Adams", 454));
		//employeeList.forEach(employee-> System.out.println(employee));

		
		employeeList.add(4, new Employee("Jacob", "Smith", 125));
		//employeeList.forEach(employee-> System.out.println(employee));
		//System.out.println(employeeList.size());
//		Employee[] employeeArray= employeeList.toArray(new Employee[employeeList.size()]);
//		for(Employee employee: employeeArray) {
//			System.out.println(employee);
//		}
		System.out.println(employeeList.contains(new Employee("Marry", "Smith", 11)));
		
		System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
		
		employeeList.remove(2);
		
		employeeList.forEach(employee-> System.out.println(employee));
	}

}
