package houses;

public class Hipsters extends houseClass {

	
	public Hipsters (String name, String mission,String houseMaster) {
		super(name,mission,houseMaster);
		
	}
	public void tellJoke(int joke) {
		if(joke == 1) {
			System.out.println("Q:What do computers eat for a snack?\r\n"
					+"A:Microchips!");
		}
		if(joke==2) {
			System.out.println("My compute suddenly started belting out"
					+"\"Someone Like You.\"Its a Dell.");
		}
		if(joke== 3) {
			System.out.println("Q:Why was the cell phone wearing glasses?\r\n"
					+"A: It lost its contacts.");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
