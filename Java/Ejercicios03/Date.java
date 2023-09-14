public class Date {
    private int day;
    private int mounth;
    private int year;
    
    Date(int day, int mounth, int year){
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    Date() {}

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getMounth() {
        return mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
