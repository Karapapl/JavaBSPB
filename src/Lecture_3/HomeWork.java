package Lecture_3;

public class HomeWork {
  public static void main(String[] args) {

    String oneWord = "пенсионерка";
    String twoWord = "покраснение";
    char[] temp1 = new char[oneWord.length()];
    char[] temp2 = new char[twoWord.length()];
    char[] temp3 = new char[oneWord.length()];

    for (int j = 0; j < oneWord.length(); j++) {
      temp1[j] = oneWord.charAt(j);
      temp2[j] = twoWord.charAt(j);
    }

    for (int k = 0; k < oneWord.length(); k++) {
      for (int j = 0; j < oneWord.length(); j++) {
        if (temp1[k] == temp2[j]) {
          temp3[k] = temp1[k];
          break;
        }
      }
    }

    StringBuilder threeWord = new StringBuilder(String.valueOf(temp3));

    if (oneWord.equals(threeWord.toString())) {
      System.out.println("Слова " + "\"" + oneWord + "\"" + " и \"" + twoWord + "\" являются анаграммой.");
    } else {
      System.out.println("Слова " + "\"" + oneWord + "\"" + " и \"" + twoWord + "\" не являются анаграммой.");
    }

  }

}


