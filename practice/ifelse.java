public class ifelse {
public static void main(String[] args) {
int itema=200, itemb=300, itemc=400;
double price;
price=((itema*2)+(itemb)+(itemc*3));
price=price-(price*0.1);
price=price+(price*0.05);
if(price>1500){
price=price-(0.05*price);}
else{
System.out.println("not eligible for discount");}
System.out.println(price);
}
}