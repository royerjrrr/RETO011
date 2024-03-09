package pkgmodel;

public class Matter {

    private double code;
    private String name;

    public Matter(double code) {
        this.code = code;
    }

    public Matter(String name) {
        this.name = name;
    }

    public Matter() {
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Matter{" + "name=" + name + '}';
    }

}
