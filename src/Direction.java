import java.util.Objects;

public enum Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST;

    /**
     * Get Enum value of given direction string
     * @param direction
     * @return
     */
    public static Direction getDirection(String direction) {
        Direction result  = null;
        for (Direction dir : values()) {
            if(dir.name().equalsIgnoreCase(direction)) {
                result = dir;
                break;
            }
        }
        return result;
    }

    /**
     * true/false based on valid String input for direction
     * @param dir
     * @return
     */
    public static boolean isValidDirection(String dir) {
        Direction direction = getDirection(dir);
        if(Objects.nonNull(direction))
            return true;
        else
            return false;
    }
}
