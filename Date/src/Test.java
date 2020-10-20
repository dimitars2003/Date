import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int temp = scan.nextInt();
		Date d1 = new Date ();
		d1.setSek(temp);
		temp = scan.nextInt();
		d1.setMin(temp);
		temp = scan.nextInt();
		d1.setChas(temp);
		temp = scan.nextInt();
		d1.setDen(temp);
		temp = scan.nextInt();
		d1.setMes(temp);
		temp = scan.nextInt();
		d1.setGod(temp);
		temp = scan.nextInt();
		Date d2 = new Date ();
		d2.setSek(temp);
		temp = scan.nextInt();
		d2.setMin(temp);
		temp = scan.nextInt();
		d2.setChas(temp);
		temp = scan.nextInt();
		d2.setDen(temp);
		temp = scan.nextInt();
		d2.setMes(temp);
		temp = scan.nextInt();
		d2.setGod(temp);
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
		d1.addSek(d1);
		int n = scan.nextInt();
		Date [] dm = new Date [n] ;
		for (int i = 0; i < n; i++) {
			dm[i]= new Date ();
			temp=scan.nextInt();
			dm[i].setSek(temp);
			temp = scan.nextInt();
			dm[i].setMin(temp);
			temp = scan.nextInt();
			dm[i].setChas(temp);
			temp = scan.nextInt();
			dm[i].setDen(temp);
			temp = scan.nextInt();
			dm[i].setMes(temp);
			temp = scan.nextInt();
			dm[i].setGod(temp);
		}
		sortDate(dm);
		for (int i = 0; i < n; i++) {
			System.out.println(dm[i].getSek()+":"+dm[i].getMin()+":"+dm[i].getChas()+" "+dm[i].getDen()+":"+dm[i].getMes()+":"+dm[i].getGod());
		}
		scan.close();
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
