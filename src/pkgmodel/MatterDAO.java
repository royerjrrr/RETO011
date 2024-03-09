package pkgmodel;

public class MatterDAO {

    private Matter name;
    private int opcion;

    public String associationame(double code) {

        opcion = (int) code;

        switch (opcion) {
            case 1 ->
                name = new Matter("Biologia");
            case 2 ->
                name = new Matter("Geografia");
            case 3 ->
                name = new Matter("Matematicas");
            default -> {
            }

        }

        return name.getName();
    }
}
