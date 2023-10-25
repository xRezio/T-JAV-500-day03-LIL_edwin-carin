public class Astronaut {
    private static int counter = 0;
    private final String name;
    private int snacks = 0; 
    private String destination = null; 
    private final int id;

    public Astronaut(String name) {
        this.name = name.trim();
        this.id = counter++;
        System.out.println(this.name + " ready for launch!");
    }

    public String getName() {
        return name;
    }

    public int getSnacks() {
        return snacks;
    }

    public String getDestination() {
        return destination;
    }

    public int getId() {
        return id;
    }

    public void doActions(Object... actions) {
        for (Object action : actions) {
            if (action == null) {
                System.out.println(name + ": Nothing to do.");
            } else if (action instanceof planet.Mars) {
                destination = ((planet.Mars) action).getLandingSite();
                System.out.println(name + ": Started a mission!");
            } else if (action instanceof chocolate.Mars) {
                snacks++;
                System.out.println(name + ": Thanks for this Mars number " + ((chocolate.Mars) action).getId());
            } else if (action instanceof planet.moon.Phobos) {
                destination = ((planet.moon.Phobos) action).getLandingSite();
                System.out.println(name + ": Started a mission to Phobos!");
            }
            if (destination == null) {
                System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
            }
        }
    }
}
