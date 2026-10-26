public class Roots{


public static void main(String[] args){

squareRoot(81);

}




public static double squareRoot(double n){
double a1 = n/2;
double a2 = a1 + (n/a1)/2;

while ( Math.abs(a2 - a1)>= 0.000000000000000001){
a2 = (a2 + n/a2)/2;
a1 = (a1 + n/a1)/2;

System.out.println(a2);

}

return a2;

}






}
