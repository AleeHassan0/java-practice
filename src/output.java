public class output {
    public static void main (String [] arg){
System.out.println("hello word");
//print ln is used to print next line on next line in terminal
System.out.print("hello word"); //here ln is not used so both will print on the same line
System.out.print("hello word");

System.out.print("hello ali\n");//you can also use back slash n to print on next line
System.out.print("hello ali\n");
System.out.print("hello word \n with ali"); 
System.out.println(); //if you wirte sout ...this full line will come
    
int a=10;
int b=20;

int sum =a+b;
int ans=b-a/a;             //this will give ans 19
int ans1=(b-a)/a;         //this will give ans 1
System.out.println(sum);
System.out.println(ans); //actual answer shoudl be 1..but it gives 19.why ??? as java do not follow bodmas rule...
//it follows * / % then + -
System.out.println(ans1); 

}
}
