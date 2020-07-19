import java.util.Arrays;
public class Collections {
	public static void main(String[] args) {
		ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(10);
		list.add(8);
		list.add(5);
				list.display();
				System.out.println("\nelement at index in custom ArrayList > " + 1 + " = " + list.get(1));
				System.out.println("element removed from index " + 1 + " = " + list.remove(1));
				System.out.println("\nlet's display custom ArrayList again after removal at index 1");

				list.display();

			}

		}

		class ArrayListCustom<E> {
			
			private static final int INITIAL_CAPACITY = 10;
			private int size = 0;
			private Object elementData[] = {};

			public ArrayListCustom() {
				elementData = new Object[INITIAL_CAPACITY];
			}

			public void add(E e) {
				if (size == elementData.length) {
					ensureCapacity(); // increase current capacity of list, make it double.
										
				}
				elementData[size++] = e;
			}
			@SuppressWarnings("unchecked")
			public E get(int index) {
				// if index is negative or greater than size of size, we throw exception.
				if (index < 0 || index >= size) {
					throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
				}
				return (E) elementData[index]; // return value on index.
			}

			public Object remove(int index) {
				
				if (index < 0 || index >= size) {
					throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
				}

				Object removedElement = elementData[index];
				for (int i = index; i < size - 1; i++) {
					elementData[i] = elementData[i + 1];
				}
				size--; 
				return removedElement;
			}

			
			private void ensureCapacity() {
				int newIncreasedCapacity = elementData.length * 2;
				elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
			}

			
			public void display() {
				System.out.print("Displaying list : ");
				for (int i = 0; i < size; i++) {
					System.out.print(elementData[i] + " ");
				}
			}
		}