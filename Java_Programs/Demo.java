/**
 * Demo
 */
public class Demo {
    static Demo s1;
    Demo s2;
    Demo(){
        s1=this;
        s2=this;
    }
    public static void main(String[] args){
        Demo s3;
        s3=new Demo();
        s1.fun();
        s3.s2.fun();
        s3.fun();
        }
        public void fun(){
            System.out.println("Better Days Will come...");
        }
}