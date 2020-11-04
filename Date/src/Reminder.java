import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Reminder {
	private Event [] Events;
	private int index; 
	
	public Reminder () {
		Events = new Event [30];
		index = 0;
	}
	public void addEvent(Event newEvent) {
		if(newEvent == null) {
			System.out.println("Error, event is null");
		}
		else if(index>=30) {
			System.out.println("Error, Events is full");
		}
		else {
			Events[index] = newEvent;
			index++;
		}
		
	}
	public Event[] getAllEventsAt(Date date) {
		
		int sizeOfDateEvents = 0;
		for (int i = 0; i<30;i++) {
			if(date.compareToJustDate(Events[i].getDate())==0){
				sizeOfDateEvents++;
			}
		}
		Event [] chosenDateEvents = new Event[sizeOfDateEvents];
		for (int i = 0; i<30;i++) {
			if(date.compareToJustDate(Events[i].getDate())==0){
				chosenDateEvents[sizeOfDateEvents].setDate(Events[i].getDate());
				chosenDateEvents[sizeOfDateEvents].setName(Events[i].getName());
				sizeOfDateEvents--;
			}
		}
		return chosenDateEvents;
	}
	public void reminder() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		   LocalDateTime now = LocalDateTime.now();
		   for(int i = 0;i<30;i++) {
			   if(Events[i].getDate().toStringOnlyDate()==dtf.format(now)) {
				   System.out.println(Events[i].toString());
			   }
		   }
		   
	}
	
}
