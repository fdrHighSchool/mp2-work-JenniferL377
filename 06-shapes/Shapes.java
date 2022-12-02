class Shapes {
    public static void main(String[] args) {
        System.out.println("Shapes");
        square(5);
    }
    public static void square(int x) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int col = 1; col <= x; col++) {
                System.out.print("* ");
            }
        }
    }
    public static void rectangle(int x, int y) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int col = 1; col <= y; col++) {
                System.out.print("* ");
            }
        }
    }
    public static void righttriangle(int x) {
        for(int row = 1; row <= x; row++) {
            String a = "";
            for (int col = 1; col <= row; col++) {
                a += "* ";
            }
            System.out.println(a);
        }
    }
    public static void triangle(int x) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int space = 1; space <= x-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
        }
    }
}
