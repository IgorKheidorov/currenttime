public class Main { 

	public static void main(String[] args) { 
		for (int i = 0; i < 3; i++) { 
			int n = (int)Math.floor(Math.random() * args.length); 
			System.out.println(args[n]); 
		} 
	} 
}	