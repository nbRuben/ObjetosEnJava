package edu.upc.eetac.dsa.ejerciciosobjetos;

public class PruebaFormas {

	public static void main(String[] args) {
		Forma[] s = new Forma[3];
		s[0] = new Forma();
		s[1] = new Circulo();
		s[2] = new Cuadrado();

		for (int i = 0; i < s.length; i++)
			s[i].queEs();
	}
}
