public class Switch1 {
    public static void main(String[] args) {
        getMonth("November");
        int value=4;
        switch(value){
            case 1:
                System.out.println("cal");
                break;
            case 2:
                System.out.println("cal2");
                break;
            case 3: case 4: case 5:
                System.out.println("cal3");
                break;
            default:
                System.out.println("cal4");
                break;
//          Enhanced Switch Statement:
//          case 1-> System.out.println("I miss the old kanye,");
//          case 2-> System.out.println(" Straight from the 'Go Kanye");
//          case 3,4,5->{
//                System.out.println("Chop up the soul Kanye,");
//          }
//          default -> System.out.println("Set on his goals Kanye");
       }
    }
    String month="April";
    public static void getMonth(String month){
        switch(month){
            case "January":
            case "February":
            case "March":
                System.out.println("1st");
            case "April":
            case "May":
            case "June":
                System.out.println("2nd");
            case "July":
            case "August":
            case "September":
                System.out.println("3rd");
            case "October":
            case "November":
            case "December":
                System.out.println("4th");
        }
    }
}
