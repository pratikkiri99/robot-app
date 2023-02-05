public class Robot {

    private String name;
    private int x;
    private int y;
    private Direction direction;

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Robot(String robotName, int x, int y, Direction direction) {
        this.name = robotName;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public boolean move() {
        Direction dir = getDirection();
        if (Direction.SOUTH == dir && (getY() - 1) >=0 ) {
            this.y--;
            System.out.println(this.getName() + " has moved");
            return true;
        } else if (Direction.NORTH == dir && (getY() + 1) <=5 ) {
            this.y++;
            System.out.println(this.getName() + " has moved");
            return true;
        } else if (Direction.WEST == dir && (getX() - 1 ) >=0 ) {
            this.x--;
            System.out.println(this.getName() + " has moved");
            return true;
        } else if (Direction.EAST == dir && (getX() + 1 ) <= 5) {
            this.x++;
            System.out.println(this.getName() + " has moved");
            return true;
        } else {
            System.out.println("Can't move as robot is at the border. Please change the direction first");
            return false;
        }
    }

    public void changeDirection(String dir) {
        if (Direction.isValidDirection(dir)) {
            this.direction = Direction.getDirection(dir);
            System.out.println(this.getName() + " has changed its direction to "+ dir);
        } else {
            System.out.println("Enter a valid direction");
        }
    }
}