public class Abecedarian{


public static void main (String[]args){

isAbc("abcde");

}




public static boolean isAbc(String n){
if (n.length()<=1){return true;}

 for(int i = 1; i<=n.length();i++){
 if (n.charAt(i) <= n.charAt(i-1)){return  false;}
 return true;
 
 }
 return true;



}






}
