package pkgmodel;

public class Principal {

    private Students student;
    private Gender genre;
    private Matter matt;
    private double notas;

    public Principal() {
    }

    public Principal(double codestu, double codegenre, double codematt, double notas) {
        this.student = new Students(codestu);
        this.genre = new Gender(codegenre);
        this.matt = new Matter(codematt);
        this.notas = notas;

    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Gender getGenre() {
        return genre;
    }

    public void setGenre(Gender genre) {
        this.genre = genre;
    }

    public Matter getMatt() {
        return matt;
    }

    public void setMatt(Matter matt) {
        this.matt = matt;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Principal{" + "student=" + student.getCode() + ", genre=" + genre.getCode() + ", matt=" + matt.getCode() + ", notas=" + notas + '}';
    }

}
