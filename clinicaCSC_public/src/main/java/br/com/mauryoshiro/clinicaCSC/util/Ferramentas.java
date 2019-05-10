package br.com.mauryoshiro.clinicaCSC.util;

import java.util.ArrayList;
import java.util.List;

public class Ferramentas {

	/*
	 * Este método remove qualquer espaçamento a mais que tenha na String.
	 * 
	 * Exemplo:
	 * ENTRADA: "     Estados          Unidos da      América"
	 * SAÍDA: "Estados Unidos da América"
	 */
	public static String tratarString(String s) {
		String[] arrayStrings;
		String StringTemp = "";
		String novaString = "";

		if (s.contains(" ")) {
			List<String> listaStrings = new ArrayList<String>();
			Integer tamanhoString = 0;

			arrayStrings = s.split(" ");

			for (Integer i = 0; i < arrayStrings.length; i++) {
				if (!arrayStrings[i].equals(""))
					listaStrings.add(arrayStrings[i]);
			}

			for (String string : listaStrings) {
				StringTemp += string;
				StringTemp += " ";
			}

			tamanhoString = StringTemp.length();
			
			if(tamanhoString > 0)
				novaString = StringTemp.substring(0, tamanhoString - 1);

		} else {
			return s;
		}

		return novaString;
	}
}
