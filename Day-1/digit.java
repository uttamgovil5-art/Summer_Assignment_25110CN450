import java.util.Scanner;
public class digit {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  long n = sc.nextLong();
  int count=0;
  while(n>0) {
    count=count+1;
n=n/10;
  }
  System.out.println("digits in num =" + count);
}
}
