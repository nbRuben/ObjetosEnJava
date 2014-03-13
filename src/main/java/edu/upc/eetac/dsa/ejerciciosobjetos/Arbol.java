package edu.upc.eetac.dsa.ejerciciosobjetos;

public class Arbol {

private int altura=0;
private String tipo="arbol";

public Arbol(){};

public Arbol(int altura, String tipo){
	this.altura=altura;
	this.tipo=tipo;
}

public Arbol(int altura){
	this.altura=altura;
}

public Arbol(String tipo){
	this.tipo=tipo;
}

public int getAltura(){
	return this.altura;
}

public String getTipo(){
	return this.tipo;
}


}
