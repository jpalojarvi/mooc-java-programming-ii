
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightControl {
    
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;
    
    public FlightControl(){
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity){
        Airplane plane = new Airplane(id, capacity);
        this.airplanes.put(id, plane);
    }
    
    public void addFlight(Airplane plane, String departureID, String destinationID){
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        
        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id){
        return this.airplanes.get(id);
    }
}
