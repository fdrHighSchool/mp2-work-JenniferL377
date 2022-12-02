class Quarters {
  public static void main(String[] args) {
    System.out.println(countQuarters(8734));
    System.out.println(countQuarters(6824));
    System.out.println(countQuarters(3670));
  } 
  public static int countQuarters(int cents){
    String cent = Integer.toString(cents);
    if (2 > cent.length()) {
      return 0;
    }
    else {
        return (Integer.valueOf(cent.substring(cent.length() - 2))/25);
    }
  }
}
