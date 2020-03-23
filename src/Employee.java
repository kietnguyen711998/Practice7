import java.util.Scanner;

public abstract class Employee {
	public String mid;
	public String mName;
	public String mDateOfBirth;
	public int mSalary;

	// static la no tao ra duoc 1 lan, nen mi nhap nhap nhap thi mmSalaryFactor cua
	// tat ca cac employee == thang nhap cuoi cung
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
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

	public Employee(String mid, String mName, String mDateOfBirth, int mSalary) {
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
		this.mid = scanner.next();

		System.out.print("Employee  name: ");
		this.mName = scanner.next();

		System.out.print("Employee  DateOfBirth: ");
		this.mDateOfBirth = scanner.next();

		System.out.print("Employee  Salary: ");
		this.mSalary = scanner.nextInt();

//		System.out.print("Employee  WorkDay : ");
//		FullTime.mWorkDay = scanner.nextLine();
//
//		System.out.print("Employee WorkDay: ");
//		PartTime.mWorkDay = scanner.nextLine();
	}
}
