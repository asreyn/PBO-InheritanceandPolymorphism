public class Lingkaran extends Bentuk {
    public static final double PHI = 3.14;   // konstanta kelas
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + getWarna() + ", luas = " + hitungLuas());
    }
}