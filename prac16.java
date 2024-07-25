class Parent {
  
  void display() {
      System.out.println("This is parent class");
  }
}

class Child extends Parent {

  void displayChild() {
      System.out.println("This is child class");
  }
}

public class prac16 {
  public static void main(String[] args) {
      Parent parentObj = new Parent();
      parentObj.display();
      
      Child childObj = new Child();
      childObj.displayChild();
      
      childObj.display();
      System.out.println("\nID: 23DIT009");

  }
}
