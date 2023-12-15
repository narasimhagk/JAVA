// We cannot use long,float,double, or boolean or their wrapper classes in Switch Statement

public class Moreline {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
         
        switch(i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4:case 5:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
            }
        }
    }
}
