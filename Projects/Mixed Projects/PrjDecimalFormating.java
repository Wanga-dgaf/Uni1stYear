import java.text.DecimalFormat;

public class PrjDecimalFormating {
	public static void main(String[] args) {
		double number = 12345678.56845 ;
		DecimalFormat df = new DecimalFormat("#,###.##");
		
		System.out.println("Formatted Number: " + df.format(number));
		
		 // Format with mandatory trailing zeros (e.g., for currency)
        DecimalFormat currencyFormat = new DecimalFormat("R#,##0.00");
        
        System.out.println("Formatted currency: " + currencyFormat.format(number));
	}
}