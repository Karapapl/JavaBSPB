package lecture_4_ver_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    IClientGenerator generatorFL = new FLClientGenerator();
    IClientGenerator generatorUL = new ULClientGenerator();


    ArrayList<Client> list = new ArrayList<>();
    int size = 100;

    for (int i = 0; i < size; i++) {
      if (i % 2 == 0) {
        list.add(generatorUL.getRandomClient());
      } else {
        list.add(generatorFL.getRandomClient());
      }
    }


/*
    int x = 0;
    for (Client test : clients) {
      if (test instanceof FL) {
        if (((FL) test).sex.equals("Муж.")) {
          x++;
        }
      }
    }

    FL[] clientFL = new FL[x];
    int k = 0;
    for (int i = 0; i < clients.length; i++) {
      if (clients[i] instanceof FL) {
        if (((FL) clients[i]).sex.equals("Муж.")) {
          clientFL[k] = (FL) clients[i];
          k++;
        }
      }
    }

    Arrays.sort(clientFL, FL.SortYear);

    System.out.println("Отсортированный список ФЛ:");
    for (int i = 0; i < clientFL.length; i++) {
      System.out.println(clientFL[i]);
    }
*/



    System.out.println("Общий список клиентов:");
    for (int i = 0; i < size; i++) {
      if ((list.get(i).getClass() == FL.class) && (list.get(i) )) {
        System.out.println(list.get(i));
      }
    }
  }


}

