import java.util.*;
class Sol{
public static void main(String args[]){
System.out.println("Enter the no of rows:");
Scanner ob = new Scanner(System.in);
int n =ob.nextInt();
for(int i=0 ;i<n;i++){
for(int j=0;j<n;j++){
if(i==j ||i+j ==n-1||i==(n-1)/2){
System.out.print("*");
}
else{
System.out.print(" ");
}
}System.out.println();
}
}
}