package pkgmodel;

public class GenderDAO {

    private Gender name;
    private int opcion;

    public String associationame(double code) {
        
        opcion = (int) code;
        
        switch (opcion) {
            case 0 -> name = new Gender("Masculino");
            case 1 -> name = new Gender("Femenino");
            default -> {
            }
        }
        
        return name.getName();
    }
}
