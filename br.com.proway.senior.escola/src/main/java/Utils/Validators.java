package Utils;

public class Validators {

	/**
	 * Verifica se há caracteres não alfabéticos
	 * 
	 * @param verify String a ser verificada
	 * @return boolean
	 */
	static public boolean onlyValidChars(String verify) {
		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
	}
}
