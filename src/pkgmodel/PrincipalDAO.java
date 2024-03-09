package pkgmodel;

public class PrincipalDAO {

    private double approval = 0;
    private double total = 0;
    private int regular = 0;
    private String resultSM = "";
    private String resultSS = "";
    private double sumbio = 0;
    private double sumgeo = 0;
    private double summat = 0;

    public double passrate(Principal[] object) {

        for (Principal ob : object) {
            total++;
            if (ob.getNotas() >= 60.0) {
                approval++;
            }
        }

        return approval / total;
    }

    public int regularclass(Principal[] object) {
        regular = 0;
        for (Principal ob : object) {
            if (ob.getNotas() >= 60.0 && ob.getNotas() <= 80.0) {
                regular++;
            }
        }
        
        return regular;
    }

    public String bestmatter(Principal[] object) {

        MatterDAO max = new MatterDAO();

        double countbio = 0;
        double countgeo = 0;
        double countmat = 0;

        for (Principal student : object) {

            if (student.getMatt().getCode() == 1.0) {
                sumbio += student.getNotas();
                countbio++;
            } else if (student.getMatt().getCode() == 2.0) {
                sumgeo += student.getNotas();
                countgeo++;
            } else if (student.getMatt().getCode() == 3.0) {
                summat += student.getNotas();
                countmat++;
            }
        }

        double prombio = sumbio / countbio;
        double promgeo = sumgeo / countgeo;
        double prommat = summat / countmat;

        if (prombio > promgeo && prombio > prommat) {
            resultSM = max.associationame(1.0);
        } else if (promgeo > prombio && promgeo > prommat) {
            resultSM = max.associationame(2.0);
        } else if (prommat > prombio && prommat > promgeo) {
            resultSM = max.associationame(3.0);
        }

        return resultSM;
    }

    public String beststudent(Principal[] object) {

        double highestNote = 0;
        StudentsDAO stund = new StudentsDAO();

        for (Principal student : object) {
            if (student.getMatt().getCode() == 1.0 && student.getNotas() > highestNote) {
                highestNote = student.getNotas();
                double code = student.getStudent().getCode();
                resultSS = stund.associationame(code);
            }
        }
        return resultSS;
    }
}
