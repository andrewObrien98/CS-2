public class Practice {
    public static void main(String[] args) {
        char a = 97;
        char image1[][] = {
                {'*','*',' ',' ',' ',' ',' ',' ','*',' '},
                {' ','*',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ',' ',' ',' ','*','*',' ',' '},
                {' ','*',' ',' ','*','*','*',' ',' ',' '},
                {' ','*','*',' ','*',' ','*',' ','*',' '},
                {' ','*','*',' ','*','*','*','*','*','*'},
                {' ',' ',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ','*','*','*',' ',' ','*',' '},
                {' ',' ',' ',' ',' ','*',' ',' ','*',' '}
        };
        char [][] image = {{'*', ' '}, {'*'}, {'*', '*', '*'}};
        int howMany = howManyOrganisms(image1);
        System.out.println();
        System.out.println("--- Labeled Organism Image ---");
        for (char[] line : image1) {
            for (char item : line) {
                System.out.print(item);
            }
            System.out.println();
        }
        System.out.printf("There are %d organisms in the image.\n", howMany);
    }

    public static int howManyOrganisms(char[][] image){
        if(image.length < 1){return 0;}
        char letter = 96;
        int count = 0;
        char astrid = 42;
        for(int row = 0; row < image.length; row++){
            if(image[row].length > 0){
                for(int column = 0; column < image[row].length; column++){
                    if(image[row][column] == astrid){
                        letter++;
                        count++;
                        image[row][column] = letter;
                        organismFinder(image, row, column, letter);
                    }
                }
            }
        }
        return count;
    }

    public static void organismFinder(char[][] image, int row, int column, char letter){
        if(row + 1 < image.length){
            if(image[row + 1].length > column){
                if(image[row + 1][column] == (char)42) {
                    image[row + 1][column] = letter;
                    organismFinder(image, row + 1, column, letter);
                }
            }
        }
        if(row - 1 >= 0){
            if(image[row - 1].length > column){
                if(image[row - 1][column] == (char)42) {
                    image[row - 1][column] = letter;
                    organismFinder(image, row - 1, column, letter);
                }
            }
        }
        if(column + 1 < image[row].length){
            if(image[row][column + 1] == (char)42){
                image[row][column + 1] = letter;
                organismFinder(image, row, column + 1, letter);
            }
        }
        if(column - 1 >= 0){
            if(image[row][column - 1] == (char)42){
                image[row][column - 1] = letter;
                organismFinder(image, row, column - 1, letter);
            }
        }
    }
}