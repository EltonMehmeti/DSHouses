package houses;

public class Engineers extends houseClass {
	private boolean geekSensor;
	
	public Engineers (String name, String mission,String houseMaster,boolean geekSensor) {
		
	super(name,mission,houseMaster);
	this.geekSensor = geekSensor;
	}

	public boolean isGeekSensor() {
		return geekSensor;
	}

	public void setGeekSensor(boolean geekSensor) {
		this.geekSensor = geekSensor;
	}

	public void talkingMode() {
		if(geekSensor == true) {
			System.out.println("Be prepared because we will bombard u with mart info...");
			
		}else {
			System.out.println("we should stay silent");
		}
	}
	
	
	
}
