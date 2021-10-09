package lists;

public class Singlylinkedlist {

	public static void main(String[] args) {
		Employee janeJones= new Employee("Jane", "Jones", 432);
		Employee johnDoe= new Employee("John", "Doe", 456);
		Employee marrySmith= new Employee("Marry", "Smith", 4982);
		Employee mikeWilson= new Employee("Mike", "Wilson", 1213);
		
		EmployeeLinkedlist list= new EmployeeLinkedlist();
		System.out.println(list.isEmpty());
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printlist();
		System.out.println(list.getSize());
	
		Employee billEnd= new Employee("Bill", "End", 78);
		list.addtoEnd(billEnd);
		list.printlist();
		System.out.println(list.getSize());
		list.removefromFront();
		list.printlist();
		System.out.println(list.getSize());
		list.removefromEnd();
		list.printlist();
		System.out.println(list.getSize());
	}

}
