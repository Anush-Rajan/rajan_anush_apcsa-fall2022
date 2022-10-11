//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<>();
		String[] split = toys.split(" ");
		
		for (String toyName: split) {
			boolean isadded = false;
			for (Toy toy : toyList) { 
				if (toy.getName().equals(toyName)) {
					toy.setCount(toy.getCount() + 1);
					isadded = true;
				}
			}
			
			if (isadded == false) {
				Toy toynew = new Toy(toyName);
				toynew.setCount(1);
				toyList.add(toynew);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy: toyList) {
  			if (toy.getName().equals(nm)) {
  				return toy;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int highindex = 0;
  		int highval = toyList.get(highindex).getCount();
  		
  		for (int i = 1; i < toyList.size(); ++i) {
  			if (toyList.get(i).getCount() > highval) {
  				highindex = i;
  			}
  		}
  		return toyList.get(highindex).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Collections.sort(toyList, (a,b) -> {
  			return b.getCount() - a.getCount();
  		});
  	}  
  	  
	public String toString()
	{
		String answer = "[";
		sortToysByCount();
		
		for (int i = 0; i < toyList.size(); i++) {
			answer += toyList.get(i).getName() + " " + toyList.get(i).getCount() + (i == toyList.size()-1 ? "": ", ");
		}
		
		answer += "]\n";
		answer += "max = " + getMostFrequentToy() + "\n";
		
		return answer;
	}
}