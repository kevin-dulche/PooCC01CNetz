public class Vector3D {
    private double refX;
    private double refY;
    private double refZ;

    public Vector3D(double refX, double refY, double refZ) {
        this.refX = refX;
        this.refY = refY;
        this.refZ = refZ;
    }

    public Vector3D() {}

    public void setRefX(double refX) {
        this.refX = refX;
    }

    public double getRefX() {
        return refX;
    }

    public void setRefY(double refY) {
        this.refY = refY;
    }

    public double getRefY() {
        return refY;
    }

    public void setRefZ(double refZ) {
        this.refZ = refZ;
    }

    public double getRefZ() {
        return refZ;
    }

    public double MagnitudVector(){
        double mag = Math.sqrt(refX * refX + refY * refY + refZ * refZ);
        return mag;
    }
}