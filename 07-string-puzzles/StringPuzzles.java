class StringPuzzles {
    public static void main(String[] args) {
        conCat("abc", "cat"); //return "abcat"
        firstHalf("WooHoo"); //return "Woo"
        repeatEnd("Hello", 3); //return "llollollo"
        countHi("abc hi ho"); //return 1
        withoutString("Hello there", "llo"); //return "He there"
        sumDigits("aa1bc2d3"); //return 6
        makeSarcastic("For me it was never about money, but solving problems for the future of humanity."); //return "fOr Me It WaS nEvEr AbOuT mOnEy, BuT sOlViNg PrObLeMs FoR tHe FuTuRe Of HuMaNiTy"
    }
    //end main
    public static void conCat(String sentence1, String sentence2) {
        String s1last = sentence1.substring(sentence1.length()-1);
        //checks last char in sentence 1
        String s2first = sentence2.substring(0,1);
        //checks first char in sentence 2
        if(s1last.equalsIgnoreCase(s2first)) {
            System.out.println(sentence1+sentence2.substring(1));
        }
        //combines sentence one and everything from index 1 afterwards in sentence 2 if the characters are same
        else{
            System.out.println(sentence1+sentence2); 
        }
        //combines both sentences if characters are not the same
    }
    //end conCat
    public static void firstHalf(String sentence) {
        if((sentence.length())%2==0) {
            int halfof = (sentence.length()/2);
            String last = sentence.substring(0, halfof);
            System.out.println(last);
        }
        //returns first half if length is divisible by 2
        else {
            System.out.println("Number is odd");
        }
        //returns if odd
    }
    //end firstHalf
    public static void repeatEnd(String sentence, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(sentence.substring(sentence.length()-n));
        }
        //returns the last n amount of characters an n amount of times
    }
    //end repeatEnd
    public static void countHi(String sentence) {
        int count = 0;
        for(int i = 0; i <= sentence.length() -2; i++) {
            if(sentence.substring(i, i+2).equals("hi")) {
                count++;
            }
            //increases count if detects "hi"
        }
        //repeats to check two spaces at a time, from beginning until two spots from end to avoid out of bound
        System.out.println(count);
        //results
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
