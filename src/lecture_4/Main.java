package lecture_4;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {


    //Определяем кол-во объектов с типом ФЛ
    int x = 0;
    for (int i = 0; i < DataBase.clients.length; i++) {
      if (DataBase.clients[i] instanceof Individual) {
        if (((Individual) DataBase.clients[i]).sex == "Male") {
          x++;
        }
      }
    }

    //Формируем массив из ФЛ муж.рода
    Individual[] clientIndividual = new Individual[x];
    int k = 0;
    for (int i = 0; i < DataBase.clients.length; i++) {
      if (DataBase.clients[i] instanceof Individual) {
        if (((Individual) DataBase.clients[i]).sex == "Male") {
          clientIndividual[k] = (Individual) DataBase.clients[i];
          k++;
        }
      }
    }

    //Сортируем
    Arrays.sort(clientIndividual, Individual.SortYear);

    //Вывод
    for (int i = 0; i < clientIndividual.length; i++) {
      System.out.println(clientIndividual[i]);

    }
  }
}
