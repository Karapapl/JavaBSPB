package lecture_4_ver_2;

import java.util.Random;

public class ULClientGenerator implements IClientGenerator {
  private static final String[] NamesTitleOne = {
          "Рога", "Печенье", "Варенье", "Специи", "Мишура"
  };

  private static final String[] NamesTitleTwo = {
          " и Копыта", " и Колбоса", " и Молоко", " и Петрович", " и Станки"
  };

  @Override
  public Client getRandomClient() {
    UL ul = new UL();
    Random random = new Random();
    ul.setId(random.nextInt(99999));
    ul.setTitle(NamesTitleOne[random.nextInt(NamesTitleOne.length)] + NamesTitleTwo[random.nextInt(NamesTitleTwo.length)]);
    ul.setInn(607136000 + random.nextInt(9999));
    ul.setOgrn(308250000 + random.nextInt(9999));
    return ul;
  }
}
