public class MultidimensionalArrays {
    public static void main(String[] args) {

        int rowCol [][] = new int[10][5];

        for (int i = 0; i < rowCol.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" row " + i + " col " + j);
            }
            System.out.println();
        }

        int multiplcationTable [] = new int [12];

        System.out.println("Multiplication Table 1-12.");
        for (int i = 1; i <= multiplcationTable.length; i++) {
            for (int j = 1; j <= multiplcationTable.length; j++) {
                System.out.print(i*j);
                System.out.print('\t');

            }
            System.out.println();

        }
    }
}
