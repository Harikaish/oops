class Calculator{
public int add(int a, int b){
return a+b;
}
protected void display(){
System.out.println("Calculator");
}
private void show(){
System.out.println("private calc");
}
public void accessPrivate(){
show();
}
}
class AdvancedCalculator extends Calculator{
@Override
public int add(int a, int b) {
return a + b + 10;
}
@Override
protected void display() {
System.out.println("Advanced Calculator");
}
public void show() {
System.out.println("Method in AdvancedCalculator");
}
}
public class Main2 {
public static void main(String[] args) {
Calculator c1 = new Calculator();
Calculator c2 = new AdvancedCalculator();
System.out.println(c1.add(4, 3));
System.out.println(c2.add(4, 3));
c1.display();
c2.display();
c1.accessPrivate();
c2.accessPrivate();

}
}