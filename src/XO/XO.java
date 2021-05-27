package XO;

import java.util.Random;
import java.util.Scanner;

public class XO {

    static final char EMPTY_CELL_SYMBOL = '-';
    static final int fieldSize = 5;

    public static void start(){
        char[][] field = new char[fieldSize][fieldSize];
        fillMatrix(field);

        drawField(field);

        do {
            doPlayerMove(field);
            drawField(field);
            if(IsWin(field, 'X')){
                System.out.println("Congrats! You win");
                break;
            }
            if(IsDraw(field)){
                System.out.println("Draw!!!");
                break;
            }
            doBotMove(field);
            drawField(field);
            if(IsWin(field, 'O')){
                System.out.println("Oops! You lost");
                break;
            }
            if(IsDraw(field)){
                System.out.println("Draw!!!");
                break;
            }
        }while (true);

    }

    static void fillMatrix(char[][] field){
        for (int v = 0; v < field.length; v++) {
            for(int h = 0; h < field.length; h++){
                field[v][h] = EMPTY_CELL_SYMBOL;
            }
        }
    }

    static boolean IsDraw(char[][] field){
        for (int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++){
                if(IsEmptyCell(field, v, h)){
                    return false;
                }
            }
        }
        return true;
    }


    static boolean IsEmptyCell(char[][] field, int v, int h){
        return field[v][h] == EMPTY_CELL_SYMBOL;
    }

    static boolean IsNotEmptyCell(char[][] field, int v, int h){
        return !IsEmptyCell(field, v, h);
    }

    static void doBotMove(char[][] field){
        Random random = new Random();

        int v, h;
        do {
            v = random.nextInt(fieldSize);
            h = random.nextInt(fieldSize);
        } while (IsNotEmptyCell(field, v, h));
        field[v][h] = 'O';
    }

    static void doPlayerMove(char[][] field){
        int v, h;
        do {
            v = getCoordinate(field, "строки");
            h = getCoordinate(field, "столбца");
        } while (IsNotEmptyCell(field, v, h));
        field[v][h] = 'X';
    }

    static int getCoordinate(char[][] field, String coordinateName){
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Введите номер %s от 1 до " + fieldSize + "%n", coordinateName);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= field.length);
        return coordinate;
    }

    static void drawField(char[][] field){
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++){
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean IsWin (char[][] field, char sign) {
        byte vert, horizont;
        byte Diag1 = 0;
        byte Diag2 = 0;

        //Horizontal
        for (int i = 0; i < field.length; i++) {
            horizont = 0;
            for (int j = 0; j < field.length; j++){
                if (field[i][j] == sign) {
                    horizont++;
                    if (horizont == fieldSize)
                        return true;
                }
            }

        }
        // Vertical
        for (int i = 0; i < field.length; i++) {
            vert = 0;
            for (int j = 0; j < field.length; j++){
                if (field[j][i] == sign) {
                    vert++;
                    if (vert == fieldSize)
                        return true;
                }
            }

        }
        // diagonals
        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++){
                if ((i == j && field[i][j] == sign))
                    Diag1++;
                if (Diag1 == fieldSize)
                    return true;
            }
        }
        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++){
                if (i + j == field.length - 1 && field[i][j] == sign)
                    Diag2++;
                if (Diag2 == fieldSize)
                    return true;
            }
        }

        return false;
    }

}


/** Хотел попробовать убрать дублирование кода при проверке условия победы) но не получается вставить условие как параметр
 для метода ChekWin.

 static boolean CheckWin(char[][] field, boolean check, char sign) {
 for (int i = 0; i < field.length; i++) {
 byte Dots = 0;
 for (int j = 0; j < field.length; j++) {
 if (check) {
 Dots++;}
 if (Dots == fieldSize){
 return true;
 }
 }
 }
 return check;
 }

 static boolean IsWin (char[][] field, char sign) {
 int i = 0;
 int j = 0;

 if (//Horizontal
 CheckWin(field, (field[i][j] == sign), sign) ||
 // Vertical
 CheckWin(field, (field[j][i] == sign), sign) ||
 // diagonals
 CheckWin(field, (i == j && field[i][j] == sign), sign) ||
 CheckWin(field, (i + j == field.length - 1 && field[i][j] == sign), sign))
 return true;
 else return false;

 }
 */
