package robotomi;

public class Application {

    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(),
                new DrawRobot()};
        for(int i=0; i< arr.length;i++)
            action(arr[i]);
    }

    public static void action(Robot robot) {
        if(robot instanceof SingRobot singRobot){
            singRobot.sing();
        } else if (robot instanceof DanceRobot danceRobot){
            danceRobot.dance();
        } else if (robot instanceof DrawRobot drawRobot){
            drawRobot.draw();
        }
    }
}
