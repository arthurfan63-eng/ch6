public class gauss{


public static void main(String[] args){

squareRoot(9,9);

}




public static double squareRoot(double x, double n){
double acumilate;
double total = 0;
int xk = 0;
while (xk <=n){
xk++;
acumilate = Math.pow(-1,xk) * Math.pow(x,2*xk)/-2*xk;

total = total + acumilate;

System.out.println(total);
} 

return total;
}
}
