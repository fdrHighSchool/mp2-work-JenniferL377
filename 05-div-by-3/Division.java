class Division {
    public static void main(String[] args) {
        divBy3("12123");
    }
    public static boolean divBy3(String a) {
        int b = 0;
        for(int i = 0; i < a.length(); i++) {
            int  c = Integer.parseInt(a.substring(i, i+1));
            b += c;
        }
        if(b%3==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
