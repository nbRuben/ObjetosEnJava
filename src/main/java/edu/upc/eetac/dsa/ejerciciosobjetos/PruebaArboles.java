package edu.upc.eetac.dsa.ejerciciosobjetos;

public class PruebaArboles {
	public static void main(String args[]) {
		Arbol arbol1 = new Arbol(4);
		Arbol arbol2 = new Arbol("Roble");
		Arbol arbol3 = new Arbol();
		Arbol arbol4 = new Arbol(5, "Pino");
		
		System.out.println("Un " + arbol1.getTipo() + " de " + arbol1.getAltura() + " metros");

		System.out.println("Un " + arbol2.getTipo());

		System.out.println("Un " + arbol3.getTipo() + " generico");

		System.out.println("Un " + arbol4.getTipo() + " de " + arbol4.getAltura() + " metros");
		
	}
	
}
