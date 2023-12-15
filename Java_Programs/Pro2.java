public class Pro2{
    Pro2(){
        System.out.println(this.hashCode());
    }
    {
        System.out.println(this.hashCode());
    }
    public static void main(String[] args){
        new Pro2();
    }
}