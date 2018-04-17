
public class CircularBuffer {
	private Node no;
	private int contador;
	
	public CircularBuffer() {
		this.no = null;
		contador = 0;
	}
	
	public boolean isEmpty() {
		if (contador == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (contador == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void put(int valor) {
		contador++;
	}
	
	public void get() {
	
	}

}
