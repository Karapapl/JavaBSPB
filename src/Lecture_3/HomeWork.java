package Lecture_3;

public class HomeWork {
  public static void main(String[] args) {

    String oneWord = "пЕнСи Онер к А";
    String twoWord = "п  окра  С нение";

    oneWord = oneWord.toLowerCase().replace(" ", "");
    twoWord = twoWord.toLowerCase().replace(" ", "");
    if (oneWord.length() == twoWord.length()) {
      char[] temp1 = oneWord.toCharArray();
      char[] temp2 = twoWord.toCharArray();
      char[] temp3 = new char[oneWord.length()];
      char[] empty = new char[oneWord.length()];
      String emptyWord = String.valueOf(empty);

      for (int k = 0; k < oneWord.length(); k++) {
        for (int j = 0; j < oneWord.length(); j++) {
          if (temp1[k] == temp2[j]) {
            temp3[k] = temp1[k];
            temp2[j] = 0;
            break;
          }
        }
      }
      String threeWord = String.valueOf(temp2);

      if (threeWord.equals(emptyWord)) {
        System.out.println("Слова " + "\"" + oneWord + "\"" + " и \"" + twoWord + "\" являются анаграммой.");
      } else {
        System.out.println("Слова " + "\"" + oneWord + "\"" + " и \"" + twoWord + "\" не являются анаграммой.");
      }

    } else {
      System.out.println("Длина слов \"" + oneWord + "\" и \"" + twoWord + "\" не совпадает, и слова не являются анаграммой.");
    }
  }

}


