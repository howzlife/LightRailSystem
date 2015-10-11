<<<<<<< HEAD
=======
import Train.Direction;

>>>>>>> 41882e597a1bd5b776f37a6c73f6d8fc48a0175d

public class Main {
	public static void main() {
		int numStations = 10; 
		int numTrains = 10; 
		
		Station[] stations = new Station[numStations];
		for (int i = 0; i < numStations; i++) {
			stations[i] = new Station(i, new Platform(), new Platform()); 
		}
		
		// Create 10 trains, put half in each direction, one at each station
		Train[] trains = new Train[numTrains];
		boolean direction = true; 
		for (int i = 0; i < numTrains; i++) {
			trains[i] = new Train(new DoorSystem(), stations[i]); 
			trains[i].setDirection(direction ? Train.Direction.A : Train.Direction.B); 
		}
	}
}
