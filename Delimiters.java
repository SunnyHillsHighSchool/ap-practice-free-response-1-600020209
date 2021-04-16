import java.util.*;
//Joon Kyo Kim
public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
    //Create string arraylist x
		ArrayList<String> x = new ArrayList<String>();
    //For all values i of tokens:
    for(String i: tokens){
      //If i is either the open or close delimiter:
      if(i.equals(openDel) || i.equals(closeDel)){
        //Add i into the ArrayList
        x.add(i);
      }
    }
    //return x
    return x;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    //Initialize counter variable
	  int counter = 0;
    //For all values i of delimiters:
    for(String i: delimiters){
      //If i is an open delimiter:
      if(i.equals(openDel)){
        //Increase counter variable by 1
        counter++;
      }
      //If i is a close delimiter:
      if(i.equals(closeDel)){
        //Decrease counter variable by 1
        counter--;
      }
      //If counter is less than zero:
      if(counter< 0){
        //return false
        return false;
      }
	  }
    //If counter is zero:
    if(counter == 0){
      //Return true
      return true;
    }
    //Return false
    return false;
  }
}