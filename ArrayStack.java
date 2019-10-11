
import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
	private T[] arr = (T[]) new Object[10];
	private int top = -1;
	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		if (top == arr.length - 1) growArr();
		top++;
		arr[top] = item;
	}
	public void growArr() {
		T[] arr_ = (T[]) new Object[2 * arr.length];
		for (int i = 0; i < arr.length; i++)
			arr_[i] = arr[i];
        arr = arr_;
	}

	@Override
	public T pop()  {
		// TODO Auto-generated method stub
		if (empty()) return null;
		T t = arr[top];
		top--;
		return t;
	}

	@Override
	public T peek()  {
		// TODO Auto-generated method stub
		if (empty()) return null;
		
		return arr[top];
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
}
