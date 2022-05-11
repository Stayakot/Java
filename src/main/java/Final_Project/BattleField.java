package Final_Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Final_Project.CheckCoordinates.*;


public class BattleField {

    private String playerName;
    private int[][] playerOwnField;
    private int[][] playerEnemyField;
    private boolean playerFieldArranged;

    public BattleField(String playerName) {
        this.playerName = playerName;
        this.playerOwnField = new int[10][10];
        for (int[] row : this.playerOwnField)
            Arrays.fill(row, -1);
        this.playerEnemyField = new int[10][10];
        for (int[] row : this.playerEnemyField)
        Arrays.fill(row, -1);
    }

    public int[][] getPlayerEnemyField() {
        return playerEnemyField;
    }

    public int[][] getPlayerOwnField() {
        return playerOwnField;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean isPlayerFieldArranged() {
        return playerFieldArranged;
    }

    public void filledField() {

        System.out.println("Начнем расставлять корабли на поле " + playerName + ". Другой игрок, не смотри!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y;)");
        String userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 4))
            userInput = scanner.nextLine();
        System.out.println("Твое поле");
        printOwnField();



        System.out.println("Введи координаты первого трехпалубного корабля (формат: x,y;x,y;x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 3))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты второго трехпалубного корабля (формат: x,y;x,y;x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 3))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты первого двухпалубного корабля (формат: x,y;x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 2))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты второго двухпалубного корабля (формат: x,y;x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 2))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты третьего двухпалубного корабля (формат: x,y;x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 2))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты первого однопалубного корабля (формат: x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 1))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты второго однопалубного корабля (формат: x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 1))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты третьего однопалубного корабля (формат: x,y;)");
        userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 1))
            userInput = scanner.nextLine();
        printOwnField();

        System.out.println("Введи координаты четвертого однопалубного корабля (формат: x,y;)");
          userInput = scanner.nextLine();
        while (!arrangeShip(userInput, 1))
            userInput = scanner.nextLine();
        printOwnField();


        playerFieldArranged = true;

        if (playerFieldArranged) {
            System.out.println("Поле игрока " + playerName + " уже готово");
            return;
        }
    }

    // Выводит поле на экран
    public void printOwnField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (playerOwnField[i][j] == 1)
                    System.out.print("⛵ ");
                else if (playerOwnField[i][j] == 0)
                    System.out.print("\uD83D\uDFE6");
                else if (playerOwnField[i][j] == -2)
                    System.out.print("\uD83D\uDFE5");
                else
                    System.out.print("\uD83D\uDFE9");
            }
            System.out.println();

        }
    }

    public void printEnemyField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (playerEnemyField[i][j] == 0)
                    System.out.print("\uD83D\uDFE6");
                else if (playerEnemyField[i][j] == -2)
                    System.out.print("\uD83D\uDFE5");
                else
                    System.out.print("\uD83D\uDFE9");
            }
            System.out.println();

        }
    }

    // Пытается поставить на поле новый корабль, принимая на вход ввод из консоли
    public boolean arrangeShip(String userInput, int shipType) {
        if (!checkCoordinate(userInput, shipType))
            return false;

        int[][] shipCoordinates = parseShipCoordinates(userInput, shipType);
        if (!checkShip(shipCoordinates, shipType)) {
            System.out.println("Ваш корабль не валиден. " +
                    "Валидный корабль - это одна или несколько последовательно идущих клеток (по вертикали или горизонтали)");
            return false;
        }

        if (!checkEmptySpaceForShip(shipCoordinates, shipType)) {
            System.out.println("Корабль должен занимать только свободное пространство на карте. " +
                    "Помимо этого, Вокруг корабля должна быть область шириной в одну клетку, " +
                    "в которой не может быть других кораблей (ореол корабля)");
            return false;
        }


        arrangeShips(shipCoordinates, shipType);

        return true;
    }


    private void arrangeShips(int[][] shipCoordinates, int shipSize) {
        // arrange ship
        for (int[] shipCoordinate : shipCoordinates)
            playerOwnField[shipCoordinate[0]][shipCoordinate[1]] = 1;

        // arrange aureole
        List<Integer[]> shipAureole = getShipAureole(shipCoordinates, shipSize);

        for (Integer[] shipAureoleCoordinate : shipAureole)
            playerOwnField[shipAureoleCoordinate[0]][shipAureoleCoordinate[1]] = 0;
    }

    private boolean checkEmptySpaceForShip(int[][] shipCoordinates, int shipType) {
        for (int[] shipCoordinate : shipCoordinates) {
            if (playerOwnField[shipCoordinate[0]][shipCoordinate[1]] == 1)
                return false;
        }
        List<Integer[]> shipAureole = getShipAureole(shipCoordinates, shipType);

        for (Integer[] shipAureoleCoordinate : shipAureole) {
            if (playerOwnField[shipAureoleCoordinate[0]][shipAureoleCoordinate[1]] == 1)
                return false;
        }

        return true;

    }

    // Возвращает координаты ореола корабля
    private List<Integer[]> getShipAureole(int[][] shipCoordinates, int shipSize) {
        List<Integer[]> shipAureole = new ArrayList<>();

        // Определяем расположение корабля (вертикально или горизонтально)
        boolean vertical = checkVerticalOrHorizontal(shipCoordinates);

        if (vertical) {
            // добавляем правый борт
            if (shipCoordinates[0][1] + 1 <= 9) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipAureole.add(new Integer[]{shipCoordinate[0], shipCoordinate[1] + 1});

                // добавляем правую верхнюю клетку
                if (shipCoordinates[0][0] - 1 >= 0)
                    shipAureole.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1] + 1});

                // добавляем правую нижнюю клетку
                if (shipCoordinates[shipSize - 1][0] + 1 <= 9) {
                    shipAureole.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1,
                            shipCoordinates[shipSize - 1][1] + 1});
                }
            }

            // добавляем левый борт
            if (shipCoordinates[0][1] - 1 >= 0) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipAureole.add(new Integer[]{shipCoordinate[0], shipCoordinate[1] - 1});

                // добавляем левую верхнюю клетку
                if (shipCoordinates[0][0] - 1 >= 0)
                    shipAureole.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1] - 1});

                // добавляем левую нижнюю клетку
                if (shipCoordinates[shipSize - 1][0] + 1 <= 9)
                    shipAureole.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1, shipCoordinates[shipSize - 1][1] - 1});
            }

            // добавляем верхнюю клетку
            if (shipCoordinates[0][0] - 1 >= 0)
                shipAureole.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1]});

            // добавляем нижнюю клетку
            if (shipCoordinates[shipSize - 1][0] + 1 <= 9)
                shipAureole.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1, shipCoordinates[shipSize - 1][1]});

        } else {
            // добавляем верхний борт
            if (shipCoordinates[0][0] - 1 >= 0) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipAureole.add(new Integer[]{shipCoordinate[0] - 1, shipCoordinate[1]});

                // добавляем правую верхнюю клетку
                if (shipCoordinates[shipSize - 1][1] + 1 <= 9)
                    shipAureole.add(new Integer[]{shipCoordinates[shipSize - 1][0] - 1, shipCoordinates[shipSize - 1][1] + 1});

                // добавляем левую верхнюю клетку
                if (shipCoordinates[0][1] - 1 >= 0)
                    shipAureole.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1] - 1});
            }

            // добавляем нижний борт
            if (shipCoordinates[0][0] + 1 <= 9) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipAureole.add(new Integer[]{shipCoordinate[0] + 1, shipCoordinate[1]});

                // добавляем левую нижнюю клетку
                if (shipCoordinates[0][1] - 1 >= 0)
                    shipAureole.add(new Integer[]{shipCoordinates[0][0] + 1, shipCoordinates[0][1] - 1});

                // добавляем правую нижнюю клетку
                if (shipCoordinates[shipSize - 1][1] + 1 <= 9)
                    shipAureole.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1, shipCoordinates[shipSize - 1][1] + 1});
            }

            // добавляем левую клетку
            if (shipCoordinates[0][1] - 1 >= 0)
                shipAureole.add(new Integer[]{shipCoordinates[0][0], shipCoordinates[0][1] - 1});

            // добавляем правую клетку
            if (shipCoordinates[shipSize - 1][1] + 1 <= 9)
                shipAureole.add(new Integer[]{shipCoordinates[shipSize - 1][0], shipCoordinates[shipSize - 1][1] + 1});
        }

        return shipAureole;
    }
}


