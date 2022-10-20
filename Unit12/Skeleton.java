//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private int bigness;
	private String name;
	//add a constructor
	public Skeleton() {
		name = "";
		bigness = 0;
	}
	public Skeleton(int size, String nm) {
		bigness = size;
		name = nm;
	}
	//add code to implement the Monster interface
	public int getHowBig() {
		return bigness;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster other) {
		return (this.bigness > other.getHowBig());
	}
	public boolean isSmaller(Monster other) {
		return (other.getHowBig() > this.bigness);
	}
	public boolean namesTheSame(Monster other) {
		return (name.equals(other.getName()));
	}
	//add a toString
	public String toString() {
		return this.getName() + " " + this.getHowBig();
	}
}