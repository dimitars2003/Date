 
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
		Date temp;
		int sizeOfDateEvents = 0;
		for (int i = 0; i<this.index;i++) {
			
			temp=Events[i].getDate();
			if(date.getday()==temp.getday()){
				sizeOfDateEvents++;
			}
		}
		int j = 0;
		Event [] chosenDateEvents = new Event[sizeOfDateEvents];
		
		for (int i = 0; i<this.index;i++) {
			temp=Events[i].getDate();
			if(date.getday()==temp.getday()){
				chosenDateEvents[j] = new Event (); 
				chosenDateEvents[j].setDate(Events[i].getDate());
				chosenDateEvents[j].setName(Events[i].getName());
				
				j++;
				
			}
			
		}
		//for(int p = 0;p<chosenDateEvents.length;p++) {
		
		return chosenDateEvents;
	}
	public void remind()
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		
		Date currentDate = new Date();
		currentDate.setday(localDateTime.getDayOfMonth());
		currentDate.setmonth(localDateTime.getMonthValue());
		currentDate.setyear(localDateTime.getYear());
		Event[] currentEvents = getAllEventsAt(currentDate);
		
		for(int i = 0;i<index;i++){
		
			System.out.println(currentEvents[i].toString());
		
		}
	}
}
	

