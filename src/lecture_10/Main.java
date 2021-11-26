package lecture_10;


import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws IOException {

    String dir = "D:\\Java\\JavaBSPB\\resources\\data\\";
    String[] type = {"log"};
    Collection<File> files = FileUtils.listFiles(new File(dir), type, true);
    System.out.println(files);
    ArrayList<Log> log = new ArrayList<>();

    for (File file : files) {
      List<String> list = new ArrayList<>();

      try {
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
          int levelLastIndex = line.indexOf(' ', 26);
          String stringsLevel = line.substring(26, levelLastIndex);
          if (stringsLevel.equals("WARN")) {
            String stringsTimestamp = line.substring(0, 23);

            int loggerFirstIndex = line.indexOf('[');
            int loggerLastIndex = line.lastIndexOf(']');
            String stringsLogger = line.substring(loggerFirstIndex + 1, loggerLastIndex);

            int messageLastIndex = line.length();
            String stringsMessage = line.substring(loggerLastIndex + 3, messageLastIndex);

            String stringSource = file.toString();
            log.add(new Log(stringsTimestamp, stringsLevel, stringsLogger, stringsMessage, stringSource));

            line = reader.readLine();
          } else {
            line = reader.readLine();
          }
        }
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    Map<String, Log> map = log.stream().collect(Collectors.toMap(
            Log::getMessage,
            Function.identity(),
            (logObjects1, logObjects2) -> logObjects1));
    map.values().forEach(System.out::println);
  }

}


