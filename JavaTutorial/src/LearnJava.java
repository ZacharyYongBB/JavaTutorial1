import java.util.ArrayList;

public class LearnJava {

	public static void main(String[] args) {
		
		
		char b = 'i';
		long c = 400;
		double d = 3.2;
		
		String name = "Zachary";
		System.out.println(name.toUpperCase());
		
		String exclaim = addExclamationPoint("hot dogs");
		System.out.println(exclaim.toUpperCase());
		
		Animal e = new Animal();
		String lion = e.iAmLion();
		System.out.println(lion);
		
		ArrayList<Integer> f = new ArrayList<Integer>();
		
		Animal a = new Animal();
		a.doStuff();
		
		
	}

	
	public static String addExclamationPoint(String s) {
		return s + "!";
	}
}
