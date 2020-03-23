import java.util.Scanner;

public class FullTime extends Employee {
	public static int mWorkDay;
	public int realIncome;

	public int getRealIncome() {
		return realIncome;
	}

	public void setRealIncome(int realIncome) {
		this.realIncome = realIncome;
	}

	public int getmWorkDay() {
		return mWorkDay;
	}

	public void setmWorkDay(int mWorkDay) {
		FullTime.mWorkDay = mWorkDay;
	}

	public FullTime() {
		// TODO Auto-generated constructor stub
	}

	public void input(Scanner scanner) {
		super.input(scanner);
		System.out.print("FullTime of WorkDay : ");
		this.mWorkDay = scanner.nextInt();
	}

	@Override
	public int getSalary() {
		return mSalary;
	}

	public void RealIncome() {
		realIncome = (mWorkDay * 1200000) + 800000;
		System.out.println("FullTime of RealIncome :" + realIncome);
	}

	@Override
	public void showInfor() {
		System.out.println("----- INFORMATION OF A Employee --------");
		System.out.println("ID: " + this.mid);
		System.out.println("NAME: " + this.mName);
		System.out.println("DateOfBirth: " + this.mDateOfBirth);
		System.out.println("Salary: " + this.getmSalary());
		System.out.println("FullTime of WorkDay: " + this.mWorkDay);
		RealIncome();
	}

}
