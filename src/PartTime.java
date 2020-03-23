import java.util.Scanner;

public class PartTime extends Employee {
	public static int mWorkDay;
	public int realIncome;

	public int getRealIncome() {
		return realIncome;
	}

	public void setRealIncome(int realIncome) {
		this.realIncome = realIncome;
	}

	public static int getmWorkDay() {
		return mWorkDay;
	}

	public static void setmWorkDay(int mWorkDay) {
		PartTime.mWorkDay = mWorkDay;
	}

	public PartTime() {
		// TODO Auto-generated constructor stub
	}

	public void input(Scanner scanner) {
		super.input(scanner);
		System.out.print("PartTime of WorkDay : ");
		this.mWorkDay = scanner.nextInt();
	}

	public void RealIncome() {
		realIncome = mWorkDay * 500000;
		System.out.println("PartTime of RealIncome :" + realIncome);
	}

	@Override
	public int getSalary() {
		return mSalary;
		// TODO Auto-generated method stub
	}

	@Override
	public void showInfor() {
		System.out.println("----- INFORMATION OF A Employee --------");
		System.out.println("ID: " + this.mid);
		System.out.println("NAME: " + this.mName);
		System.out.println("DateOfBirth: " + this.mDateOfBirth);
		System.out.println("Salary: " + this.getmSalary());
		System.out.println("PartTime of WorkDay: " + this.mWorkDay);
		RealIncome();
	}

}
