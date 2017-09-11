package dojo;

public class AnoBissexto {

	public static boolean anoValido(int ano) {
		/* eh bissexto quando eh divisivel por 4 e 400 e não divisivel por 100 */
		boolean divisivelPor4, divisivelPor100, divisivelPor400, ehBissexto;
		
		divisivelPor4 = ano % 4 == 0;
		divisivelPor100 = ano % 100 == 0;
		divisivelPor400 = ano % 400 == 0;
		
		ehBissexto = (divisivelPor4 && !divisivelPor100) || divisivelPor400;
		
		return ehBissexto;
		
	}
}
