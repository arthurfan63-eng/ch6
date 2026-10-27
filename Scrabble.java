public class Scrabble{


public static void main (String[]args){

String rack = "woeisme";
String word = "woeisme";


boolean sd = canScrabble(rack,word);
System.out.print(sd);
}




public static boolean canScrabble(String rack, String word){

 for(int i = 0; i<word.length();i++){
 char let = word.charAt(i);
 if (cancan(let,rack) < cancan(let,word)){return false;}
 }
 return true;
}

public static int cancan(char a,String s){
 int sum = 0;
 for (int i = 0; i< s.length(); i++){
 char lets = s.charAt(i);
 if(lets == a){sum++;}
 }
 return sum;

}




}
