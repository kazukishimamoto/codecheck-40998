package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("%s", args[i]);
			System.out.println("Hello " + output +"!");
		}
	}
}
