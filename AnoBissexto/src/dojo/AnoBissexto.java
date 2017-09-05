package dojo;

public class AnoBissexto {

	public static boolean anoValido(int ano) {
		/*if(ano % 100 == 0 && ano % 4 == 0 && ano % 400 == 0){
			return false;
		}
		else if (ano % 4 == 0 || ano % 400 == 0) {
			return true;
		}else if (ano % 100 != 0){
			return false;
		}
		return false;
	}*/
		if (ano % 4 == 0 || ano % 400 == 0){
			return true;
		}else if (ano % 100 == 0){
			return false;
		}else if (ano % 100 == 0 && ano % 400 == 0){
			return true;
		}
		return false;
	
}
	}
