package lecture_10;

public class Log {

  private String timeStamp;
  private String level;
  private String logger;
  private String message;
  private String source;

  public Log(String timeStamp, String level, String logger, String message, String source) {
    this.timeStamp = timeStamp;
    this.level = level;
    this.logger = logger;
    this.message = message;
    this.source = source;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getLogger() {
    return logger;
  }

  public void setLogger(String logger) {
    this.logger = logger;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "Log {" +
            " TimeStamp='" + timeStamp + '\'' +
            ", Level='" + level + '\'' +
            ", Logger='" + logger + '\'' +
            ", Message='" + message + '\'' +
            ", Source='" + source + '\'' +
            '}';
  }
}
