import java.util.Scanner;
public class While{
public static void main(String[] args){
int math, phy, che;
double finalscore;
boolean result=true;
Scanner marks=new Scanner(System.in);
while(result){
System.out.println("enter math mark: ");
math=marks.nextInt();
System.out.println("enter phy mark: ");
phy=marks.nextInt();
System.out.println("enter che mark: ");
che=marks.nextInt();
finalscore=(math+che+phy)/3;
if(finalscore>90){
System.out.println("exellent");
}

System.out.print("any more students");
result=marks.nextBoolean();
}
}
}
