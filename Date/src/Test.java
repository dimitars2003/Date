import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int temp = scan.nextInt();
		System.out.println(DayOfWeek.getName(temp%7));
		temp=scan.nextInt();
		Date d1 = new Date ();
		d1.setsecond(temp);
		temp = scan.nextInt();
		d1.setminute(temp);
		temp = scan.nextInt();
		d1.sethour(temp);
		temp = scan.nextInt();
		d1.setday(temp);
		temp = scan.nextInt();
		d1.setmonth(temp);
		temp = scan.nextInt();
		d1.setyear(temp);
		System.out.println(DayOfWeek.getDayOfWeek(d1.checkDate(d1)%7));
		System.out.println(DayOfWeek.getDayOfWeek(d1.checkDate(d1)%7).toString(3));
		temp = scan.nextInt();
		Date d2 = new Date ();
		d2.setsecond(temp);
		temp = scan.nextInt();
		d2.setminute(temp);
		temp = scan.nextInt();
		d2.sethour(temp);
		temp = scan.nextInt();
		d2.setday(temp);
		temp = scan.nextInt();
		d2.setmonth(temp);
		temp = scan.nextInt();
		d2.setyear(temp);
		System.out.println(DayOfWeek.getDayOfWeek(d2.checkDate(d2)%7));
		System.out.println(DayOfWeek.getDayOfWeek(d2.checkDate(d2)%7).toString(3));
		System.out.println(d1.compareTo(d2));
		if(d1.leapYear()==0) {
			System.out.println("Leap year");
		}
		else System.out.println("Common year");
		if(d2.leapYear()==0) {
			System.out.println("Leap year");
		}
		else System.out.println("Common year");
		System.out.println(d1.checkDate(d1));
		System.out.println(d1.checkWeek(d1));
		d1.addsecond(d1);
		int n = scan.nextInt();
		Date [] dm = new Date [n] ;
		for (int i = 0; i < n; i++) {
			dm[i]= new Date ();
			temp=scan.nextInt();
			dm[i].setsecond(temp);
			temp = scan.nextInt();
			dm[i].setminute(temp);
			temp = scan.nextInt();
			dm[i].sethour(temp);
			temp = scan.nextInt();
			dm[i].setday(temp);
			temp = scan.nextInt();
			dm[i].setmonth(temp);
			temp = scan.nextInt();
			dm[i].setyear(temp);
		}
		sortDate(dm);
		for (int i = 0; i < n; i++) {
			dm[i].toString();
		}
		
	}
	public static void sortDate(Date [] d1) {
		Date temp;
		for (int i = 0; i <d1.length-1;i++) {
			for (int j = 1; j <d1.length;j++) {
				if(d1[i].compareTo(d1[j])==-1) {
					temp = d1[i];
					d1[i] = d1[j];
					d1[j]=temp;
				}
			}
		}
	}
}
