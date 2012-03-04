public class Deque {
	int[] data;

	Deque() {
		data = new int[0];
	}

	public void pushBack(int n) {
		int[] temp = new int[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		temp[data.length] = n;
		data = temp;
	}

	public int popBack() {
		int[] temp = new int[data.length - 1];
		int y = data[data.length - 1];
		for (int i = 0; i < data.length - 2; i++) {
			temp[i] = data[i];
		}
		data = temp;
		return y;
	}

	public void pushFront(int n) {
		int[] temp = new int[data.length + 1];
		for (int i = temp.length; i > 0; i--) {
			temp[i] = data[i - 1];
		}
		temp[0] = n;
		data = temp;
	}

	public int popFront() {
		int y = data[0];
		int[] temp = new int[data.length - 1];
		for (int i = 1; i < data.length; i++) {
			temp[i - 1] = data[i];
		}
		return y;
	}

	void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
