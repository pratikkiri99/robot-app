# robot-app
Java based robot app that takes input from user on console and moves around the robot 

Enter value from the keywords given below
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

When you select the option 'PLACE',enter co-ordinates and direction to place a new robot in the format X,Y,Direction with below conditions
  X <=5 and X>=0 
  Y <=5 and y>=0 
  Direction could be either 'NORTH', 'EAST', 'WEST', 'SOUTH'


attaching the sample execution logs below

C:\Users\prati\jdk17\jdk17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Educational Edition 2020.2.1\lib\idea_rt.jar=64443:C:\Program Files\JetBrains\IntelliJ IDEA Educational Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\intelij-workspace\robot-app\out\production\robot-app Main
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

PLACE
Enter co-ordinates and direction to place a new robot in the format X,Y,Direction with below conditions 
  X <=5 and X>=0 
  Y <=5 and y>=0 
  Direction could be either 'NORTH', 'EAST', 'WEST', 'SOUTH'
2,3,NORTH
Robot 1 placed successfully
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 1 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 1 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

PLACE
Enter co-ordinates and direction to place a new robot in the format X,Y,Direction with below conditions 
  X <=5 and X>=0 
  Y <=5 and y>=0 
  Direction could be either 'NORTH', 'EAST', 'WEST', 'SOUTH'
4,1,EAST
Robot 2 placed successfully
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

ROBOT 2
ROBOT 2 is activated. X=4, Y=1, Direction : EAST
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 2 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Can't move as robot is at the border. Please change the direction first
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

NORTH
Robot 2 has changed its direction to NORTH
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 2 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

PLACE
Enter co-ordinates and direction to place a new robot in the format X,Y,Direction with below conditions 
  X <=5 and X>=0 
  Y <=5 and y>=0 
  Direction could be either 'NORTH', 'EAST', 'WEST', 'SOUTH'
2,4,SOUTH
Robot 3 placed successfully
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 2 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

ROBOT 3
ROBOT 3 is activated. X=2, Y=4, Direction : SOUTH
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 3 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 3 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 3 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Robot 3 has moved
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

MOVE
Can't move as robot is at the border. Please change the direction first
Enter value from the keywords given below 
 'PLACE' --> to place a new robot 
 'MOVE' --> to move robot in the existing direction 
 'NORTH' or 'SOUTH' or 'EAST' or 'WEST' --> to move robot in the new direction 
 'ROBOT <NUMBER>' --> to activate robot by its number 
 'REPORT' --> to print current status of all robots and exit 

REPORT
Robot Name: ROBOT 1, X=2, Y=5, Direction= NORTH
Robot Name: ROBOT 2, X=5, Y=3, Direction= NORTH
Robot Name: ROBOT 3, X=2, Y=0, Direction= SOUTH Currently active

Process finished with exit code 0

