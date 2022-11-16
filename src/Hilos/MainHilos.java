/**
 * 
 */
package Hilos;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MainHilos {
	

	public static void main(String [] args)throws InterruptedException
	{
		
		Hilo1 hilo1 = new Hilo1("S1-->");
		Hilo2 hilo2 = new Hilo2("S2-->");
		Hilo3 hilo3 = new Hilo3("S3-->");
		
		hilo1.start();
		hilo1.join();
		
		hilo2.start();
		hilo2.join();
		
		hilo3.start();
		hilo3.join();
		
		System.out.println("Se inicia el hilo 4 / s4--> calculando d...");
		int d = hilo1.sumaEnterosRecursiva(10)*hilo2.calcularFactorialRecursivamente(6);

		System.out.println("Finaliza el hilo 4");
		
		System.out.println("Inicia el hilo 5 , S5-->");
		System.out.println("valor de d "+d);
		System.out.println("Cantidad de consonantes "+ hilo3.contarConsonantes(hilo3.getPalabra(), hilo3.getI(), hilo3.getContador()));
		System.out.println("Finaliza el hilo5, S5");
		
		
		
	}
	
	
	
	
	
	
	
	

}
