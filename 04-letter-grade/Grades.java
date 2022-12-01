import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        int grade = s.nextInt();
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
            //for letter grade
            
        int back = grade%10;
            if((back==0)||(back==1)||(back==2)) {
                System.out.print("-");
            }
            else if((back==7)||(back==8)||(back==9)||(back==10)) {
                System.out.print("+");
            }
            //for + or -
        }
        
    }
