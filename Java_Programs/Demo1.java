// Demo.java
 class Demo {
    public static void main(String[] args) {
        Demo1.staticMethod();
    }

    public void nonStaticMethod() {
        System.out.println("Inside non-static method");
    }
}

// Demo1.java
 class Demo1 {
    private static Demo staticVariable;

    static {
        staticVariable = new Demo();
        userMethod(staticVariable);
    }

    public static void staticMethod() {
        System.out.println("Inside static method");
        staticVariable.nonStaticMethod();
    }

    public static void userMethod(Demo obj) {
        System.out.println("Inside static user method");
        obj.nonStaticMethod();
        staticVariable = obj;
    }

    public static void main(String[] args) {
        System.out.println("Inside main method of Demo1");
    }
}
