package timecal;

public class Main {
    public static void main(String[] args) {
        Car c=new Car();
//        c.describe_car();
        c.setCompany_name("Nissan");
        c.setModel("r35");
        c.setSeries("GTR");
        c.setColor("Black");
        c.setDoor(2);
        c.setConvertiable(true);
        System.out.println(c.getCompany_name());
        System.out.println(c.getSeries());
        System.out.println(c.getModel());
        System.out.println(c.getColor());
        System.out.println(c.getDoor());
        System.out.println(c.isConvertiable());
    }
}
