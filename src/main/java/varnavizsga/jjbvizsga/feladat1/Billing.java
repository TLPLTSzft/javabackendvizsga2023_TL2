package varnavizsga.jjbvizsga.feladat1;

public class Billing {
	
	public static int priceWithVAT(int vatRate, int priceWithoutVAT) {
		if (vatRate == 5 || vatRate == 18 || vatRate == 27) {
			return (int) (Math.ceil(priceWithoutVAT * (1 + vatRate / 100.0)));
		} else {
			throw new IllegalArgumentException("Érvénytelen áfakulcs");
		}
	}
	
	public static int priceWithoutVAT(int vatRate, int priceWithVAT) {
		if (vatRate == 5 || vatRate == 18 || vatRate == 27) {
			return (int) (Math.floor(priceWithVAT / (1 + vatRate / 100.0)));
		} else {
			throw new IllegalArgumentException("Érvénytelen áfakulcs");
		}
	}
	
	public static String displayBook(String author, String title, int priceWithVAT) {
		String string = String.format("%-50s Áfával: %5d Ft, Áfa nélkül: %5d Ft", author + " - " + title, priceWithVAT, priceWithoutVAT(5, priceWithVAT));
		return string;
	}
}
