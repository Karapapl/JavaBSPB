package lecture_7_1;

public class ObjectsArray<T> {

  private Object[] array = new Object[10];
  private int size;

  public int size() {
    return size;
  }

  public void add(Object str) {
    size++;
    boolean approveUpArray = false;
    boolean replacingDelValue = true;
    if (size > 1) {
      for (int i = 0; i < size - 1; i++) {
        if (array[i] == null) {
          array[i] = str;
          replacingDelValue = false;
        } else {

          if (array[i].getClass() == str.getClass()) {
            if (array[i].equals(str)) {
              approveUpArray = false;
              throw new ArrayStoreException("Значение " + str + " уже есть в данном массиве, его index равен " + i);
            } else {
              approveUpArray = true;
            }

          } else {
            approveUpArray = true;
          }
        }
      }
    }

    if (approveUpArray) {
      if (array.length < size) {
        Object[] newArray = new Object[array.length + 5];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
      }
      if (replacingDelValue) {
        array[size - 1] = str;
      }
    }
  }

  public void put(Object str, int index) {
    if (index > size - 1) {
      throw new IndexOutOfBoundsException("Index " + index + "не может быть меньше " + (size - 1));
    }
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index не может быть меньше нуля");
    }
    array[index] = str;
  }

  public T get(int index) {
    if (index > size - 1) {
      throw new IndexOutOfBoundsException("Index " + index + "не может быть меньше " + (size - 1));
    }
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index не может быть меньше нуля");
    }
    return (T) array[index];
  }

  public void remove(int index) {
    if (index > size - 1) {
      throw new IndexOutOfBoundsException("Index " + index + "не может быть меньше " + (size - 1));
    }
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index не может быть меньше нуля");
    }

    Object[] newArray = new Object[array.length];
    if (index > 0) {
      System.arraycopy(array, 0, newArray, 0, (index - 1));

    }
    System.arraycopy(array, (index + 1), newArray, index, (array.length - index - 1));

    array = newArray;
  }
}
