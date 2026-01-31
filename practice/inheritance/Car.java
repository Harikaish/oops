public class Car{
String model;
int year;
public Car(String model, int year){
this.model=model;
this.year=year;
}
public void display(){
System.out.println("model:"+model+",year"+year);
}
public static void main(String[] args){
Car mycar=new Car("bmw",2022);
mycar.display();
}
}
