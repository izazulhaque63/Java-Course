package method;

public class hollowrectangle {
    public static void hollowrectangle(int totalrw, int totalcl) {
        for (int i = 1; i <= totalrw; i++) {
            for (int j = 1; j <= totalcl; j++) {
                if (i == 1 || i == totalrw || j == 1 || j == totalcl) {
                    System.out.print("*");
                }else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= totalrw; i++) {
            for (int j = 1; j <= totalcl; j++) {
                if (i == 1 || i == totalrw || j == 1 || j == totalcl) {
                    System.out.print(" * ");
                }else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowrectangle(4,4);
        hollowrectangle(4,5);
    }
}
