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
public class UserInterface {
    private Scanner scanner;
    private PlaneList planeList;
     
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.planeList = new PlaneList();
    }
     
    public void start() {
        runAirportInterface();
        runFlightServiceInterface();
    }
     
    private void runAirportInterface() {
        airportPanel();
        airportInstructions();
        while(processAirportInstructions()) {
            airportInstructions();
        }
    }
     
    private void runFlightServiceInterface() {
        flightService();
        flightInstructions();
        while(processFlightInstructions()) {
            flightInstructions();
        }
    }
     
    private boolean processAirportInstructions() {
        String command = scanner.nextLine();
        if(command.contentEquals("1")) {
            addAirplane();
            return true;
        } else if(command.contentEquals("2")) {
            addFlight();
            return true;
        } else if(command.contentEquals("x")) {
            return false;
        }
        return true;
    }
     
    private boolean processFlightInstructions() {
        String command = scanner.nextLine();
        if(command.contentEquals("1")) {
            printPlanes();
            return true;
        } else if(command.contentEquals("2")) {
            printFlights();
            return true;
        } else if(command.contentEquals("3")) {
            printPlaneInfo();
            return true;
        } else {
            return false;
        }
    }
     
    private void printPlanes() {
        planeList.printPlanes();
    }
     
    private void printFlights() {
        planeList.printFlights();
    }
     
    private void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        String planeID = scanner.nextLine();
        Plane plane = planeList.getPlane(planeID);
        System.out.println(plane);
    }
     
    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        planeList.addPlane(planeID, capacity);
    }
     
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine();
        planeList.addFlight(planeID, scanner);
    }
     
    private void airportInstructions() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
     
    private void flightInstructions() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
     
    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
    }
     
    private void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
    }
      
}