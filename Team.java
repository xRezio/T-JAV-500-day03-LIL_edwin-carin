import java.util.ArrayList;

public class Team {

    private String name;
    ArrayList<Astronaut> astronauts;

    public Team(String name) {
        this.name = name;
        this.astronauts = new ArrayList<Astronaut>();
    }

    public String getName() {
        return this.name;
    }

    public void add(Astronaut astronaut) {
        this.astronauts.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        this.astronauts.remove(astronaut);
    }

    public int countMembers() {
        return this.astronauts.size();
    }

    public void showMembers() {

        if (this.astronauts.isEmpty()) {
            return;
        }

        StringBuilder members = new StringBuilder();
        for (Astronaut astronaut : this.astronauts) {
            if (astronaut.getDestination() != null) {
                members.append(astronaut.getName() + " on mission, ");
            } else {
                members.append(astronaut.getName() + " on standby, ");
            }
        }

        System.out.println(this.name + ": " + members.substring(0, members.length() - 2) + '.');

    }

    public void doActions(Object mars) {
        if (mars instanceof planet.Mars) {
            // cast mars to planet.Mars
            planet.Mars planetMars = (planet.Mars) mars;
            for (Astronaut astronaut : this.astronauts) {
                astronaut.doActions(planetMars);
            }
        } else if (mars instanceof chocolate.Mars) {
            // cast mars to chocolate.Mars
            chocolate.Mars chocolateMars = (chocolate.Mars) mars;
            for (Astronaut astronaut : this.astronauts) {
                astronaut.doActions(chocolateMars);
            }
        } else if (mars instanceof planet.moon.Phobos) {
            // cast mars to planet.moon.Phobos
            planet.moon.Phobos phobos = (planet.moon.Phobos) mars;
            for (Astronaut astronaut : this.astronauts) {
                astronaut.doActions(phobos);
            }
        }

        }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
    }

}