package Final_Project;

public class CheckCoordinates {


    // Парсит одну координату (x,y)
    public static int[] parseCoordinate(String inputCoordinate) {
        String[] shipPartCoordinate = inputCoordinate.split(",");

        return new int[]{Integer.parseInt(shipPartCoordinate[0]),
                Integer.parseInt(shipPartCoordinate[1])};
    }

    // Парсит координаты корабля (x1,y1;xn,yn)
    public static int[][] parseShipCoordinates(String shipCoordinates, int shipSize) {
        int[][] intCoordinates = new int[shipSize][2];

        String[] shipParts = shipCoordinates.split(";");

        for (int i = 0; i < shipParts.length; i++)
            intCoordinates[i] = parseCoordinate(shipParts[i]);

        return intCoordinates;
    }

    public static boolean arrangement(String userInput) {

        // Проверяет количество цифр в одной координате
        String[] xy = userInput.split(",");
        if (xy.length != 2) {
            System.out.println("Неверное количество координат для корабля, нужно только две цифры ");
            return false;
        }

        try {
            Integer.parseInt(xy[0]);
            Integer.parseInt(xy[1]);
        } catch (NumberFormatException e) {
            System.out.println("Вводить нужно только целые числа");
            return false;
        }


        // Проверяет что координата от 0 до 9
        if (Integer.parseInt(xy[0]) > 9 || Integer.parseInt(xy[0]) < 0 || Integer.parseInt(xy[1]) < 0 || Integer.parseInt(xy[1]) > 9) {
            System.out.println("Неверный ввод, цифры должны быть от 0 до 9");
            return false;
        }

        return true;
    }

    // Проверяет количество введённых координат
    public static boolean checkCoordinate(String userInput, int shipType) {

        String[] coordinate = userInput.split(";");
        if (coordinate.length != shipType) {
            System.out.println("неверное количество координат для кораблей, нужно: " + shipType + " координат");

            return false;
        }
        for (String coordinates : coordinate) {
            if (!arrangement(coordinates)) {
                return false;
            }
        }
        return true;
    }


    // Проверяет, что в массиве все значения одинаковые
    public static boolean allValuesEqual(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0])
                return false;

        }
        return true;
    }

    // Проверяет, что в массиве значения увеличиваются на единицу
    public static boolean checkValuesAdd(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1)
                return false;

        }
        return true;
    }

    public static boolean checkShip(int[][] shipCoordinate, int shipType) {
        if (shipType == 1)
            return true;


        int[] onlyX = new int[shipType];
        int[] onlyY = new int[shipType];


        for (int i = 0; i < shipType; i++) {
            onlyY[i] = shipCoordinate[i][1];
            onlyX[i] = shipCoordinate[i][0];
        }
        if (allValuesEqual(onlyY) && allValuesEqual(onlyX))
            return false;

        return checkValuesAdd(onlyY) || checkValuesAdd(onlyX);

    }

    public static boolean checkVerticalOrHorizontal(int[][] shipCoordinate) {
        int[] onlyX = new int[shipCoordinate.length];

        for (int i = 0; i < shipCoordinate.length; i++)
            onlyX[i] = shipCoordinate[i][0];
        if (checkValuesAdd(onlyX))
            return true;
        else return false;

    }


}

