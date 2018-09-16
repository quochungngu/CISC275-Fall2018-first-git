public class Animal {
    protected int legs;

    public Animal(){
	legs = 0;
    }
    
    public Animal(int legs){
	this.legs = legs;
    }

    public int getLegs(){
	return legs;
    }
}
