//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int oldestindex = 0;
		for (int i = 1; i < pups.length; i++) {
			if (pups[i].getAge() > pups[oldestindex].getAge()) {
				oldestindex = i;
			}
		}
		return pups[oldestindex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngestindex = 0;
		for (int i =1; i < pups.length; i++) {
			if (pups[i].getAge() < pups[youngestindex].getAge()) {
				youngestindex = i;
			}
		}
		return pups[youngestindex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}