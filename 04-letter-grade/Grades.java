import java.util.Scanner;
//imports scanner

class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        int grade = s.nextInt();
        //user inputs grade
            if (0<=grade&&grade<60) {
                System.out.print("F");
            }
            else if(60<=grade&&grade<70) {
                System.out.print("D");
            }
            else if(70<=grade&&grade<80) {
                System.out.print("C");
            }
            else if(80<=grade&&grade<90) {
                System.out.print("B");
            }
            else if(90<=grade) {
                System.out.print("A");
            }
            else {
                System.out.print("Error");
            }
            //for letter grade between 1 and 100, gives error otherwise
            
        int back = grade%10;
            if (0 <= grade && grade <= 19) {
                System.out.print("-");
            }
            else if (40 <= grade && grade < 60) {
                System.out.print("+");
            }
            else if (60 <= grade && grade <= 99) {
                if((back==0)||(back==1)||(back==2)) {
                    System.out.print("-");
                }
                else if((back==7)||(back==8)||(back==9)) {
                System.out.print("+");
                }
            }
            else if (grade == 100) {
                System.out.print("+");
            }
            //for + or -, f has own + and -, 100 is +
    }
    //end main
}
//end class
