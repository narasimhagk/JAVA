class Demo2{
    static Demo2 var1;
    Demo2 var2;
    Demo2(){
        this.var2=this;
    }
    public static void main(String[] args){
        Demo2.var1=new Demo2();
        Demo2.var1.var2.fun();
    }
    void fun(){
        System.out.println("User method");
    }
}