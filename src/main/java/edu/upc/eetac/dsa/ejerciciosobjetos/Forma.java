package edu.upc.eetac.dsa.ejerciciosobjetos;

public class Forma {
	
	private String Forma = "generica";
	public Forma(){}
	public Forma(String Forma){
		this.Forma=Forma;
	}
	public void queEs(){
		System.out.println("Un objeto de forma " + this.Forma);
	}
	
}
