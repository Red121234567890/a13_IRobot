package a13_Robot;

public class NormalBehaviour implements IBehaviour{

    public NormalBehaviour() {
    }


    @Override
    public int moveCommand() {
        System.out.println("Normal behaviour ...");
        return 1;
    }
}
