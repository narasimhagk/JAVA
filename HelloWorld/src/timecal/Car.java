package timecal;

//import to another class
public class Car {
    private String company_name="Toyota";

    private String model="mk4";

    private String series="Supra";

    private String color="Black";

    private  int door=2;

    private  boolean convertiable=true;

    public String getCompany_name() {
        return company_name;
    }

    public String getSeries() {
        return series;
    }


    public boolean isConvertiable() {
        return convertiable;
    }

    public int getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }
    public String getModel(){
        return model;
    }

    public void setCompany_name(String company_name){
        this.company_name=company_name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertiable(boolean convertiable) {
        this.convertiable = convertiable;
    }

    public void describe_car(){
        System.out.println(door+" -Door " +
                company_name+" company name " +
                color+" color " +
                model+" model " +
                series+" series " +
                (convertiable?"convertiable":"not convertiable"));
    }
}
