package pkgmodel;

public class Gender {

    private double code;
    private String name;

    public Gender(double code) {
        this.code = code;
    }

    public Gender(String name) {
        this.name = name;
    }

    public Gender() {
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
        return "Gender{" + "name=" + name + '}';
    }

}
