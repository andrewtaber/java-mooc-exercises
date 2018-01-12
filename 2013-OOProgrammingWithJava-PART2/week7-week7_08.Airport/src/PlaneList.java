import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author andytaber
 */
public class PlaneList {
    private Map<String, Plane> planes;
     
    public PlaneList() {
        this.planes = new HashMap<String, Plane>();
    }
     
    public void addPlane(String planeId, int capacity) {
        if(planes.containsKey(planeId)) {
            System.out.println("Plane already in list");
        }
        Plane plane = new Plane(planeId, capacity);
        planes.put(planeId, plane);
    }
     
    public void addFlight(String planeID, Scanner scanner) {
        Plane plane = planes.get(planeID);
        System.out.print("Give departure airport code: ");
        String departure = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = scanner.nextLine();
        plane.addFlight(departure, destination);
    }
     
    public void printPlanes() {
        for(Plane plane : planes.values()) {
            System.out.println(plane);
        }
    }
     
    public void printFlights() {
        for(Plane plane : planes.values()) {
            plane.printFights();
        }
    }
     
    public Plane getPlane(String planeID) {
        Plane plane = planes.get(planeID);
        return plane;
    }
}