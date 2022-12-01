public class Quarters {
  public static void main(String args[]) {
    countQuarters(1075);
  }
  public static int countQuarters(int cents) {
    String cent = Integer.toString(cents);
    Integer.parseInt((cent).length-2);
    return cent/25;
  }
}
