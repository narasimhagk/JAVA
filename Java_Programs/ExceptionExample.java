 class ExceptionExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = a + b;
        try {
            if (c != 10) {
                throw new Exception(" Sum is has to be 10");
            }
        } catch (Exception e) {
            System.out.println("Hello"+e.getMessage());
        }
    }
}
