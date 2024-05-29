package ArrayP;

public class PrintGrid {

    public static void main(String[] args) {
        @SuppressWarnings("MismatchedReadAndWriteOfArray")int[][] gridA = new int[10][10];
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print("  " + gridA[i][j]);
            }
            System.out.println();
        }

    }
}
