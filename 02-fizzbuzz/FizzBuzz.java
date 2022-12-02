class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Generator");
        for (int i = 1; i<101; i++) {
            if (i%15 == 0) {
                System.out.print("\nFizz! Buzz! ");
            }
	    //fits both
	    else if (i%3==0) {
	        System.out.print("\nFizz! ");
		if (i/3==3) {
		    System.out.print("Fizz! ");
		}
            }
	    //fizz numbers
            else if (i%5==0) {
                System.out.print("\nBuzz! ");
                if (i/5==5) {
		    System.out.print("Buzz! ");
		}
            }
	    //buzz numbers
            else {
                System.out.print("\n"+i);
            }
	    //numbers that dont fit
        }
	//range of numbers
    }
    //end main
}
//end class
