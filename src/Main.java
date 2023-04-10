public class Main {
    public static void main(String[] args) {
        int[][] list = {{2, 3, 1}, {6, 5, 4}, {9, 7, 8}};
        int[][] trans = new int[3][3];
        System.out.println("Matrisimiz : ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrisimizin transpozu : ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                trans[i][j] = list[j][i];
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}