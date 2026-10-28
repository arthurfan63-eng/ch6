public class PPAP{


public static void main (String[]args){

String thing = ppap("I have a aiden, I have a aIDS");

System.out.print(thing);
}




public static String ppap(String line){

int numOfSpaces = 0;
String firstW = "";
String secondW = "";
boolean afterSpace = false;

 for(int i = 0; i<line.length();i++){
 
 if (line.charAt(i) == ' '){

	numOfSpaces++;

 afterSpace = true;
 continue;

 }


 if (line.charAt(i) == ','){
 continue;

 }


 if (numOfSpaces == 3 ){

 firstW += line.charAt(i); 
 }
  if (numOfSpaces == 7 ){

  if (afterSpace == true){

  char a = Character.toUpperCase(line.charAt(i));
   secondW += a; 
  }else{
 secondW += line.charAt(i); 
 }

 }
 afterSpace = false;





}


 return ("Uh! " +secondW + " " + firstW);



}












}
