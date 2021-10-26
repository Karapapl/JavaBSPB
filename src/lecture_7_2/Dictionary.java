package lecture_7_2;

public class Dictionary<T> {

  private Object[][] array = new Object[10][2];
  private int size;

  public int size() {
    return size;
  }

  public void add(Object key, Object str) {
    size++;
    boolean checkKey = true;
    for (int i = 0; i < array.length; i++) {
      if (array[i][0] != null) {
        if ((array[i][0].getClass() == key.getClass()) && (array[i][0].equals(key))) {
          checkKey = false;
          array[i][1] = str;
          break;
        }
      }
    }
    if (checkKey) {
      for (int i = 0; i < size; i++) {
        if (array[i][0] == null) {
          array[i][0] = key;
          array[i][1] = str;
          checkKey = false;
          break;
        }
      }
    }

    if (checkKey) {
      array[size - 1][0] = key;
      array[size - 1][1] = str;
    }


  }

  public T get(Object key) {
    int index = 0;
    boolean checkKey = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i][0] != null) {
        if ((array[i][0].getClass() == key.getClass()) && (array[i][0].equals(key))) {
          checkKey = true;
          index = i;
          break;
        }
      }
    }
    if (checkKey) {
      return (T) array[index][1];
    } else {
      return null;
    }
  }

  public void remove(Object key) {

    Object[][] newArray = new Object[array.length][2];
    int index = 0;
    boolean checkKey = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i][0] != null) {
        if ((array[i][0].getClass() == key.getClass()) && (array[i][0].equals(key))) {
          checkKey = true;
          index = i;
          break;
        }
      }
    }

    if (checkKey) {
      if (index > 0) {
        System.arraycopy(array, 0, newArray, 0, (index - 1));
      }
      System.arraycopy(array, (index + 1), newArray, index, (array.length - index - 1));
      array = newArray;
    } else {
      System.out.println("Ключ: " + key + " не найден в словаре");
    }
  }

}
