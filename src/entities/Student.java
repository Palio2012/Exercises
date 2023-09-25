package entities;

public class Student {

    private String name;
    private double media1;
    private double media2;
    private double media3;

    public Student(String name, double media1, double media2, double media3) {
        this.name = name;
        this.media1 = media1;
        this.media2 = media2;
        this.media3 = media3;
    }

    public double finalMedia () {
        return media1 + media2 + media3;
    }

    public double missingPoints () {
        return 60 - finalMedia();
    }


}
