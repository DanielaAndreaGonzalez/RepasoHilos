package Hilos;


/*
 * Calculae factorial de 6
 */
public class Hilo2 extends Thread{
	
	private int numero = 6;
	
	public Hilo2(String nombre)
	{
		super(nombre);
	}
	
	
	public int calcularFactorialRecursivamente(int numero)
	{
		if(numero <=1)
		{
			return 1;
		}else {
			return numero * calcularFactorialRecursivamente(numero-1);
		}	
	}

	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("Se inicial el "+getName());
			System.out.println("El resultado del factorial es: "+calcularFactorialRecursivamente(numero));
			System.out.println("Finaliza el hilo"+getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Fue interrumpido");
		}
		
		
		
	}
	
	

}
