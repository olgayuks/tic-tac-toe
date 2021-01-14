import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int steps = 1;
        System.out.println("Введите имя игрока 1");
        String name = scanner.nextLine();
        System.out.println("Введите имя игрока 2");
        String name1 = scanner.nextLine();
        int player = 1;

        while (steps < 10) {
            if (player == 1) {
                System.out.println("Ход игрока " + name);
            } else {
                System.out.println("Ход игрока " + name1);
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (array[i][j] == 0) {
                        System.out.print("- ");
                    } else if (array [i][j] == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }

                }
                System.out.println();
            }
            System.out.println("Введите номер ячейки по горизонтали");
            int row = scanner.nextInt();
            while (row > 2 || row < 0) {
                System.out.println("Введите значение от 0 до 2");
                row = scanner.nextInt();
            }
            System.out.println("Введите номер ячейки по вертикали");
            int col = scanner.nextInt();
            while (col > 2 || col < 0) {
                System.out.println("Введите значение от 0 до 2");
                col = scanner.nextInt();
            }
            if (array[row][col] > 0) {
                System.out.println("Ячейка занята");
                continue;
            }
            array[row][col] = player;

            boolean win = true;
            for (int i = 0; i < 3; i++) {
                if (array[i][col] != player) {
                    win = false;
                    break;
                }
            }
            if (win == true) {
                if (player == 1) {
                    System.out.println("Игрок " + name + " выиграл!");
                } else {
                    System.out.println("Игрок " + name1 + " выиграл!");
                }
                break;
            }

            win = true;
            for (int j = 0; j < 3; j++) {
                if (array[row][j] != player) {
                    win = false;
                    break;
                }
            }
            if (win == true) {
                if (player == 1) {
                    System.out.println("Игрок " + name + " выиграл!");
                } else {
                    System.out.println("Игрок " + name1 + " выиграл!");
                }
                break;
            }

            win = true;
            for (int i = 0; i < 3; i++) {
                if (array[i][i] != player) {
                    win = false;
                    break;
                }
            }
            if (win == true) {
                if (player == 1) {
                    System.out.println("Игрок " + name + " выиграл!");
                } else {
                    System.out.println("Игрок " + name1 + " выиграл!");
                }
                break;
            }

            win = true;
            for (int i = 0; i < 3; i++) {
                if (array[2 - i][i] != player) {
                    win = false;
                    break;
                }
            }
            if (win == true) {
                if (player == 1) {
                    System.out.println("Игрок " + name + " выиграл!");
                } else {
                    System.out.println("Игрок " + name1 + " выиграл!");
                }
                break;
            }

            steps++;
            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
            if (steps > 9) {
                System.out.println("Ничья!");
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 0) {
                    System.out.print("- ");
                } else if (array [i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }

    }
}
