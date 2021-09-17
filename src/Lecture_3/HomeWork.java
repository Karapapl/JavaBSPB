package Lecture_3;

public class HomeWork {
  public static void main(String[] args) {

    String oneWord = "пЕнСи Онаер к А";
    String twoWord = "п  окра  С невние";

    oneWord = oneWord.toLowerCase().replace(" ", "");
    twoWord = twoWord.toLowerCase().replace(" ", "");
    if (oneWord.length() == twoWord.length()) {
      char[] temp1 = oneWord.toCharArray();
      char[] temp2 = twoWord.toCharArray();
      char[] temp3 = new char[oneWord.length()];
      char[] temp4 = new char[oneWord.length()];

      for (int k = 0; k < oneWord.length(); k++) {
        for (int j = 0; j < oneWord.length(); j++) {
          if (temp1[k] == temp2[j]) {
            temp3[k] = temp1[k];
            temp2[j] = 0;
            break;
          }
        }
      }
      temp2 = twoWord.toCharArray();
      for (int k = 0; k < oneWord.length(); k++) {
        for (int j = 0; j < oneWord.length(); j++) {
          if (temp2[k] == temp1[j]) {
            temp4[k] = temp2[k];
            temp1[j] = 0;
            break;
          }
        }
      }

      StringBuilder threeWord = new StringBuilder(String.valueOf(temp3));
      StringBuilder foreWord = new StringBuilder(String.valueOf(temp4));

      if (oneWord.equals(threeWord.toString()) && twoWord.equals(foreWord.toString())) {
        System.out.println("Слова " + "\"" + oneWord + "\"" + " и \"" + twoWord + "\" являются анаграммой.");
      } else {
        System.out.println("Слова " + "\"" + oneWord + "\"" + " и \"" + twoWord + "\" не являются анаграммой.");
      }

    } else {
      System.out.println("Длина слов \"" + oneWord + "\" и \"" + twoWord + "\" не совпадает, и слова не являются анаграммой.");
    }
  }

}


