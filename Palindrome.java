public class Palindrome{


public static void main (String[]args){

boolean thing = isPalindrome("dddddddd  ,.:;()[]{}!@#$%^&*;.;;");

System.out.print(thing);
}

public static boolean isPalindrome(String line){

String nonLetters = ",.:;()[]{}!@#$%^&* ";
String forward = "";
String back = "";

 for(int i = 0; i<line.length();i++){
 String current = line.substring(i,i+1);
 
 if (nonLetters.contains(current)) {

 } else{ 

	 forward +=current;}
 
}


 for(int i = line.length()-1; i>=0;i--){
 String current = line.substring(i,i+1);
 
 
 if (nonLetters.contains(current)) {

 } else{ back +=current;}
 
}
if (forward.equals(back)){
 
	return true;
}else{ 
return false;}



}

}
