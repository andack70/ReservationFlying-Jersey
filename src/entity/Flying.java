package entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Flying {
	private String id;
	private String source;
	private String destiny;
	private String date;
	
	private List<Seat> listSeats;
	private int state;
	
	public Flying(String source, String destiny, Date dateFly, List<Seat> listSeats) {
		this.id = UUID.randomUUID().toString();
		
		this.source = source;
		this.destiny= destiny;
		this.listSeats = listSeats;
		this.state = 1;
	}
	
	public boolean ammountAvailableSeats() {
		for (Seat silla : listSeats) {
			if(silla.isAvailable()) {
				return true;
			}
		}
		return false;
	}

	public String getId() {
		return id;
	}

	public String getSource() {
		return source;
	}

	public String getDestiny() {
		return destiny;
	}

	public String getDate() {
		return date;
	}

	public List<Seat> getListSeats() {
		return listSeats;
	}

	public int getState() {
		return state;
	}
	

}
