import java.util.Scanner;

public class TestEvent {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Event event = new Event ();
		String name = scan.next();
		event.setName(name);
		int temp = scan.nextInt();
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
		event.setDate(d1);
		System.out.println(event.toString());
		scan.close();
	}

}
