public class Date {
	private int second;
	private int minute;
	private int hour;
	private int day;
	private int month;
	private int year;
	private DayOfWeek dayOfWeek;
	public Date() {
		second = 0;
		minute = 0;
		hour = 0;
		day = 1;
		month = 1;
		year = 1;
	}
	

	public Date(int s, int m, int ch, int d, int ms, int g, DayOfWeek dw) {
		second = s;
		minute = m;
		hour = ch;
		day = d;
		month = ms;
		year = g;
		dayOfWeek = dw;
		// popalva vsi4ki poleta
	}
	
	public int getsecond() {
		return (second);
	}

	public int getminute() {
		return (minute);
	}

	public int gethour() {
		return (hour);
	}

	public int getday() {
		return (day);
	}

	public int getmonth() {
		return (month);
	}

	public int getyear() {
		return (year);
	}

	public void setsecond(int s) {
		if(s>=0&&s<60)
		second = s;
	}

	public void setminute(int m) {
		if(m>=0&&m<=59)
		minute = m;
	}

	public void setday(int d) {
		if(d>0&&d<32)
		day = d;
	}

	public void sethour(int h) {
		if(h>=0&&h<24)
		hour = h;
	}

	public void setmonth(int m) {
		if(m>0&&m<13)
		month = m;
	}

	public void setyear(int y) {
		year = y;
	}

	public int compareTo(Date d1) {
		if (year > d1.getyear()) {
			return (-1);
		} else if (year < d1.getyear()) {
			return (1);
		} else {
			if (month > d1.getmonth()) {
				return (-1);
			} else if (month < d1.getmonth()) {
				return (1);
			} else {
				if (day > d1.getday()) {
					return (-1);
				} else if (day < d1.getday()) {
					return (1);
				} else {
					if (hour > d1.gethour()) {
						return (-1);
					} else if (hour < d1.gethour()) {
						return (1);
					} else {
						if (minute > d1.getminute()) {
							return (-1);
						} else if (minute > d1.getminute()) {
							return (1);
						} else {
							if (second > d1.getsecond()) {
								return (-1);
							} else if (second < d1.getsecond()) {
								return (1);
							} else {
								return (0);
							}
						}
					}
				}
			}
		}
	}

	public int checkyear(int a) {
		return (a);
	}

	public int leapYear() {
		int check = 0;
		if (year % 4 != 0) {
			check++;
		} else if (year % 100 != 0) {
			return (check);
		} else if (year % 400 != 0) {
			check++;
		} else {
			return (check);
		}
		return (check);
	}

	public int checkDate(Date d1) {
		int sbor = 0;
		int i = 0;
		while (d1.getmonth()-1 > i) {
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
				sbor += 31;
			}
			else if (i == 1) {
				if (d1.leapYear() == 0) {
					sbor += 29;
				} else
					sbor += 28;

			} else
				sbor += 30;
			i++;
		}
		sbor+=d1.getday();
		
		return (sbor);
	}
	public int checkWeek(Date d1 ) {
		int week = 0;
		week=checkDate(d1)/7+1;
		return (week);
	}
	public void addsecond(Date d1) {
		d1.setsecond(d1.getsecond()+1);
		if(d1.getsecond()>=60) {
			d1.setsecond(d1.getsecond()-60);
			d1.setminute(d1.getminute()+1);
			if(d1.getminute()>=60) {
				d1.setminute(d1.getminute()-60);
				d1.sethour(d1.gethour()+1);
				if(d1.gethour()>=24) {
					d1.sethour(d1.gethour()-24);
					d1.setday(d1.getday()+1);
					if(d1.getday()>28&&d1.getmonth()==2&&d1.leapYear()==1) {
						d1.setday(d1.getday()-28);
						d1.setmonth(d1.getmonth()+1);
						if(d1.getmonth()>=12) {
							d1.setmonth(d1.getmonth()-12);
							d1.setyear(d1.getyear()+1);
						}
					}
					else if(d1.getday()>29&&d1.getmonth()==2&&d1.leapYear()==0) {
						d1.setday(d1.getday()-29);
						d1.setmonth(d1.getmonth()+1);
						if(d1.getmonth()>=12) {
							d1.setmonth(d1.getmonth()-12);
							d1.setyear(d1.getyear()+1);
						}
					}
					else if(d1.getday()>30&&(d1.getmonth()==4||d1.getmonth()==6||d1.getmonth()==9||d1.getmonth()==11)) {
						d1.setday(d1.getday()-30);
						d1.setmonth(d1.getmonth()+1);
						if(d1.getmonth()>=12) {
							d1.setmonth(d1.getmonth()-12);
							d1.setyear(d1.getyear()+1);
						}
					}
					else if(d1.getday()>31) {
						d1.setday(d1.getday()-31);
						d1.setmonth(d1.getmonth()+1);
						if(d1.getmonth()>=12) {
							d1.setmonth(d1.getmonth()-12);
							d1.setyear(d1.getyear()+1);
						}
					}
				}
			}
		}
		System.out.println(d1.getsecond()+":"+d1.getminute()+":"+d1.gethour()+" "+d1.getday()+":"+d1.getmonth()+":"+d1.getyear());
	}
	
}
