class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Generator");
        for (int i = 1; i<101; i++) {
            if (i%15 == 0) {
                System.out.print("\nFizz! Buzz! ");
            }
	        else if (i%3==0) {
		        System.out.print("\nFizz! ");
		        if (i/3==3) {
		            System.out.print("Fizz! ");
		        }
            }
            else if (i%5==0) {
                System.out.print("\nBuzz! ");
                if (i/5==5) {
		            System.out.print("Buzz! ");
		        }
            }
            else {
                System.out.print("\n"+i);
            }
        }
    }
}
