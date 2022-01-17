package clases;

public class Minero {
	
	private int bolsa;
	private int tiempoExtraccion;
	
	public Minero() {
		
		this.bolsa = 0;
		this.tiempoExtraccion = 1000;
		
	}
	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	public int getTiempoExtraccion() {
		return tiempoExtraccion;
	}

	public void setTiempoExtraccion(int tiempoExtraccion) {
		this.tiempoExtraccion = tiempoExtraccion;
	}

	public void extraerRecursos(Mina mina) {
		
		int stock = mina.getStock();
		
		bolsa++;
		stock--;
		
		mina.setStock(stock);
		
		try {
			
			wait(tiempoExtraccion);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
