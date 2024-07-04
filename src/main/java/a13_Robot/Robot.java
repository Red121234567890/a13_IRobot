package a13_Robot;

public class Robot {
    // OPEN CLOSE PRINCIPLE (SOLID)
    //Ferme à la modification
    //Ouvert à l'esteintion
    //Couplage faible et couplage fort


    /**
     *
     */
    private String nom;
    private IBehaviour behaviour;

    /**
     * Constructeur sans nom
     */
    public Robot() {
        this.nom = "sans nom";
    }

    /**
     *
     * @param nom
     */

    public Robot(String nom) {
        this.nom = nom;
    }

    /**
     * Constructeur par copie
     * @param robot
     */
    //Constructeur par copie
    public Robot(Robot robot) {
        this.nom = robot.nom;
        this.behaviour = robot.behaviour;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move()
    {
        System.out.println("     " + this.nom + "    ");
        int command = this.behaviour.moveCommand();

        System.out.println("   "  + this.nom + "   ");
    }



}

