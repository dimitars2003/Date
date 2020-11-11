import java.awt.Color;
import java.util.Scanner;

import javax.swing.*;


public class LookReminder {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		JFrame window=new JFrame();
		window.setBounds(100,100, 800, 800);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setBounds(10,10,100,50);
		window.add(lblMonday);
		
		JLabel lblThuesday = new JLabel("Thuesday");
		lblThuesday.setBounds(120,10,100,50);
		window.add(lblThuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setBounds(230,10,100,50);
		window.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setBounds(340,10,100,50);
		window.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setBounds(450,10,100,50);
		window.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setBounds(560,10,100,50);
		window.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setBounds(670,10,100,50);
		window.add(lblSunday);	
		
		
		
		int x = 10;
		int y = 70;
		int lenght = 100;
		int width = 100;
		int i = 0;
		int leghtl = 10;
		int width1 = 10;
		JPanel CalendarPanel [] = new JPanel[42];
		JLabel CalendarNumber [] = new JLabel [42];
		

		
		
		
		while (true) {
			while(i/7==0) {
				CalendarPanel[i] = new JPanel();
				CalendarNumber[i] = new JLabel();
				if(i%7==6||i%7==5) {
					CalendarPanel[i] = SetPanelWeekend(x,y,lenght,width);
				}
				else CalendarPanel[i] = SetPanel(x,y,lenght,width);
				window.add(CalendarPanel[i]);
				CalendarNumber[i]=SetLableDate(x,y,leghtl, width1, i+1);
				CalendarPanel[i].add(CalendarNumber[i]);
				x+=110;
				i++;
			}
			y+=110;
			x=10;
			while(i/7==1) {
				CalendarPanel[i] = new JPanel();
				CalendarNumber[i] = new JLabel();
				if(i%7==6||i%7==5) {
					CalendarPanel[i] = SetPanelWeekend(x,y,lenght,width);
				}
				else
				CalendarPanel[i] = SetPanel(x,y,lenght,width);
				window.add(CalendarPanel[i]);
				CalendarNumber[i]=SetLableDate(x,y,leghtl, width1, i+1);
				CalendarPanel[i].add(CalendarNumber[i]);
				x+=110;
				i++;
			}
			y+=110;
			x=10;
			while(i/7==2) {
				CalendarPanel[i] = new JPanel();
				CalendarNumber[i] = new JLabel();
				if(i%7==6||i%7==5) {
					CalendarPanel[i] = SetPanelWeekend(x,y,lenght,width);
				}
				else
				CalendarPanel[i] = SetPanel(x,y,lenght,width);
				window.add(CalendarPanel[i]);
				CalendarNumber[i]=SetLableDate(x,y,leghtl, width1, i+1);
				CalendarPanel[i].add(CalendarNumber[i]);
				x+=110;
				i++;
			}
			y+=110;
			x=10;
			while(i/7==3) {
				CalendarPanel[i] = new JPanel();
				CalendarNumber[i] = new JLabel();
				if(i%7==6||i%7==5) {
					CalendarPanel[i] = SetPanelWeekend(x,y,lenght,width);
				}
				else
				CalendarPanel[i] = SetPanel(x,y,lenght,width);
				window.add(CalendarPanel[i]);
				CalendarNumber[i]=SetLableDate(x,y,leghtl, width1, i+1);
				CalendarPanel[i].add(CalendarNumber[i]);
				x+=110;
				i++;
			}
			y+=110;
			x=10;
			while(i/7==4) {
				
				CalendarPanel[i] = new JPanel();
				if(i%7==6||i%7==5) {
					CalendarPanel[i] = SetPanelWeekend(x,y,lenght,width);
				}
				else
				CalendarPanel[i] = SetPanel(x,y,lenght,width);
				window.add(CalendarPanel[i]);
				CalendarNumber[i]=SetLableDate(x,y,leghtl, width1, i+1);
				CalendarPanel[i].add(CalendarNumber[i]);
				x+=110;
				i++;
			}
			if(i>30) {
				break;
			}
			y+=110;
			x=10;
			while(i/7==5) {
				CalendarPanel[i] = new JPanel();
				CalendarNumber[i] = new JLabel();
				if(i%7==6||i%7==5) {
					CalendarPanel[i] = SetPanelWeekend(x,y,lenght,width);
				}
				else
				CalendarPanel[i] = SetPanel(x,y,lenght,width);
				window.add(CalendarPanel[i]);
				CalendarNumber[i]=SetLableDate(x,y,leghtl, width1, i+1);
				CalendarPanel[i].add(CalendarNumber[i]);
				x+=110;
				i++;
			}
			
			break;
		}
		
		
		Reminder events = new Reminder ();
		Date d1 = new Date (1,1,1,12,3,1);
		Date d2 = new Date (21,1,1,12,3,1);
		Date d3 = new Date (4,1,1,12,3,1);
		Date d4 = new Date (11,1,1,12,3,1);
		Event e1 = new Event ("Test",d1);
		Event e2 = new Event ("Test",d2);
		Event e3 = new Event ("Test",d3);
		Event e4 = new Event ("Test",d4);
		
		events.addEvent(e1);
		
	
		e2.setName("Project");
		events.addEvent(e2);
		
		
		e3.setName("Birthday party");
		events.addEvent(e3);
		
		e4.setName("Birthday party");
		events.addEvent(e4);
		
		
		x=10;
		y=90;
		lenght=70;
		width=30;
		
		Event [] tempe; 
		Date temp = new Date (1,1,1,1,1,1);
		Date getday = new Date ();
		tempe=events.getAllEventsAt(temp);
		System.out.println(tempe.length);
		JLabel [] templ = new JLabel[tempe.length];
		System.out.println("da");
		for(int num = 0; num<tempe.length;num++) {
			System.out.println("da");
			getday=tempe[num].getDate();
			System.out.println(getday.toString());
			for(int day = 1; day<32; day++) {
				temp.setday(day);
				tempe=events.getAllEventsAt(temp);
				if(getday.getday()==temp.getday()) {
				System.out.println("da");
				templ[num]=SetLableEvent(x,y,lenght,width, tempe[num].getName());
				CalendarPanel[day-1].add(templ[num]);
				}
				x+=110;
				if(day%7==6) {
					y+=110;
					x=10;
				}
				
			
			}
			
		}
			//System.out.println(tempe.length);
			//System.out.println(temp.toString());
		
		/*for(int num = 0; num<tempe.length;num++) {
			
			for(int day = 1; day<32; day++) {
				
				System.out.println(tempe.length);
				if(tempe.length>0) {
				if(tempe[num].getName()!=null) {
					templ=SetLableEvent(x,y,lenght,width, tempe[num].getName());
					CalendarPanel[day-1].add(templ);
				}
				x+=110;
				if(day%7==6) {
					y+=110;
					x=10;
				}
				temp.setday(temp.getday()+1);
				}
			}
		}*/
		
		window.setVisible(true);
		scan.close();
	}
		



	public static JPanel SetPanel(int x, int y, int lenght, int width ) {
		JPanel panel = new JPanel ();
		panel.setBounds(x,y,lenght,width);	
		panel.setBackground(Color.gray);
		return panel;
	}
	
	public static JPanel SetPanelWeekend(int x, int y, int lenght, int width ) {
		JPanel panel = new JPanel ();
		panel.setBounds(x,y,lenght,width);	
		panel.setBackground(Color.red);
		return panel;
	}
	
	public static JLabel SetLableDate(int x, int y, int lenght, int width, int date) {
		
		JLabel lable = new JLabel();
		
		lable.setBounds(x,y,lenght,width);
		lable.setBackground(Color.white);
		if(date<32)
		lable.setText(date+"");
		
		
		return lable;
	}
	
	public static JLabel SetLableEvent(int x, int y, int lenght, int width, String name) {
		JLabel lable = new JLabel();
		
		lable.setBounds(x,y,lenght,width);
		lable.setBackground(Color.white);
		lable.setText(name);
		return lable;
	}
}