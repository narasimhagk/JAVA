public class Demo2_0 {
    Demo2_0 obj1;
    Demo2_0(){
        this.obj1=this;
    }
    public static void main(String[] args){
        Demo2_0 obj2=new Demo2_0();
        obj2.obj1.fun();
    }
    void fun(){
        System.out.println("User Method....");
    }
}
