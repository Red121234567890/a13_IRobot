package a13_Robot;

public class AgressiveBehaviour implements IBehaviour {
    public AgressiveBehaviour() {
    }

    @Override
    public int moveCommand() {
        System.out.println("Comportement agressif ... ");
        return 0;
    }
}
