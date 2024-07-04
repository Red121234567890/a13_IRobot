package a13_Robot;

public class DefensiveBehaviour implements IBehaviour{

    public DefensiveBehaviour() {
    }

    @Override
    public int moveCommand() {
        System.out.println("Defensive behaviour ... ");
        return 2;
    }
}
