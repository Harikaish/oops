class Calculator{
public int add(int a, int b){
return a+b;
}
protected int add(int a, int b, int c){
return a+b+c;
}
private double add(double a, double b){
return a+b;
}
public void decimal(double x, double y){
System.out.println("sum" + add(x,y));
}
}
public class Main{
public static void main(String[] ars){
Calculator c= new Calculator();
System.out.println(c.add(7,10));
System.out.println(c.add(1,2,0));
c.decimal(2000.5,7.5);
}
}
