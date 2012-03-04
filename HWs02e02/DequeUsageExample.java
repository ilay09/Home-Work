public class DequeUsageExample {
public static void poperror(Deque x)throws DequeOutOfBoundException {
 if (x.data.length==0) throw new DequeOutOfBoundException();
	x.popFront();
}
public static void main(String[] args){
	Deque x = new Deque();
	try {
	poperror(x);
	} catch (DequeOutOfBoundException e) {
	System.out.println(e);

}
}
}
