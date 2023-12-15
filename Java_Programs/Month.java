public class Month {
     static String  month="April";
    public static void main(String[] args){
       System.out.println(month+" is in "+getQuater(month));

    
    }
    public static String getQuater(String month){
        return switch(month){
            // case "January":
            // case "February":
            // case "March":
            // return "1st quater"  ;
            // case "April":
            // case "May":
            // case "June":
            // return "2nd quater"  ;
            // case "July":
            // case "August":
            // case "September":
            // return "3rd quater"  ;
            // case "October":
            // case "November":
            // case "December":
            // return "4th quater"  ;
            // default:
            // return "error";
            case "January","February","March"->"1st quater";
            case "April","May","June"->"2nd quater";
            case "July","August","September"->"3rd quater";
            case "October","November","December"->"4th Quater";
            default -> "error";
        };
        
    }
    
}
