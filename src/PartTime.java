import java.util.Scanner;

public class PartTime extends Employee {
	public static int mWorkDay;
	public int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
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
		b = mWorkDay * 500000;
		System.out.println("PartTime of RealIncome :" + b);
	}

	@Override
	public int getSalary() {
		return mSalary;
		// TODO Auto-generated method stub

	}

	@Override
	public void showInfor() {
		System.out.println("PartTime of WorkDay: " + this.mWorkDay);
		RealIncome();
	}

}
