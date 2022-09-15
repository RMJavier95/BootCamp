public class If{
    public static void main(String[] args) {

        int numeroIf = -1;
        if (numeroIf > 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 0;
        do{
            numeroDoWhile ++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);

        int numeroFor = 0;
        for(numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }

        String estacion = "Verano";

        switch(estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otonio":
                System.out.println("Es Otonio");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}