import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String name;
    private final List<Astronaut> members = new ArrayList<>();

    public void doActions(Object... actions) {
        if (actions == null || actions.length == 0) {
            System.out.println(name + ": Nothing to do.");
        } else {
            for (Object action : actions) {
                for (Astronaut astronaut : members) {
                    astronaut.doActions(action);
                }
            }
        }
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Astronaut astronaut) {
        members.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        members.remove(astronaut);
    }

    public int countMembers() {
        return members.size();
    }

    public void showMembers() {
        if (members.isEmpty()) {
            return;
        }
        StringBuilder builder = new StringBuilder(name + ": ");
        for (Astronaut astronaut : members) {
            builder.append(astronaut.getName()).append(" ");
            if (astronaut.getDestination() != null) {
                builder.append("on mission");
            } else {
                builder.append("on standby.");
            }
            builder.append(", ");
        }
        builder.setLength(builder.length() - 2);
        System.out.println(builder);
    }
}
