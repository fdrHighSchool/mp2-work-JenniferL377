class Quarters {
    public static void main(String[] args) {
        System.out.println(countQuarters(8734));
        System.out.println(countQuarters(6824));
        System.out.println(countQuarters(3670));
    } 
    //tests
    public static int countQuarters(int cents){
        String cent = Integer.toString(cents);
        //convert to string
        if (2 > cent.length()) {
            return 0;
        }
        //single digit no quarter value
        else {
            return (Integer.valueOf(cent.substring(cent.length() - 2))/25);
        }
        //find last two digits, get int value, divide by 25
    }
    //end countQuarters
}
//end class
