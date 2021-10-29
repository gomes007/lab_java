package fit.challenge;

public class ImcCalculator {

	public static String calculate(double weight, double height) {
		
		
		double result = 0.0;
	    result = weight / Math.pow(height, 2);
	    if (result < 18.5) return "Magreza";
	    if (result >= 18.5 && result < 24.9) return "Normal";
	    if (result >= 24.9 && result < 30) return "Sobrepeso";

	    return "Obesidade";
		
		
		
	}

}
