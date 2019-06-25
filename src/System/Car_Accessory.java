
package System;

/**
 *
 * @author LENOVO
 */
public class Car_Accessory {
    
    //Data Member
    
    private double iStereo = 103.49;
    private double Modified = 500.78;
    private double Customised = 2000.49;
    private double Leather = 1003.90;
    private double GPS = 180.29;

    public double getiStereo() {
        return iStereo;
    }

    public void setiStereo(double iStereo) {
        this.iStereo = iStereo;
    }

    public double getModified() {
        return Modified;
    }

    public void setModified(double Modified) {
        this.Modified = Modified;
    }

    public double getCostomised() {
        return Customised;
    }

    public void setCostomised(double Customised) {
        this.Customised = Customised;
    }

    public double getLeather() {
        return Leather;
    }

    public void setLeather(double Leather) {
        this.Leather = Leather;
    }

    public double getGPS() {
        return GPS;
    }

    public void setGPS(double GPS) {
        this.GPS = GPS;
    }
    
    public double AccessoryCost;
    public double GetAmount(){
        AccessoryCost = iStereo + Modified + Customised + Leather + GPS;
        return AccessoryCost;
    }
}
