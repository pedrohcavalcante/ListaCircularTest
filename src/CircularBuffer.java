
public class CircularBuffer {
	private int arrayFila[];
	private int inicio;
	private int fim; 
	private int numElementos;
	private int tamanho;
	private int contador;
	
	public CircularBuffer() {
		inicio = 0;
		fim = 0;
		numElementos = 0;
		tamanho = 10;
		arrayFila = new int[10];
		contador = 0;
	}
	
	public CircularBuffer(int tamanho) {
		inicio = 0;
		fim = 0;
		numElementos = 0;
		this.tamanho = tamanho;
		arrayFila = new int[tamanho];
		contador = 0;
	}
	
	public boolean isEmpty() {
		if (numElementos == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (numElementos == tamanho) {
			return true;
		} else {
			return false;
		}
	}
	
	public void put(int valor) {
		if (!isFull()) {
			arrayFila[fim] = valor;
			numElementos++;
			fim++;
			if (fim == tamanho) {
				fim = 0;
			}
		} else {
			throw new CircularBufferException("Put to full circular Buffer");
		}
	}
	
	

	public int get() {
		int temp = 0;
	
			if (!isEmpty()) {
			
				temp = arrayFila[inicio];
				arrayFila[inicio] = 0;
				inicio++;
				numElementos--;
				if (inicio == tamanho) {
					inicio = 0;
				}
			} else {
				throw new CircularBufferException("Get from empty circular buffer");
			}
		
		return temp;
	}
	
	public int capacity() {
		return this.tamanho;
	}
	
	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public int getNumElementos() {
		return numElementos;
	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
