public class Dog extends Animal implements Comparable<Dog>{
    private String name;

    public Dog(String name, int legs){
	this.name = name;
	this.legs = legs;
    }

    public String toString(){
	return name+"; "+legs;
    }

    public int compareTo(Dog d){
	int legsComp = d.legs-legs;
	return (legsComp !=0 ? legsComp:name.compareTo(d.name));
    }
}
