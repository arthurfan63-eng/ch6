public class Doubloon{


public static void main (String[]args){

boolean sd = isDouble("ABeghseghsBA");
System.out.print(sd);
}




public static boolean isDouble(String n){

 for(int i = 1; i<=n.length();i++){
 char let = n.charAt(i);
 if (count(n,let) % 2 != 0){return  false;}
 return true;
 
 }
 return true;



}

public static int count(String s, char let){
 int sum = 0;
 for (int i = 0; i< s.length(); i++){
 char lets = s.charAt(1);
 if(lets == let){sum++;}
 }
 return sum;

}




}
