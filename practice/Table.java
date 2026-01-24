import java.util.Scanner;
public class Table {
public static void main(String[] args) {
Scanner no = new Scanner(System.in);
System.out.println("enter a number: ");
int n=no.nextInt();
for(int i = 1; i <= 10; i++) {
System.out.println(n + " x " + i + " = " + n * i);
}
}
}