package houses;

public class Speedsters extends houseClass {

 private int time;
	
	private int speed;
	


	public Speedsters(String name, String mission, String houseMaster, int time, int speed) {
		super(name,mission,houseMaster);
		this.time = time;
		this.speed= speed;		
		
		
	}
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void increaseSpeed(int amountofSpeed) {
	this.speed = this.speed  +amountofSpeed;	
	}
	public void decreaseSpeed(int amountofSpeed) {
		this.speed = this.speed - amountofSpeed;
	}
	public void traveltoFuture(int nrYears) {
		this.time = this.time + nrYears;
		System.out.println("Yooooooooooooo i am living in the year:"
				+this.time+"and i am travelling with speed"
				+this.speed+"m/s");
	}
	public void traveltoPast(int nrYears) {
		this.time = this.time - nrYears;
		System.out.println("Yooooooooooooo i am living in the year:"
				+this.time+"and i am travelling with speed"
				+this.speed+"m/s");
	}
	
	
}
