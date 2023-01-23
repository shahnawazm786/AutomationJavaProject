package encapsulation;

public class CarClass implements IViechle {

	int no_of_wheel=4;
	int no_of_seats=5;
	@Override
	public void getWheel() {
		// TODO Auto-generated method stub
		System.out.println("Wheels are"+no_of_wheel);
	}

	@Override
	public void getSeats() {
		// TODO Auto-generated method stub
		System.out.println("Seats are"+no_of_seats);
	}

}
