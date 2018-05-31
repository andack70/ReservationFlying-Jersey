package co.edu.eafit.cec.dipl.rs;

import java.util.Date;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import CasesUses.QueryFlyingUseCases;
import DTO.queryFlyingValueDTO;
import entity.Flying;


@Path(value="/rest")
public class ReservationService {
	@GET
	@Path(value="/vuelos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flying> getFlying(@Context UriInfo info) {
		MultivaluedMap<String, String> queryString = info.getQueryParameters();
				
		String source =  (String) queryString.getFirst("source");
		String destiny = (String) queryString.getFirst("destiny");
		String date = (String) queryString.getFirst("date");
		
		System.out.println("Buscando origen " + source);
		System.out.println("Buscando destino " + destiny);
		System.out.println("Buscando fecha " + date);
		
		queryFlyingValueDTO paramsService = new queryFlyingValueDTO();
		paramsService.setDestiny(destiny);
		paramsService.setSource(source);
		paramsService.setDate(new Date(1526706000000l));
		
		QueryFlyingUseCases queryFlyingUseCases = new QueryFlyingUseCases();
		List<Flying> resultFlying = queryFlyingUseCases.getFliying(paramsService);
		
		return resultFlying;
	}
}
