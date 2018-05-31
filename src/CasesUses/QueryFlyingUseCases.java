package CasesUses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DTO.queryFlyingValueDTO;
import entity.*;

public class QueryFlyingUseCases {
	
	List<Flying> flyingList = new ArrayList<Flying>();
	
	/**
	 * @constructor
	 */
	public QueryFlyingUseCases() {
		List<Seat> listSeats = new ArrayList<Seat>();
		listSeats.add(new Seat("A1", "TURISTA"));
		listSeats.add(new Seat("B1", "EJECUTIVA"));
		listSeats.add(new Seat("C1", "PREFERENCIAL"));
		
		flyingList.add(new Flying("MDE", "SMR", new Date(1526706000000l), listSeats));
		flyingList.add(new Flying("SMR", "MDE", new Date(1526706000000l), listSeats));
		flyingList.add(new Flying("BOG", "RIH", new Date(1526706000000l), listSeats));
		flyingList.add(new Flying("BOG", "MDE", new Date(1526706000000l), listSeats));
		flyingList.add(new Flying("MDE", "MTR", new Date(1526706000000l), listSeats));
		flyingList.add(new Flying("MDE", "BOG", new Date(1526706000000l), listSeats));
		flyingList.add(new Flying("BOG", "MTR", new Date(1526706000000l), listSeats));
	}
	
	public List<Flying> getFliying(queryFlyingValueDTO params){
		List<Flying> avaibleFlying = null;
		
		for (Flying fly : flyingList) {
			if (params.getSource().equals(fly.getSource())) {
				if (params.getDestiny().equals(fly.getDestiny())) {
					if(fly.ammountAvailableSeats()) {
						if (avaibleFlying == null) {
							avaibleFlying = new ArrayList<Flying>();
						}
					}
				}
			}
		}
		return avaibleFlying;
	}
	
	
}
