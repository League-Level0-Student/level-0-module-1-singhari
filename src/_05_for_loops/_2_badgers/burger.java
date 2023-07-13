package _05_for_loops._2_badgers;

public class burger {
	public static void main(String[] args) {
String b = "Badger";
String m = "Mushroom";
String s = "Snake";
 
for (int y = 0; y < 2; y++) {
	
	for (int x =0; x < 13; x++) {

	if (x > 11) {
		System.out.print(m+", "+m);
	}
	else {
		System.out.print(b+", ");
	}
	}

		System.out.println("");
}
System.out.println("A "+s +"!!!");

	}
}
