public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3); {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        for (int numerofor = 0; numerofor <= 3; numerofor++){
            System.out.println(numerofor);
        }

        String estacion = "invierno";
        switch (estacion) {
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            default:
                System.out.println("No se encontró ninguna estación");
                break;
        }
    }
}