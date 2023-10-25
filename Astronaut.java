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

    public void doActions(Object mars) {
            if(mars instanceof planet.Mars) {
                planet.Mars planetMars = (planet.Mars) mars;
                this.destination = planetMars.getLandingSite();
                System.out.println(this.name + ": Started a mission!");
            }
            else if (mars instanceof chocolate.Mars) {
                chocolate.Mars chocolateMars = (chocolate.Mars) mars;
                System.out.println(this.name + ": Thanks for this Mars number " + chocolateMars.getId());
                if (this.destination == null) {
                    System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
                }
                this.snacks++;

            } else if (mars instanceof planet.moon.Phobos) {
                planet.moon.Phobos phobos = (planet.moon.Phobos) mars;
                this.destination = phobos.getLandingSite();
                System.out.println(this.name + ": Started a mission!");
            }
        }

        public void doActions() {
            System.out.println(this.name + ": Nothing to do.");
            if (this.destination == null) {
                System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
            }
        }
}
