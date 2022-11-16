/**
 * 
 */
package Hilos;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Hilo1 extends Thread{
	
	
	private int numero = 10;
	
	public Hilo1(String nombre)
	{
		super(nombre);
	}
	
	public int sumaEnterosRecursiva(int numero)
	{
		if(numero == 0)
		{
			return 0;
		}else {
			return numero +sumaEnterosRecursiva(numero-1);
		}	
	}
	
	
	
	public void run()
	{
		
		try {
			System.out.println("Se inicia el "+getName());
			Thread.sleep(1000);
			System.out.println("El resultado de la suma es" +sumaEnterosRecursiva(numero));
			System.out.println("Finaliza el hilo" +getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(getName() + "Fue interrumpido ");
		}
		
		
	}
	
	

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
	
	
	
	
	
	

}
