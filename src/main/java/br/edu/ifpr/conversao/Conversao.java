package br.edu.ifpr.conversao;

public class Conversao {

	public static String converter(int segundos) {
		int restoHoras = (int) segundos % 3600;
		int restoMinutos = (int) restoHoras % 60;
		int horas = segundos / 3600;
		int minutos = restoHoras / 60;
		
		return ""+ horas + ":" + minutos + ":" + restoMinutos;
	}

}
