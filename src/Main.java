public class Main {

    public static void main(String[] args) {

        int numerolf=0;
        int numeroWile=0;
        String estacion = "primavera";

        if(numerolf < 0 ){

            System.out.println("el número numerolf es negativo");

        }else if(numerolf > 0){

            System.out.println("el número numerolf es positivo");

        }else {

            System.out.println("el número numerolf es 0");

        }

        //--------------------------------------------------------------

        while(numeroWile<3){

            System.out.println("numeroWile = " + numeroWile);

            numeroWile++;

        }

        do{ //no sumo porque es indiferente de cara al bucle

            System.out.println("(do-while)numeroWile = " + numeroWile);

        }while(numeroWile < 3);

        //--------------------------------------------------------------

        for( int numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("numeroFor = " + numeroFor);

        }

        //-------------------------------------------------------------

        switch(estacion){

            case "primavera": System.out.println("Estación actual, PRIMAVERA");
            break;

            case "verano": System.out.println("Estación actual, VERANO");
            break;

            case "invierno": System.out.println("Estación actual, INVIERNO");
            break;

            case "otoño": System.out.println("Estación actual, OTOÑO");
            break;

            default : System.out.println("Estación del año desconocida");

        }

    }
}