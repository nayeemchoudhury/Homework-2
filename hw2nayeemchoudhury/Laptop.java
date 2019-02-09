package hw2nayeemchoudhury;

public class Laptop {
public int numKeys;
public String trackSize;
public static double screenSize;

	//constructors
	public Laptop (int numKe ) {
		this.numKeys = numKe;
		System.out.println("it has " + numKeys + " keys");
	}
	public Laptop (String trackSi) {
		this.trackSize = trackSi;
		System.out.println("This track pad is " + trackSi);
	}
	public Laptop (double screenSi) {
		this.screenSize = screenSi;
		System.out.println("My screen size is " + screenSi);
	}
}