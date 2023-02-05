import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    Map<Integer, Robot> robotMap = new HashMap<>();
    private Robot activeRobot;

    public Robot getActiveRobot() {
        return activeRobot;
    }
    public void setActiveRobot(Robot activeRobot) {
        this.activeRobot = activeRobot;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        one :while (true) {

            StringBuilder sb = new StringBuilder("Enter value from the keywords given below \n");
            sb.append(" 'PLACE' --> to place a new robot \n");
            sb.append(" 'MOVE' --> to move robot in the existing direction \n");
            sb.append(" 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction \n");
            sb.append(" 'ROBOT <NUMBER>' --> to activate robot by its number \n");
            sb.append(" 'REPORT' --> to print current status of all robots and exit \n");

            System.out.println(sb);

            String option = input.nextLine();

            if (Objects.nonNull(option) && !"".equals(option)) {

                if(option.startsWith("ROBOT") && option.contains(" ") && option.matches("^.+?\\d$")) {
                    String [] opt = option.split(" ");
                    int num = Integer.parseInt(opt[1]);
                    if( opt[0].equalsIgnoreCase("ROBOT") &&
                            ( num >= 1 && num <= main.robotMap.size())) {
                        main.setActiveRobot(main.robotMap.get(num));
                        System.out.println("ROBOT "+num+" is activated. X="+main.getActiveRobot().getX()+", Y="+main.getActiveRobot().getY()+", Direction : "+main.getActiveRobot().getDirection());
                    }
                }
                switch (option) {
                    case "PLACE" :
                        main.placeRobot(input);
                        break ;
                    case "MOVE" :
                        main.getActiveRobot().move();
                        break;
                    case "NORTH" :
                    case "SOUTH" :
                    case "WEST" :
                    case "EAST" :
                        main.getActiveRobot().changeDirection(option);
                        break;
                    case "REPORT" :
                        main.printReport();
                        break one;
                }
            }
        }

    }

    public void placeRobot(Scanner input) {
        while (true) {
            StringBuilder sb = new StringBuilder("Enter co-ordinates and direction to place a new robot in the format X,Y,Direction with below conditions \n");
            sb.append("  X <=5 and X>=0 \n");
            sb.append("  Y <=5 and y>=0 \n");
            sb.append("  Direction could be either 'NORTH', 'EAST', 'WEST', 'SOUTH'");
            System.out.println(sb);

            String option = input.nextLine();
            String arr[] = option.split(",");
            if ( isValidPlacement(arr) ) {
                int robotBuckets = robotMap.size();
                String robotName = "Robot "+(robotBuckets +1 );
                Integer x = Integer.parseInt(arr[0]);
                Integer y = Integer.parseInt(arr[1]);
                Direction dir = Direction.getDirection(arr[2]);
                Robot robot = new Robot(robotName,x, y, dir);
                robotMap.put(robotBuckets + 1 , robot);
                if(activeRobot == null)
                    activeRobot = robot;
                System.out.println(robotName + " placed successfully");
                break;
            }
        }
    }

    private boolean isValidPlacement(String arr[]) {
        if (arr.length != 3) {
            System.out.println("Incorrect values");
            return false;
        } else if ( !isDigit(arr[0]) || !isDigit(arr[1]) ||
                !isLimitedCoordinates(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) ) {
            System.out.println("Co-ordinates must be in digits and in range of 0 to 5");
            return false;
        } else if (!Direction.isValidDirection(arr[2])) {
            System.out.println("Enter a valid direction");
            return false;
        } /* ROBOTS SHOULD NOT CLASH WITH EACH OTHER
        else if(clashWithExistingRobot(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]))) {
            System.out.println("Already a robot present at that position. Please chose different co-ordinates");
            return false;
        }*/
        return true;
    }


    private boolean isDigit(String num) {
        return num.chars().allMatch(Character::isDigit);
    }

    private boolean isLimitedCoordinates (int x, int y) {
        if(x < 0 || x > 5)
            return false;
        else if (y < 0 || y > 5)
            return false;
        return true;
    }

    /*private boolean clashWithExistingRobot(int x, int y) {
        return robotMap.entrySet().stream().anyMatch(entry -> (entry.getValue().getX() == x &&
                entry.getValue().getY() == y));
    }*/

    public void printReport(){
        robotMap.forEach((k,v) -> {
            String active= "";
            if(activeRobot.getName().equalsIgnoreCase(v.getName())) {
                active = " Currently active";
            }
            System.out.println("Robot Name: ROBOT "+k+", X="+v.getX()+", Y="+v.getY()+", Direction= "+v.getDirection()+active);
        });
    }
}
