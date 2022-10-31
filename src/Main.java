import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] list = new int[6][5];
        int[][] trans = new int[5][6];
        int temp = 0;
        int temp2 = 0;
        int number = 0;
        System.out.println("Matris\n" + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = number++;
                trans[j][i] = list[i][j];
            }

        }

        for (int[] a : trans) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
