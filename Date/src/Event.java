
public class Event {
	private String name;
	private Date date;
	
	public Event () {
		name = " ";
		date= new Date();
		
	}
	
	public Event (String n, Date d) {
		if(n!=null&&!n.isEmpty())
		name = n;
		if(d!=null) {
		date = d;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null&&!name.isEmpty())
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String toString() {
		return  date.toStringNoSeconds()+ " - " + name;
	}
	
}
