import java.util.*;
class Employee{
    String name;
    int eno;
    Employee(String name,int eno){
        this.name=name;
        this.eno=eno;
    }
    
    public String toString(){
        return eno + " : " +name;
    }
}
public class Demo4
{
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("John",45));
		empList.add(new Employee("Mathew",40));
		empList.add(new Employee("Henry",5));
		empList.add(new Employee("Jerry",150));
		
		System.out.println(empList);
		
		//we want all these employee to be stored in sorted order based on ascending order of eno
		Collections.sort(empList,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println("Sorted based on employee number : " + empList);
		
		Collections.sort(empList,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println("Sorted alphabetically based on Employee name : " + empList);
	}
}
