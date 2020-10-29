
public enum DayOfWeek {
	MONDAY,THUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	DayOfWeek (){
		
	}
	public String toString() {
			return this.name();
	}
	public String toString(int numberOfLetters){
		
		return toString().substring(0, numberOfLetters);
	}
	public static DayOfWeek getDayOfWeek(int temp) {
		if(temp==0) {
			return MONDAY;
		}
		if(temp==1) {
			return THUESDAY;
		}
		if(temp==2) {
			return WEDNESDAY;
		}
		if(temp==3) {
			return THURSDAY;
		}
		if(temp==4) {
			return FRIDAY;
		}
		if(temp==5) {
			return SATURDAY;
		}
		else {
			return SUNDAY;
		}
	}
	public static DayOfWeek getName(int temp) {
			if(temp==0) {
				return MONDAY;
			}
			if(temp==1) {
				return THUESDAY;
			}
			if(temp==2) {
				return WEDNESDAY;
			}
			if(temp==3) {
				return THURSDAY;
			}
			if(temp==4) {
				return FRIDAY;
			}
			if(temp==5) {
				return SATURDAY;
			}
			if(temp==6) {
				return SUNDAY;
			}
			else return null;
	}
}
