

import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T>{
	private T[] arr = (T[]) new Object[10];
	private int head = -1;
	private int tail = -1;

	@Override
	public T dequeue()  {
		// TODO Auto-generated method stub
		head++;
		T t = arr[head];
		arr[head] = null;
		return t;
	}

	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub
		if (tail == arr.length-1) growArr();
		tail++;
		arr[tail] = item;
		
	}
	private void growArr() {
		T[] arr_ = (T[]) new Object[2 * arr.length];
		for (int i = 0; i < arr.length; i++)
			arr_[i] = arr[i];
        arr = arr_;
    }

    @Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return head == tail;
	}

}
