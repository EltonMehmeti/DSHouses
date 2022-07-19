package houses;

public class houseClass {

	private String name;
	private String mission;
	private int Xp = 0;
	private String houseMaster;
	private String[] challenges;
	private int index = 0;
	
	//constructor
	public houseClass(String name,String mission, String houseMaster) {
		this.name = name;
		this.mission = mission;
		this.houseMaster = houseMaster;
		challenges = new String[3];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public int getXp() {
		return Xp;
	}

	public void setXp(int xp) {
		Xp = xp;
	}

	public String getHouseMaster() {
		return houseMaster;
	}

	public void setHouseMaster(String houseMaster) {
		this.houseMaster = houseMaster;
	}
	public void addChallenge(String ChallengeName) {	
		if(index == challenges.length) {
			System.out.println("There is no more place in the array!");
			return;
		}
		challenges[index++]=ChallengeName;
	}
	public void showChallenges() {
		for(int i = 0; i < challenges.length;i++) {
			if(challenges[i]!=null) {
				System.out.println(challenges[i]);
			}
		}
	}
	public void giveXP(int XpAmount) {
		this.Xp = this.Xp + XpAmount;
	}
	public void removeXP(int XpAmount) {
		this.Xp = this.Xp + XpAmount;
	}
	
	public void awarBadge(String typeofBadge) {
		if(typeofBadge == "Best Idea") {
			this.Xp = this.Xp + 5;
		}
		if(typeofBadge == "Best Student") {
			this.Xp = this.Xp +10;
		}
		if(typeofBadge == "Bad Discipline") {
			this.Xp = this.Xp - 10;
		}
		
		
		
	}
}

