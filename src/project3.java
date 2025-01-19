import java.util.*;

public class project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int i = 0;
        int size = 0;
        int[] words = new int[size];
        for (int a = 0; a < input.length(); a++) {
            for(int n = 0; n <= input.length()-4; n++) {
                if(i + 4 <= input.length() && input.substring(i, i + 4).equals("ZERO")) {
                    words = extendIntArray(words);
                    words[size] = 0;
                    size++;
                }
                if(i + 3 <= input.length() && input.substring(i, i + 3).equals("ONE")) {
                    words = extendIntArray(words);
                    words[size] = 1;
                    size++;
                }
                i++;
            }
        }

        //System.out.println(Arrays.toString(words));

        int[][] binaryMatrix = new int[words.length/8][8];
        int row = 0;
        int col = 0;
        for(var word : words) {
            binaryMatrix[row][col] = word;
            col++;
            if(col == 8) {
                row++;
                col = 0;
            }
        }

        String output = "";
        for(var binrow : binaryMatrix) {
            //System.out.println(Arrays.toString(row));
            int decimal = 0;
            int length = binrow.length-1;
            for(var word : binrow) {
                decimal += word * (int) Math.pow(2, length);
                length--;
            }
            //System.out.println(decimal);

            switch (decimal) {
                case 72: output += "H";
                    break;
                case 65: output += "A";
                    break;
                case 66: output += "B";
                    break;
                case 69: output += "E";
                    break;
                case 71: output += "G";
                    break;
                case 73: output += "I";
                    break;
                case 79: output += "O";
                    break;
                case 90: output += "Z";
                    break;
                case 52: output += "4";
                    break;
                case 67: output += "C";
                    break;
                case 75: output += "K";
                    break;
                case 51: output += "3";
                    break;
                case 82: output += "R";
                    break;
                case 53: output += "5";
                    break;
            }
        }
        System.out.println(output);
    }

    public static int[] extendIntArray(int[] arr) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}