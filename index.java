import java.util.Scanner;

class Calculadora {

    private static long suma(int[] lista_numeros){
        long oput = 0;
        for (int d : lista_numeros){
            oput += (long)d;
        }
        return oput;
    }

    private static long resta(int[] lista_numeros) {
        long oput = 0;
        for (int d : lista_numeros){
            oput -= (long)d;
        }
        return oput;
    }

    private static long multiplicar(int[] lista_numeros) {
        long oput = 0;
        for (int d : lista_numeros){
            oput *= (long)d;
        }
        return oput;
    }

    private static long dividir(int[] lista_numeros) {
        long oput = 0;
        for (int d : lista_numeros){
            oput /= (long)d;
        }
        return oput;
    }

    public static void main(String args[]) {

        String __autor__ = "DesmonHak";

        while (true == true){

            Scanner Input = new Scanner(System.in);

            byte option = 0;

            System.out.print("Introduce la cantidad de numeros a recibir: ");
            int longitud_de_lista = Input.nextInt();
            System.out.println("\n\n");

            int lista_numeros[] = new int[longitud_de_lista];

            for (int i = 0; i < longitud_de_lista; i++){
                System.out.print(i+" Introduce un numero: ");
                lista_numeros[i] = Input.nextInt();
            }

            while (true == true){
                System.out.print("para sumar introduzaca 'suma'\npara resta introduzca 'resta'\npara divir introduzca 'dividir\npara multiplicar introduzca 'multiplicar'\n\nescoga una opcion: ");
                String opcion = Input.nextLine();

                if (opcion.equalsIgnoreCase("suma")){
                    System.out.println(suma(lista_numeros));
                    break;
                } 
                else if (opcion.equalsIgnoreCase("resta")){
                    System.out.println(resta(lista_numeros));
                    break;
                } 
                else if (opcion.equalsIgnoreCase("dividir")){
                    System.out.println(dividir(lista_numeros));
                    break;
                }
                else if (opcion.equalsIgnoreCase("multiplicar")){
                    System.out.println(multiplicar(lista_numeros));
                    break;
                }
                else {
                    System.out.println("opcion incorrecta");
                }
            }
            System.out.print("salir o seguir? para segir introduzca 'true' de lo contrario introduzca 'false': ");
            String opcion = Input.nextLine();
            if (opcion.equalsIgnoreCase("true")){
                opcion = "";
            } else{
                break;
            }
        }
    }
}
