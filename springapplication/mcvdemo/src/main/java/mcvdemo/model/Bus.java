package mcvdemo.model;

public class Bus {
	private int busNumber;
	private String travelsName;
	private int cost;
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(int busNumber, String travelsName, int cost) {
		super();
		this.busNumber = busNumber;
		this.travelsName = travelsName;
		this.cost = cost;
	}

	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public String getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
