package game;

public class GameMap {
    private int width;
    private int height;
    private char[][] cells;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new char[height][width];
        generateDefaultMap();
    }

    // Заполнение карты заранее подготовленным шаблоном
    private void generateDefaultMap() {
        char[][] template = {
                {'.', '.', '.', '.', '.', '.', '#', '.', '.', '.'},
                {'.', '~', '~', '.', '#', '.', '#', '.', '~', '.'},
                {'.', '~', '.', '.', '#', '.', '.', '.', '~', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'#', '#', '.', '#', '#', '#', '.', '#', '#', '#'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '#', '.', '#', '#', '.', '#', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '.', '#', '.', '#', '.'},
                {'.', '.', '.', '#', '#', '.', '.', '.', '.', 'G'},
                {'.', '.', '.', '.', '.', '.', '#', '.', '.', '.'}
        };
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[y][x] = template[y][x];
            }
        }
    }

    public void setCell(int x, int y, char value) {
        if (inBounds(x, y)) cells[y][x] = value;
    }

    public char getCell(int x, int y) {
        return inBounds(x, y) ? cells[y][x] : ' ';
    }

    public boolean inBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public void print(Unit player, Unit enemy) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (player.getX() == x && player.getY() == y) {
                    System.out.print("U ");
                } else if (enemy.getX() == x && enemy.getY() == y) {
                    System.out.print("E ");
                } else {
                    System.out.print(cells[y][x] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

// Класс юнита
class Unit {
    private String name;
    private int x;
    private int y;

    public Unit(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public String getName() { return name; }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return name + ("x = " + x + ", y = " + y );
    }
}

// Пример использования
class StrategyGame {
    public static void main(String[] args) {
        GameMap map = new GameMap(10, 10);

        Unit player = new Unit("Игрок ", 0, 9);
        Unit enemy = new Unit("Враг ", 9, 9);

        System.out.println("Карта:");
        map.print(player, enemy);

        System.out.println(player);
        System.out.println(enemy);
    }
}