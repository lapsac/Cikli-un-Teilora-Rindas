import java.util.Scanner;

class Main {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("x=");
    double x = sc.nextDouble();
    if (x < 0.1 || x > 1.5) {
      System.out.println("error");
      sc.close();
      return;
    }
  double a=-(2*x*2*x)/2;
  double s = a;
  int i = 4;
   
while (Math.abs(a) > 0.001){
  a= (-a*2*x*2*x)/(i*(i-1));
  s = s+a;
  i = i+2;
   } 
     System.out.printf("function=%.4f%n", 2*(Math.cos(x)*Math.cos(x)-1)); 
System.out.printf("summa=%.4f",s);
    sc.close();
    }
  }
