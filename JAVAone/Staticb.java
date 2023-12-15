class Staticb{  
 private void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Staticb a=new Dog();  
  a.eat();  
 }  
}  
