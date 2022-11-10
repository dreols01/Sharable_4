
//Conversion for weight and height

public final class UnitConverter2 {
	public static double poundsToPounds(double Weight) {
		return Weight; 
	}
	
	/* this method converts from kilometer to Meters */
	public static double poundsToKg(double Weight) {
		//TODO: return the input in km to meter
		return Weight/2.2046; 
	}
	
	/* this method converts from kilometer to Inches */
	public static double poundsToOunces(double Weight) {
		//TODO: return the input in km to inch
		return Weight*16; 
	}
	
	/* this method converts from kilometer to Meter */
	public static double poundsToTons(double Weight) {
		//TODO: return the input in km to centimeter
		return Weight/2000; 
	}
	public static double feetToFeet(double Height) {
		return Height;
	}
	
	/* this method converts from kilometer to Meters */
	public static double feetToInches(double Height) {
		//TODO: return the input in km to meter
		return Height*30.48; 
	}
	
	/* this method converts from kilometer to Inches */
	public static double feetToCentimeters(double Height) {
		//TODO: return the input in km to inch
		return Height*16; 
	}
	
	/* this method converts from kilometer to Meter */
	public static double feetToMeters(double Height) {
		//TODO: return the input in km to centimeter
		return Height*0.3048; 
	}
}