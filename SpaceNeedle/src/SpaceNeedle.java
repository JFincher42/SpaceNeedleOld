
public class SpaceNeedle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSpire();
		printBodyTop();
		printBodyBottom();
		printSpire();
		printTower();
		printBodyTop();
	}
	
	public static void printSpire()
	{
		for (int i=0; i<4; i++)
			System.out.println("            ||");

	}
	
	public static void printBodyTop()
	{
		System.out.println("         __/||\\__"); 
		System.out.println("      __/:::||:::\\__");
		System.out.println("   __/::::::||::::::\\__");
		System.out.println("__/:::::::::||:::::::::\\__");
		System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|"); 
	}

	public static void printBodyBottom()
	{
		System.out.println("\\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/"); 
		System.out.println(	"  \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\_/"); 
		System.out.println("    \\_/\\/\\/\\/\\/\\/\\/\\_/"); 
		System.out.println("      \\_/\\/\\/\\/\\/\\_/");
	}
	public static void printTower()
	{
		for (int i=0; i<16; i++)
			System.out.println("         |%%||%%|");
	}

}
