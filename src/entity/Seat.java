package entity;

/**
 * Disponible 1, no disponible 0
 * @author achalarca
 *
 */
public class Seat {
	private String id;
	private int state;
	private String categorySeat;
	
	public Seat(String id, String categorySeat) {
		super();
		this.id = id;
		this.state = 1;
		this.categorySeat = categorySeat;
	}
	
	public boolean isAvailable() {
		return state ==1;
	}

	public String getId() {
		return id;
	}

	public int getState() {
		return state;
	}

	public String getCategorySeat() {
		return categorySeat;
	}
	
	

}
