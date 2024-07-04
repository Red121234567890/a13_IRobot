package a13_Robot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Robot robot1 = new Robot("Terminator");
//        Robot robot2 = new Robot("Optimus Prime");
//        Robot robot3 = new Robot("WALL-E");

        Robot robot1 = new Robot("Defensif robot");
        robot1.setBehaviour(new DefensiveBehaviour());
        Robot robot3 = new Robot(robot1);
        robot3.setNom("robot agressif");
        robot3.setBehaviour(new AgressiveBehaviour());

        Robot robot4 = new Robot("robot gentille");
        robot4.setBehaviour(new NormalBehaviour());

        robot1.move();
        robot3.move();
        robot4.move();
        robot4.setBehaviour(new DefensiveBehaviour());
        robot4.move();
        robot4.setBehaviour(new SupportBehavior());
        robot4.move();

    }
}