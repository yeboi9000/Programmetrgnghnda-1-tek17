package functions;

public class Uppgiftnumero7 {
// tog den g�r fr�n w3 f�r jag fattar inget av den bara att det �r n�got med upph�jd med efter varje siffra.
	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 50; i++) {
			System.out.printf("%-6d", getPentagonalNumber(i));
			if (count % 10 == 0)
				System.out.println();
			count++;
		}
	}
      
	public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1)) / 2;       
	}

}
