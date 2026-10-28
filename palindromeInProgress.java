public class palindrome{


public static void main (String[]args){

String thing = palin("deStacocatsed");

System.out.print(thing);
}

public static boolean palin(String line){

String nonLetters = ",.:;()[]{}!@#$%^&* ";
String forward = "";
String back = "";

 for(int i = 0; i<line.length();i++){
 char current = line.charAt(i);
 
 if (nonLetters.contains(current)) {

 } else{ forward +=current;}
 
}


 for(int i = line.length(); i>0;i--){
  char current = line.charAt(i);
 
 if (nonLetters.contains(current)) {

 } else{ back +=current;}
 
}
return "";
}

}
