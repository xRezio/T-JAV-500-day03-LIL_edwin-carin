package planet.moon;

import planet.Mars;

public class Phobos {
    private final Mars mars;
    private final String landingSite;

    public Phobos(Mars mars, String landingSite) {
        if (mars != null) {
            this.mars = mars;
            this.landingSite = landingSite;
            System.out.println("Phobos placed in orbit.");
        } else {
            this.mars = null;
            this.landingSite = null;
            System.out.println("No planet given.");
        }
    }

    public Mars getMars() {
        return mars;
    }

    public String getLandingSite() {
        return landingSite;
    }
}
