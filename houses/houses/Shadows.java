package houses;

public class Shadows extends houseClass {
	
	public boolean specialTool;
	
	

	public Shadows(String name, String mission, String houseMaster, boolean specialTool) {
		
		super(name,mission,houseMaster);
		this.specialTool = specialTool;
	}

	public boolean isSpecialTool() {
		return specialTool;
	}

	public void setSpecialTool(boolean specialTool) {
		this.specialTool = specialTool;
	}
	
	public void callForHelp(String call) {
		if(call.contains("help") || call.contains("impossible") || call.contains("we need you")) {
		this.specialTool = true;
		System.out.println("Shadows:Here we come!!!");
		
		}else {
			this.specialTool = false;
			System.out.println("Shadows: That's not out business");
		}
		
		
	}

}
