public class Mars {
    private static int counter = 0;
    private final int id;

    public Mars() {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }
}
