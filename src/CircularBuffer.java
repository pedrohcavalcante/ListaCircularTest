
public class CircularBuffer {
	private Node no;
	private int contador;
	
	public CircularBuffer() {
		this.no = null;
		contador = 0;
	}
	
	public boolean isEmpty() {
		if (no == null) {
			return true;
		}else {
			return false;
		}
	}

}
