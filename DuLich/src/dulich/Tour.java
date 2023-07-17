package dulich;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Tour {
    protected String nameOfTour;
    protected String tourType;
    protected Date startDate;
    protected String departurePlace;
    protected Spots schedule;

    public Tour() {
    }

    public Tour(String nameOfTour, String tourType, Date startDate, String departurePlace, Spots schedule) {
        this.nameOfTour = nameOfTour;
        this.tourType = tourType;
        this.startDate = startDate;
        this.departurePlace = departurePlace;
        this.schedule = schedule;
    }

    public String getNameOfTour() {
        return nameOfTour;
    }

    public void setNameOfTour(String nameOfTour) {
        this.nameOfTour = nameOfTour;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public Spots getSchedule() {
        return schedule;
    }

    public void setSchedule(Spots schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Tour{" + "nameOfTour=" + nameOfTour + ", tourType=" + tourType + ", startDate=" + startDate + ", departurePlace=" + departurePlace + ", schedule=" + schedule + '}';
    }
    
    
}
