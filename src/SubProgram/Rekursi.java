package SubProgram;

public class Rekursi {
    static void m1(){
        System.out.println("ini m1...");
    }
    static void m2(){
        System.out.println("ini m2...");
        m1();
    }
    static void m3(int n){
        if(n==0) return;
        System.out.println("ini m3...");
        m3(n-1); //rekursi
    }
    static int kali(int a, int b){
        int hasil=0;
        if(b==1) return a;
        hasil = a + kali(a,b-1);
        return hasil;
    }
    static int faktorial(int n){
        int hasil;
        if (n<=1) return(1);
        hasil = n*faktorial(n-1);
        return hasil;
    }
    static int fibo(int n){
        if(n<=1) return n;
        //int x = fibo (n-1);
        //int y = fibo (n-2);
        return(fibo(n-1)+fibo(n-2));//return(x+y);
    }
    public static void main(String[] args) {
        System.out.println("kali = "+kali(3,5));
        //3+(3x4) = 3+(3+(3x3) = 3+(3+(3+(3x2) = 3+(3+(3+(3+(3x1) 
        //= 3+3+3+3+3 = 15
        System.out.println("Faktorial = " +faktorial(4));
        //
        System.out.println("Fibonacci = " +fibo(6)); //0,1,1,2,3,5,8
    }
 
}