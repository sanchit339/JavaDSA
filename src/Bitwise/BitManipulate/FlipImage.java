package Bitwise.BitManipulate;

public class FlipImage {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {
        // take XOR and swap 1st last
        for (int[] row:image) {
            for (int i = 0; i < image[0].length; i++) {
                int temp = row[i]^1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
