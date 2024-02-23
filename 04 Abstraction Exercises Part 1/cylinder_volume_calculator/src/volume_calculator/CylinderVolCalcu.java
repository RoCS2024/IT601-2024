package volume_calculator;

public class CylinderVolCalcu {
    private double radius;
    private double height;

    public static final double PI=3.1416;

    public CylinderVolCalcu(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    private double getProdOfTwo(){
        return this.radius * this.radius * this.height;
    }
    public double getVolumeOfCyl(){
        double volume;
        return volume = PI * getProdOfTwo();

    }
}
