public class Date {
	private int sek;
	private int min;
	private int chas;
	private int den;
	private int mes;
	private int god;

	public Date() {

	}

	public Date(int s, int m, int ch, int d, int ms, int g) {
		sek = s;
		min = m;
		chas = ch;
		den = d;
		mes = ms;
		god = g;
		// popalva vsi4ki poleta
	}

	public int getSek() {
		return (sek);
	}

	public int getMin() {
		return (min);
	}

	public int getChas() {
		return (chas);
	}

	public int getDen() {
		return (den);
	}

	public int getMes() {
		return (mes);
	}

	public int getGod() {
		return (god);
	}

	public void setSek(int s) {
		sek = s;
	}

	public void setMin(int m) {
		min = m;
	}

	public void setDen(int d) {
		den = d;
	}

	public void setChas(int ch) {
		chas = ch;
	}

	public void setMes(int m) {
		mes = m;
	}

	public void setGod(int g) {
		god = g;
	}

	public int compareTo(Date d1) {
		if (god > d1.getGod()) {
			return (-1);
		} else if (god < d1.getGod()) {
			return (1);
		} else {
			if (mes > d1.getMes()) {
				return (-1);
			} else if (mes < d1.getMes()) {
				return (1);
			} else {
				if (den > d1.getDen()) {
					return (-1);
				} else if (den < d1.getDen()) {
					return (1);
				} else {
					if (chas > d1.getChas()) {
						return (-1);
					} else if (chas < d1.getChas()) {
						return (1);
					} else {
						if (min > d1.getMin()) {
							return (-1);
						} else if (min > d1.getMin()) {
							return (1);
						} else {
							if (sek > d1.getSek()) {
								return (-1);
							} else if (sek < d1.getSek()) {
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
		if (god % 4 != 0) {
			check++;
		} else if (god % 100 != 0) {
			return (check);
		} else if (god % 400 != 0) {
			check++;
		} else {
			return (check);
		}
		return (check);
	}

	public int checkDate(Date d1) {
		int sbor = 0;
		int i = 0;
		while (d1.getMes()-1 > i) {
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
		sbor+=d1.getDen();
		
		return (sbor);
	}
	public int checkWeek(Date d1) {
		int week = 0;
		week=checkDate(d1)/7+1;
		return (week);
	}
	public void addSek(Date d1) {
		d1.setSek(d1.getSek()+1);
		if(d1.getSek()>=60) {
			d1.setSek(d1.getSek()-60);
			d1.setMin(d1.getMin()+1);
			if(d1.getMin()>=60) {
				d1.setMin(d1.getMin()-60);
				d1.setChas(d1.getChas()+1);
				if(d1.getChas()>=24) {
					d1.setChas(d1.getChas()-24);
					d1.setDen(d1.getDen()+1);
					if(d1.getDen()>28&&d1.getMes()==2&&d1.leapYear()==1) {
						d1.setDen(d1.getDen()-28);
						d1.setMes(d1.getMes()+1);
						if(d1.getMes()>=12) {
							d1.setMes(d1.getMes()-12);
							d1.setGod(d1.getGod()+1);
						}
					}
					else if(d1.getDen()>29&&d1.getMes()==2&&d1.leapYear()==0) {
						d1.setDen(d1.getDen()-29);
						d1.setMes(d1.getMes()+1);
						if(d1.getMes()>=12) {
							d1.setMes(d1.getMes()-12);
							d1.setGod(d1.getGod()+1);
						}
					}
					else if(d1.getDen()>30&&(d1.getMes()==4||d1.getMes()==6||d1.getMes()==9||d1.getMes()==11)) {
						d1.setDen(d1.getDen()-30);
						d1.setMes(d1.getMes()+1);
						if(d1.getMes()>=12) {
							d1.setMes(d1.getMes()-12);
							d1.setGod(d1.getGod()+1);
						}
					}
					else if(d1.getDen()>31) {
						d1.setDen(d1.getDen()-31);
						d1.setMes(d1.getMes()+1);
						if(d1.getMes()>=12) {
							d1.setMes(d1.getMes()-12);
							d1.setGod(d1.getGod()+1);
						}
					}
				}
			}
		}
		System.out.println(d1.getSek()+":"+d1.getMin()+":"+d1.getChas()+" "+d1.getDen()+":"+d1.getMes()+":"+d1.getGod());
	}
	
}
