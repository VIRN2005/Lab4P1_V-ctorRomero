package lab4p1.víctorromerofinal;

import java.util.Scanner;

public class Lab4P1VíctorRomeroFINAL {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        System.out.println("Victor Romero - 12211079");
        System.out.println(" ");
        
        do {
            System.out.println("___________________________________________________________________________ ");
            System.out.println(" ");
            System.out.println(">> MENU <<");
            System.out.println("----------------------- ");

            System.out.println("1) EJERCICIO 1 - Sumador Binario");
            System.out.println("2) EJERCICIO 2 - Contains");
            System.out.println("3) EJERCICIO 3 - Alpha");
            System.out.println("4) SALIDA");
            System.out.println(" ");
            System.out.println(" ");

            System.out.print(">> Ingrese la Opcion del Menu: ");
            opcion = leer.nextInt();
            System.out.println("=> La Opcion escojida es: " + opcion);
            System.out.println(" ");

            switch (opcion) {
                case 1: {
                    System.out.println(".: OPCION 1 :.");
                    System.out.println("SUMADOR BINARIO EN CURSO...");
                    System.out.println(" ");

                    System.out.println("> Ingrese el PRIMER Numero: ");
                    String num1 = leer.next();

                    System.out.println("> Ingrese el SEGUNDO Numero: ");
                    String num2 = leer.next();

                    binary(num1, num2);
                }
                break;

                case 2:
                    System.out.println(".: OPCION 2 :.");
                    System.out.println("CONTAINS EN CURSO...");
                    System.out.println(" ");

                    System.out.println("> Ingrese la PRIMERA Cadena de Texto: ");
                    String Cadena1 = leer.next();
                    String cadena3 = leer.nextLine();
                    
                    String cadena1=Cadena1.replace(" ", ".");
                    
                    System.out.println("> Ingrese la SEGUNDA Cadena de Texto: ");
                    String cadena2 = leer.next();

                    contains(cadena1, cadena2);
                    break;

                case 3: {
                    System.out.println(".: OPCION 3 :.");
                    System.out.println("PROGRAMA ALPHA EN CURSO...");
                    System.out.println(" ");

                    System.out.println("> Ingrese la Cadena de Texto: ");
                    String cadena = leer.next();
                    is_alpha(cadena);
                }
                break;
            }
        } while (opcion != 4);

    }// Fin Main

    public static void binary(String num1, String num2) {
        String result = "";
        if (num1.length() == num2.length()) {

            for (int i = 0; i < num1.length(); i++) {
                char palabra = num1.charAt(i);
                if (palabra != '0' && palabra != '1') {
                    System.out.println("> El PRIMER numero contiene caracteres distintos de '0' y '1'<");
                }
            }

            for (int j = 0; j < num2.length(); j++) {
                char palabra2 = num2.charAt(j);
                if (palabra2 != '0' && palabra2 != '1') {
                    System.out.println("> El SEGUNDO numero contiene caracteres distintos de '0' y '1'. ");
                }
            }
            
            
            char restante = '0';

            for (int v = num1.length() - 1; v >= 0; v--) {
                if (num1.charAt(v) == '0' && num2.charAt(v) == '0') {
                    if (restante == '0') {
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                    }
                } else if ((num1.charAt(v) == '0' && num2.charAt(v) == '1')
                        || ((num1.charAt(v) == '1' && num2.charAt(v) == '0'))) {
                    if (restante == '0') {
                        result = "1" + result;
                    } else {
                        restante = '1';
                        result = "0" + result;
                    }
                } else if (num1.charAt(v) == '1' && num2.charAt(v) == '1') {
                    if (restante == '0') {
                        restante = '1';
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                    }
                }
            }
            if (restante=='1'){
                result=restante+result;
            } 
            System.out.println(result);
        } else {
            System.out.println("Los numeros deben de tener el mismo numero de bits");
        }
    }

    public static void contains(String cadena1, String cadena2) {
        String Final = "";

        if (cadena1.length() < cadena2.length()) {
            System.out.println(" ");
            System.out.println("El tamano de la segunda cadena no puede ser mayor que el de la primera");
        } else {
            for (int i = 0; i < cadena2.length(); i++) {
                char palabra2 = cadena2.charAt(i);
                for (int j = 0; j < cadena1.length(); j++) {
                    char palabra1 = cadena1.charAt(j);
                    if (palabra1 == (palabra2)) {
                        //System.out.println(palabra1);
                        Final += palabra1;
                    }
                }
            }
            if (Final.length() == cadena2.length()) {
                System.out.println(" ");
                System.out.println("La cadena " + cadena1 + " contiene " + cadena2);
            } else {
                System.out.println(" ");
                System.out.println("La cadena " + cadena1 + " NO contiene " + cadena2);
            }
        }

    }

    public static void is_alpha(String cadena) {
        String cadenaLower;
        int Acum = 0;
        int i = 0;
        cadenaLower = cadena.toLowerCase();
        boolean valid = true;

        for (int h = 0; h < cadenaLower.length(); h++) {
            char palabra = cadenaLower.charAt(h);

            if ((int) palabra >= 97 && (int) palabra <= 122) {
                valid = true;
            }//Fin If
            else {
                valid = false;
                break;
            }
        }//Fin For h

        if (valid) {
            System.out.println(">>La cadena solo contiene letras<<");
        } else {
            System.out.println(">>La cadena contiene caracteres que no son letras<<");
        }
    }
}
