package lesson6.gametank.gametankwithpackages.tank;

public enum Direction {

    UP(1), DOWN(2), LEFT(3), RIGHT(4);

    private int id;

    private Direction(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }
}