public class blast{







public static double sqrt(double n){
for (double a1 = 6, a2 = 10;
     0.0000001 > Math.abs(a1 - a2);
a1 = a2;
a2 = (a1 + n/a1)/2;
System.out.println(a2);
}



}



public static void main(String[] args){

sqrt(9);

}


}
}
