import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManagerFunction {
	public List<Employee> listEmployee = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

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
		System.out.println("6. Displaying an alphabetical list  ");
		System.out.println("7. Exit");
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

	public void UpdateEmployeeById(int id) {
		boolean isExisted = false;
		for (int i = 0; i < listEmployee.size(); i++) {
			if (listEmployee.get(i).getMid() == id) {
				isExisted = true;
				System.out.println("Employee's Information");
				listEmployee.get(i).showInfor();
				System.out.println("Update");
				FullTime fullTime = new FullTime();
				fullTime.input(sc);
				listEmployee.set(i, fullTime);
				break;
			}
		}
		if (!isExisted) {
			System.out.println("Id not existed. !!!");
		} else {
			System.out.println("Update Employee Complete...!!!");
		}
	}

	public void DeleteEmployeeById(int id) {
		Employee e = null;
		for (int i = 0; i < listEmployee.size(); i++) {
			if (listEmployee.get(i).getMid() == id) {
				e = listEmployee.get(i);
				break;
			}
		}
		if (e != null) {
			listEmployee.remove(e);

		} else {
			System.out.println("Complete...!!!");
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

	public int inputId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input student id: ");
		while (true) {
			try {
				int id = Integer.parseInt((sc.nextLine()));
				return id;
			} catch (NumberFormatException ex) {
				System.out.print("invalid! Input student id again: ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManagerFunction manafun = new ManagerFunction();
		int mid;
		// initialization object
		int option;
		do {
			manafun.initMenu(sc);
			option = sc.nextInt();
			// switch case ste
			switch (option) {
			case 1:
				manafun.add(sc);
				break;
			case 2:
				manafun.showListPerson();
				break;
			case 3:
				mid = manafun.inputId();
				manafun.UpdateEmployeeById(mid);
				break;
			case 4:
				mid = manafun.inputId();
				manafun.DeleteEmployeeById(mid);
				break;
			case 5:
				manafun.getTotalSalaryOfAllEmployee();
				break;
			case 6:
				manafun.SortName();
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
