import java.util.ArrayList;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author andytaber
 */
public class Plane {
    private String planeId;
    private int capacity;
    private ArrayList<Flight> flights;
     
    public Plane(String planeId, int capacity) {
        this.planeId = planeId;
        this.capacity = capacity;
        this.flights = new ArrayList<Flight>();
    }
     
    public String getPlaneId() {
        return this.planeId;
    }
     
    public void addFlight(String departure, String destination) {
        flights.add(new Flight(departure, destination));
    }
     
    public void printFights() {
        for(Flight flight : flights) {
            System.out.println(this + " " + flight);
        }
    }
     
    public String toString() {
        return planeId + " (" + capacity + " ppl)";
    }
}