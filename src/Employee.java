import java.util.Scanner;

public abstract class Employee {
	public int mid;
	public String mName;
	public String mDateOfBirth;
	public int mSalary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmDateOfBirth() {
		return mDateOfBirth;
	}

	public void setmDateOfBirth(String mDateOfBirth) {
		this.mDateOfBirth = mDateOfBirth;
	}

	public int getmSalary() {
		return mSalary;
	}

	public void setmSalary(int mSalary) {
		this.mSalary = mSalary;
	}

	public Employee(int mid, String mName, String mDateOfBirth, int mSalary) {
		super();
		this.mid = mid;
		this.mName = mName;
		this.mDateOfBirth = mDateOfBirth;
		this.mSalary = mSalary;
	}

	public abstract int getSalary();

	public abstract void showInfor();

	public void input(Scanner scanner) {
		System.out.print("Employee  id: ");
		this.mid = scanner.nextInt();

		System.out.print("Employee  name: ");
		this.mName = scanner.next();

		System.out.print("Employee  DateOfBirth: ");
		this.mDateOfBirth = scanner.next();

		System.out.print("Employee  Salary: ");
		this.mSalary = scanner.nextInt();
	}
}
