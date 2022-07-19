package houses;
import java.util.Scanner;
public class LMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);


Speedsters speedsters=
new Speedsters("Speedsters","Time pressure,no problem!","john Doe",1950, 299792458);

Hipsters hipsters =
new Hipsters("Hipsters","Work smart not hard!","Jack irwin");

Shadows shadows = 
new Shadows("Shadows","Mission impossible...thats where we come in!","Michael Jordan",false);

Engineers engineers=
new Engineers("Engineers","We exist to fic things!","Bob Brown",false);
	
	speedsters.giveXP(100);
	hipsters.giveXP(200);
	engineers.giveXP(200);
	shadows.giveXP(200);
	
	
	}

}
