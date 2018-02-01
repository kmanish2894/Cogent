package All;

import java.util.Scanner;

public class All {

	public static void main(String[] args) {
		All s = new All();
		Scanner a = new Scanner(System.in);

		
		System.out.println("Enter area of  square to find perimeter");
		System.out.println("Perimeter of square is : " + s.Perimeter(a.nextDouble()));

		
		System.out.println("Enter the amount for which the pay back be calculated ");
		System.out.println("Total payback for the given amount is : " + s.payBk(a.nextDouble()));
		System.out.println("Enter radius and height to find volume of the cylinder");
		System.out.println("Volume is : " + s.cylinderVol(a.nextDouble(), a.nextDouble()));

		System.out.println("Enter the grosspay");
		System.out.println("Calculated tax from the given grosspay is : " + s.tax(a.nextDouble()));

		System.out.println("Enter the total number of hours worked to calc cogent tax");
		System.out.println("Cogent tax : " + s.calculateTax(a.nextInt()));

		

		System.out.println("Enter day, month, year to find  day");
		System.out.println("Day is : " + s.Day(a.nextInt(), a.nextInt(), a.nextInt()));
		System.out.println("Enter the deposit");
		System.out.println("Interest is :" + s.OneYearInterest(a.nextDouble()));
		
		
		System.out.println("Enter age");
		int age=a.nextInt();
		System.out.println("Enter M/F");
		char gender = a.next().toLowerCase().charAt(0);
		System.out.println("Enter self/prof/retired");
		String prof = a.next().toLowerCase();
		System.out.println("Enter sets value");
		int prsnl = a.nextInt();
		System.out.println("Loan Sanctioned : "+s.Loan(age,gender,prof,prsnl));
		
	}

	private int Loan(int age, char gender, String prof, int prsnl) {

		int loanAmount =0;
		if(age>=16 && age<=25) {
			if(prsnl>25000) {
				if(prof.equals("self")) {
					loanAmount= 10000;
				}
				else if(prof.equals("prof")) {
					loanAmount= 15000;
				}
			}
		}
		if(age>=26 && age<=40) {
			if(prsnl>40000) {
				if(gender=='m') {
					loanAmount= 25000;
				}
				else if(gender=='f') {
					loanAmount= 30000;
				}
			}
		}
		if(age>=41 && age<=60) {
			if(prsnl>50000) {
					loanAmount= 40000;
				
			}
		}
		if(age>=60) {
			if(prsnl>25000) {
				if(prof.equals("self")) {
					loanAmount= 35000 -(age*100);
				}
				else if(prof.equals("retired")) {
					loanAmount= 25000 - (age*100);
				}
			}
		}
		return loanAmount;
	}

	private String Day(int d, int m, int y) {
		String day = "";
		switch (dayWeek(d, m, y)) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 0:
			day = "Sunday";
			break;
		default:
			break;

		}
		return day;
	}




	public double OneYearInterest(Double deposit) {
		double rate = 4;
		if (deposit > 1000 && deposit <= 5000)
			rate = 4.5;
		else if (deposit > 5000)
			rate = 5;
		return ((deposit * rate) / 100);
	}

	public double cylinderVol(double radius, double height) {
		return Math.PI * radius * radius * height;
	}

	public double tax(Double gross) {
		double rate = 0;
		if (gross > 240 && gross <= 480)
			rate = 4.5;
		else if (gross > 480)
			rate = 5;
		return ((gross * rate) / 100);
	}

	public double calculateTax(int hours) {
		return (0.15 * (hours * 12));
	}

	public double payBk(double amount) {
		double cshBk = 0;
		
		if (amount > 1000) {
			cshBk += (0.75 / 100) * 1000;
			amount -= 1000;
		} else {
			cshBk += (0.75 / 100) * amount;
			amount -= amount;
		}
		if (amount > 1000) {
			cshBk += (0.50 / 100) * 1000;
			amount -= 1000;
		} else {
			cshBk += (0.50 / 100) * amount;
			amount -= amount;
		}
		if (amount > 500) {
			cshBk += (0.25 / 100) * 500;
			amount -= 500;
		} else if (amount < 500) {
			cshBk += (0.25 / 100) * amount;
			amount -= amount;
		}
		
		if (amount > 1000) {
			cshBk += (0.75 / 100) * 1000;
			amount -= 1000;
		} else {
			cshBk += (0.75 / 100) * amount;
			amount -= amount;
		}
		
		
		if (amount > 0) {
			cshBk += (1.00 / 100) * amount;
		}
		return cshBk;
	}



	public int dayWeek(int day, int month, int year) {
		int totalDays = 0;
		if (year > 1900 && year < 2100) {
			totalDays = nOfdays(day, month, year);
			if ((year % 4 == 0) && (month == 1 || month == 2)) {
				totalDays = totalDays - 1;
			}
			switch (month) {
			case 12:
			case 11:
				totalDays += 31;
			case 10:
				totalDays += 30;
			case 9:
				totalDays += 31;
			case 8:
				totalDays += 31;
			case 7:
				totalDays += 30;
			case 6:
				totalDays += 31;
			case 5:
				totalDays += 30;
			case 4:
				totalDays += 31;
			case 3:
				totalDays += 28;
			case 2:
				totalDays += 31;
			case 1:
				break;
			default:
				break;
			}
			totalDays += day;
		}
		return totalDays % 7;
	}

	public double Perimeter(double square) {
		return 4 * (Math.sqrt(square));
	}

	public int nOfdays(int d, int m, int y) {
		int tmp = y - 1900;
		tmp = tmp * 365;
		tmp = tmp + ((y - 1900) / 4);
		System.out.println(tmp);
		return tmp;
	}

	

}

