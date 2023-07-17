package dulich;

/**
 *
 * @author Admin
 */
public class ScenicSpot {
    protected String nameOfPlace;
    protected String provice;
    protected String country;
    protected int duration;
    protected boolean inResort;
    protected boolean inHotel;
    protected boolean hasBuffet;
    protected float fee;

    public ScenicSpot() {
    }

    public ScenicSpot(String nameOfPlace, String provice, String country, int duration, boolean inResort, boolean inHotel, boolean hasBuffet, float fee) {
        this.nameOfPlace = nameOfPlace;
        this.provice = provice;
        this.country = country;
        this.duration = duration;
        this.inResort = inResort;
        this.inHotel = inHotel;
        this.hasBuffet = hasBuffet;
        this.fee = fee;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isInResort() {
        return inResort;
    }

    public void setInResort(boolean inResort) {
        this.inResort = inResort;
    }

    public boolean isInHotel() {
        return inHotel;
    }

    public void setInHotel(boolean inHotel) {
        this.inHotel = inHotel;
    }

    public boolean isHasBuffet() {
        return hasBuffet;
    }

    public void setHasBuffet(boolean hasBuffet) {
        this.hasBuffet = hasBuffet;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format(("|-----------------|------------|--------------|----------------|-----------|----------|------------|---------------|"), args);
    }
    
    
}
