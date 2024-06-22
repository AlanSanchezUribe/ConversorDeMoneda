
import java.util.Scanner;

import ConsultaApi.conversorAPI;

public class App {
    public static void main(String[] args) throws Exception {
        String monedaBase = null;
        String monedaDestino = null;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("****************************************");

        while (true) {
            
        
        System.out.println("Las monedas disponibles son: ");
        System.out.println("1.- Peso argentino");
        System.out.println("2.- Dolar estadounidense");
        System.out.println("3.- Euro");
        System.out.println("4.- Real brasilero");
        System.out.println("5.- Peso chileno");
        System.out.println("6.- Peso colombiano");
        
        System.out.println("****************************************");

       
        conversorAPI api = new conversorAPI();

        System.out.println("Ingresa el numero de la opcion para la moneda base: ");
        switch (sc.next()) {
            case "1":
                System.out.println("Peso argentino");
                monedaBase = "ARS";
                break;
            case "2":
                System.out.println("Dolar estadounidense");
                monedaBase = "USD";
                break;
            case "3":
                System.out.println("Euro");
                monedaBase = "EUR";
                break;
            case "4":
                System.out.println("Real brasilero");
                monedaBase = "BRL";
                break;
            case "5":
                System.out.println("Peso chileno");
                monedaBase = "CLP";
                break;
            case "6":
                System.out.println("Peso colombiano");
                monedaBase = "COP";
                break;
            default:
                System.out.println("Seleccione una opcion de moneda valida");
        }


            System.out.println("Ingresa el numero de la opcion para la moneda destino: ");
            switch (sc.next()) {
                case "1":
                    System.out.println("Peso argentino");
                    monedaDestino = "ARS";
                    break;
                case "2":
                    System.out.println("Dolar estadounidense");
                    monedaDestino = "USD";
                    break;
                case "3":
                    System.out.println("Euro");
                    monedaDestino = "EUR";
                    break;
                case "4":
                    System.out.println("Real brasilero");
                    monedaDestino = "BRL";
                    break;
                case "5":
                    System.out.println("Peso chileno");
                    monedaDestino = "CLP";
                    break;
                case "6":
                    System.out.println("Peso colombiano");
                    monedaDestino = "COP";
                    break;
                default: 
                    System.out.println("Seleccione una opcion de moneda valida");
            }

            System.out.println("Ingresa el monto: ");
            double cantidad = sc.nextDouble();
            
            double result = api.getMoneda(monedaBase, monedaDestino, cantidad);
            System.out.println("La conversion de " + monedaBase + " a " + monedaDestino + " es de: " + result);

            System.out.println("¿Desea realizar otra conversion? (s/n)");
            String answer = sc.next();
            if (answer.equals("n")) {
                break; 
            } else if (answer.equals("s")) {    
                continue;
                
            
            } else if 
                 (!answer.equals("s") || !answer.equals("n")) {
                    System.out.println("Por favor, ingrese 's' para si o 'n' para no");
                    answer = sc.next();
                 }     
           
        }
            
            System.out.println("****************************************");
            System.out.println("Gracias por usar el conversor de monedas");
            System.out.println("****************************************");

            
        
        }

}

