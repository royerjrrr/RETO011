package pkgmodel;

public class StudentsDAO {

    private Students name; // Asumiendo que Students tiene un atributo 'name'
    private int opcion;

    public String associationame(double code) {
        opcion = (int) code;

        switch (opcion) {
            case 1 ->
                name = new Students("Armando");
            case 2 ->
                name = new Students("Nicolas");
            case 3 ->
                name = new Students("Daniel");
            case 4 ->
                name = new Students("Maria");
            case 5 ->
                name = new Students("Marcela");
            case 6 ->
                name = new Students("Alexandra");
            default -> {
            }
        }
        return name.getName();
    }
}
