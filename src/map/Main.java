package map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Wheels
        Map<Integer, String> wheels = new HashMap<>();
        wheels.put(1, "Winter");
        wheels.put(2, "Winter");
        wheels.put(3, "Winter");
        wheels.put(4, "Winter");

        //Doors
        Map<Integer, String> doors = new HashMap<>();
        doors.put(1, "LeftFrontDoor");
        doors.put(2, "RightFrontDoor");
        doors.put(3, "LeftRearDoor");
        doors.put(4, "LeftRearDoor");

        //Engine
        Map<String, String> engine = new HashMap<>();
        engine.put("BMW", "V8000");

        //Passengers
        Map<Integer, String> passengers = new HashMap<>();
        passengers.put(35,"Sponge Bob");
        passengers.put(24,"Harry Potter");
        passengers.put(666,"Terminator T800");
        passengers.put(13,"Nigga");

        //FuelTank
        Map<Integer, Integer> fueltank = new HashMap<>();
        fueltank.put(50, 30);

        //Model
        Map<String, String> model = new HashMap<>();
        model.put("BMW", "X5");

    }
}
