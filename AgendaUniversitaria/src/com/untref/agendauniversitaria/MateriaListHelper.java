package com.untref.agendauniversitaria;

public class MateriaListHelper {

	public static String[] getDocumentos(String materia) {
		switch (materia) {
		case "Analisis Matematico 2":
			String [] value = {"http://www.utnianos.com.ar/foro/attachment.php?aid=6389"};
			return value;
		case "Fisica 1":
			String [] value2 = {"https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bnRyZWZpc2ljYTFzb25pZG98Z3g6MmFkMGRmZGY0N2Q2ODhhZQ"};
			return value2;
		case "Lenguajes de Programacion 1":
			String [] value3 = {};
			return value3;
		default:
			break;
		}

		return null;

	}

}
