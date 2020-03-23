import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManagerFunction {
	public List<Employee> listEmployee = new ArrayList<>();

	public ManagerFunction() {
		// TODO Auto-generated constructor stub
	}

	Employee employee = new FullTime();

	public void initMenu(Scanner sc) {
		System.out.println("OPTIONAL");
		System.out.println("\t\t=== Manager Employee ===");
		System.out.println("1. Input employee (Full-time and part-time)  ");
		System.out.println("2. Show payroll list. ");
		System.out.println("3. Update or edit  of an employee by Id ");
		System.out.println("4. Delete of an employee by Id ");
		System.out.println("5. Show total salary  ");
		System.out.println("5. Displaying an alphabetical list  ");
		System.out.println("6. Exit");
	}

	public void add(Scanner sc) {
		FullTime fullTime = new FullTime();
		fullTime.input(sc);
		listEmployee.add(fullTime);

	}

	public void showListPerson() {
		for (int i = 0; i < listEmployee.size(); i++) {
			System.out.println("=== Information Employee " + (i + 1) + " ===");
			listEmployee.get(i).showInfor();
		}
	}

	public void SortName() { // sap xep tang dan
		Collections.sort(listEmployee, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getmName().compareTo(e2.getmName());
			}
		});
		System.out.println("Complete...!!!");
	}

	public void getTotalSalaryOfAllEmployee() {
		int total = 0;
		for (Employee employee1 : listEmployee) {
			total += employee1.getSalary();
		}

		System.out.println(" Total salary must paid :" + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManagerFunction a = new ManagerFunction();
		// initialization object
		int option;
		do {
			a.initMenu(sc);
			option = sc.nextInt();
			// switch case ste
			switch (option) {
			case 1:
				a.add(sc);
				break;

			case 2:
				a.showListPerson();
				break;

			case 3:

				break;
			case 4:

				break;
			case 5:
				a.getTotalSalaryOfAllEmployee();
				break;

			case 6:
				a.SortName();
				break;

			case 7:
				System.exit(0);
				break;

			default:
				// initMenu(sc);
				break;
			}
		} while (option != 7);

	}

}
