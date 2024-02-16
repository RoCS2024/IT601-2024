package volume_calculator;

public class CylinderVolCalcu {
    private double radius;
    private double height;
    private double volume;

    public CylinderVolCalcu(double radius, double height){
        this.radius = radius;
        this.height = height;
        this.volume = volume;
    }

    private double getProdOfTwo(){
        return this.radius * this.radius * this.height;
    }
    public double getVolumeOfCyl(){
        final double PI = Math.PI;
        return volume = PI * getProdOfTwo();

    }
}
