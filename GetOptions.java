import java.util.Random;

/**
* Class GetOption which allow to get 3 random values of options.
*/
public class GetOptions { 
  public static void newOption(String[] args) {
    if (args != null && args.length > 0) { // error checker
	  Random ran = new Random; 
	  int k = ran.nextInt(args.length - 1); 
	  System.out.println(args[k]); 
    }
  } 
}	


