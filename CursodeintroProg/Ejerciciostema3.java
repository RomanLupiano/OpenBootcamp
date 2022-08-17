public class Main {
    public static void main(String[] args) {
    System.out.println(suma3valores(5, 10, 20));

    coche miCoche = new coche();
    miCoche.sumarPuertas();
    System.out.println(miCoche.numeropuertas);
    }

    public static int suma3valores(int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    int numeropuertas = 0;

    public void sumarPuertas(){
        numeropuertas += 1;
    }
}