package pkgmodel;

public class Students {

    private double code;
    private String name;

    public Students(double code) {
        this.code = code;
    }

    public Students(String name) {
        this.name = name;
    }

    public Students() {
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
        return "Students{" + "name=" + name + '}';
    }

}
