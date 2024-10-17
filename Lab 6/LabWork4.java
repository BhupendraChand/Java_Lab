class Circle {
   private float radius;

   Circle(){
      
   }

   Circle(float r) {
      radius = r;
   }

   public float findArea() {
      return (3.14f * radius * radius);
   }

   public float findCircumference() {
      return (2 * 3.14f * radius);
   }

}

public class LabWork4 {
   public static void main(String[] args) {
      Circle c1 = new Circle(4.0f);
      System.out.println("Area of Circle 1:" + c1.findArea());
      System.out.println("Circumference of Circle 1:" + c1.findCircumference());

      Circle c2 = new Circle(5.0f);
      System.out.println("Area of Circle 2:" + c2.findArea());
      System.out.println("Circumference of Circle 2:" + c2.findCircumference());
   }
}
