/**
 * 
 */
package Hilos;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Hilo3 extends Thread{
	
	
	public final String palabra= "Electroencefalografista";
	public int i=0;
	public int contador = 0;
	
	
	public Hilo3(String nombre)
	{
		super(nombre);
	}
	
	
	public int contarConsonantes(String palabra, int i, int contador)
	{
		if(i<palabra.length())
		{
			if(isConsonante(palabra.charAt(i)))
			{
				contador = contador+1;
			}
			return contarConsonantes(palabra, i+1, contador);
		}else {
			return contador;
		}
	}
	
	public boolean isConsonante(char c)
	{
		if((c != 'a' && c != 'A' ) && (c != 'e' && c != 'E') && 
				(c != 'i' && c != 'I') && (c != 'o' && c != 'O') && (c != 'u' && c != 'U'))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	
	public void run()
	{	
		try {
			System.out.println("Se inicial el "+getName());
			Thread.sleep(1000);
			System.out.println("Tiene "+contarConsonantes(palabra, i, contador)+" consonantes");
			System.out.println("Finaliza el hilo" +getName());
			
		} catch (InterruptedException e) {
			System.out.println(getName() + "Fue interrumpido");
		}
		
	}


	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}


	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}


	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}


	/**
	 * @param contador the contador to set
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}


	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}


	
	
	
	

}
