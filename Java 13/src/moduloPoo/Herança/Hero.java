package moduloPoo.Herança;

//look that this class has nothing
public class Hero extends Player{
	//now, let's overwrite code of super class
	//i can do with CTRL C, CTRL V or reusing of super class
	
	//reusing
	public boolean attack (Player opponent) {
		//hero attack twice
		boolean  atk1 = super.attack(opponent);
		boolean  atk2 = super.attack(opponent);
	
		//if the atk1/2 is successful, return true 
		return atk1 || atk2;
	}
	
	//***defining builds***
	
	//i can defining the parameters of build or leaving how parameter in build of Hero
	public Hero (int x, int y){
		//Here i'm calling the build of super class,
		//i have calling because the super class not has the default build
		super(x, y);
	}

}
