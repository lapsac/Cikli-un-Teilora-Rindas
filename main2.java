import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("x=");
    double x = sc.nextDouble();
    sc.close();
    if (x < -0.7 || x > 0.7) {
      System.out.println("error");
      return;
    }

    double s = 2*x/1;  // TODO: piešķirt mainīgam s sākumvērtību
    double a = s;  // TODO: piešķirt mainīgam a sākumvērtību
    int i = 1;     // TODO: piešķirt mainīgam i sākumvērtību
    while (Math.abs(a) > 0.001) {
      a = (a*i)*x*x/(i+2);  // TODO: aprēķināt nākošo rindas elementu un piešķirt mainīgam a
      s = s+a;  // TODO: pieskaitīt a pie rindas summas s
      i = i+2;  // TODO: izmainīt cikla parametru i
    }
    System.out.printf("function=%.4f%n", Math.log((1+x)/(1-x)));
    System.out.printf("summa=%.4f", s);
  }
}
