package lecture_4;

import java.util.Random;

public class DataBase implements randomClients {
  static Base[] clients = null;

  public void createRandomClients (int countClients) {
    clients = new Base[countClients];
    for (int i = 0; i < countClients; i++) {
      clients[i] = randomClient(i);
    }
  }

@Override
  public Base randomClient(int id) {
    String name;
    int inn = randomInn();
    if (id / 2 == 0) {
      name = randomCompanyName();
      int ogrn = randomOgrn();
      return new Company(id, inn, name, ogrn);
    } else {
      String sex = randomSex();
      if (sex.equals("Female")) {
        name = randomIndividualNameFemale();
      } else {
        name = randomIndividualNameMale();
      }
      int year = randomYear();
      return new Individual(id, name, year, sex, inn);
    }
  }

  private String randomCompanyName() {
    String[] CompanyName = {"Рога", "Копыта", "Бананы", "Игрушки", "Колбоса", "Станки"};
    Random random = new Random();
    int pos = random.nextInt(CompanyName.length);
    int pos2 = random.nextInt(CompanyName.length - pos);
    return ("ООО " + CompanyName[pos] + " и " + CompanyName[pos2]);

  }

  private String randomIndividualNameFemale() {
    String[] IndividualNameF = {"Александра", "Виктория", "Наталья", "Кристина", "Диана"};
    String[] IndividualNameF2 = {"Александравна", "Викторивна", "Григорьевна", "Сергеевна", "Михайловна"};
    int pos = new Random().nextInt(IndividualNameF.length);
    int pos2 = new Random().nextInt(IndividualNameF2.length - pos);
    return (IndividualNameF[pos] + " " + IndividualNameF2[pos2]);
  }

  private String randomIndividualNameMale() {
    String[] IndividualNameM = {"Александр", "Виктор", "Сергей", "Григорий", "Василий"};
    String[] IndividualNameM2 = {"Александрович", "Викторович", "Сергеевич", "Григорьевич", "Васильевич"};
    int pos = new Random().nextInt(IndividualNameM.length);
    int pos2 = new Random().nextInt(IndividualNameM2.length - pos);
    return (IndividualNameM[pos] + " " + IndividualNameM2[pos2]);
  }

  private String randomSex(){
    String[] sex = new String[]{"Male", "Female"};
    int pos = new Random().nextInt(sex.length);
    return (sex[pos]);
  }

  private int randomYear() {
    int minYear = 1930;
    int maxYear = 2021;
    int diff = maxYear - minYear;
    return new Random().nextInt(diff + 1) + minYear;
  }

  private int randomInn() {
    int min = 1111;
    int max = 9999;
    int diff = max - min;
    return new Random().nextInt(diff + 607136000) + min;
  }

  private int randomOgrn() {
    int min = 1111;
    int max = 9999;
    int diff = max - min;
    return new Random().nextInt(diff + 308250000) + min;
  }



}

  /*public static Base[] clients = new Base[]{
          new Individual(1, "Симпсон Гомер Абрахамович", 1968, "Male", 617117187),
          new Individual(2, "Керри Энн Мосс", 1975, "Female", 523824286),
          new Company(3, 1334122132, "WTF", 2085735710),
          new Company(4, 1234521532, "ООО Штучки", 1906357890),
          new Individual(5, "Йоханссон Скарлетт Карстеновна", 1985, "Female", 1579131125),
          new Individual(6, "Санчез Рик Неизвестнович", 1985, "Male", 1007966047),
          new Company(7, 1849707100, "Огурцы и капуста", 1148423240),
          new Company(8, 1238562020, "ТыНеПройдешь", 777831913),
          new Individual(9, "Арагорн Сын Араторна", 1245, "Male", 1579131125),
          new Individual(10, "Мохийам Елена Гайявна", 2456, "Female", 1007966047),
          new Company(11, 1978679500, "ЛегальныеТорренты", 1096519760),
          new Company(12, 1762558753, "Странная библиотека", 1609355445),
          new Individual(13, "Стейси Гвендолин Робертовна", 2011, "Female", 2103315332),
          new Individual(14, "Уик Джон Кианович", 1999, "Male", 1477792235),
          new Company(15, 1186965395, "Лучшие Напитки", 1269791497),
          new Company(16, 1510317497, "Худшие Печеньки", 1376409520),
          new Individual(17, "Уэйн Брюс Томасович", 1984, "Male", 1669036890),
          new Individual(18, "Пифия Глория Фостер", 2001, "Female", 1213285610),
          new Company(19, 1851097986, "Подозрительно дешево", 1586641083),
          new Company(20, 1922892001, "Подозрительно дорого", 1122405193)
  };
*/



