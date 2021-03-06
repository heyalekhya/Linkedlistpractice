package lists;

public class EmployeeLinkedlist {
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node=new EmployeeNode(employee);
		node.setNext(head);
		if(head==null) {
			tail=node;
		}
		else {
			head.setPrevious(node);
		}
		
		head=node;
		size++;
	}
	
	public void addtoEnd(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		if(tail==null) {
			head=null;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail=node;
		size++;
	}
	
	public EmployeeNode removefromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removenode= head;
		
		if(head.getNext()==null) {
			tail=null;
		}
		else {
			head.getNext().setPrevious(null);;
		}
		
		head=head.getNext();
		size--;
		removenode.setNext(null);
		return removenode;
	}
	
	public EmployeeNode removefromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removenode=tail;
		
		if(tail.getPrevious()==null) {
			head=null;
		}
		else {
			tail.getPrevious().setNext(null);;
		}
		tail=tail.getPrevious();
		size--;
		removenode.setNext(null);
		return removenode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printlist() {
		EmployeeNode current=head;
		System.out.print("HEAD ->");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current= current.getNext();
		}
		System.out.println("null");
	}
}
