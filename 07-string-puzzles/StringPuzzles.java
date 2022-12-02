class StringPuzzles {
    public static void main(String[] args) {
        conCat("abc", "cat"); //return "abcat"
        firstHalf("WooHoo"); //return "Woo"
        repeatEnd("Hello", 3); //return "llollollo"
        countHi("abc hi ho"); //return 1
    }
    //end main
    public static void conCat(String sentence1, String sentence2) {
        String s1last = sentence1.substring(sentence1.length()-1);
        String s2first = sentence2.substring(0,1);
        if(s1last.equalsIgnoreCase(s2first)) {
            System.out.println(sentence1.substring(0,sentence1.length()-1)+sentence2);
        }
        else{
            System.out.println(sentence1+sentence2); 
        }
    }
    //end conCat
    public static void firstHalf(String sentence) {
        if((sentence.length())%2==0) {
            int halfof = (sentence.length()/2);
            String last = sentence.substring(0, halfof);
            System.out.println(last);
        }
        else {
            System.out.println("Number is odd");
        }
    }
    //end firstHalf
    public static void repeatEnd(String sentence, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(sentence.substring(sentence.length()-n));
        }
    }
    //end repeatEnd
    public static void countHi(String sentence) {
        int count = 0;
        for(int i = 0; i <= sentence.length() -2; i++) {
            if(sentence.substring(i, i+2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
    //end countHi
    public static void withoutString(String base, String remove) {
        
    }
    //end withoutString
    public static void sumDigits(String sentence) {
        
    } 
    //end sumDigits
    public static void makeSarcastic(String sentence) {
        
    }
    //end makeSarcastic
}
//end class
