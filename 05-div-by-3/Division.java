class Division {
    public static void main(String[] args) {
        System.out.print(divBy3("12123"));
    }
    //test
    public static boolean divBy3(String a) {
        int b = 0;
        for(int i = 0; i < a.length(); i++) {
            int  c = Integer.parseInt(a.substring(i, i+1));
            b += c;
        }
        //adds each digit together
        if(b%3==0) {
            return true;
        }
        else {
            return false;
        }
        //returns true if divisible by three, false otherwise
    }
    //end divBy3
}
//end class
