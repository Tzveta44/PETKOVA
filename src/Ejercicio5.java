public class Ejercicio5 {



    public static void main(String[] args) {

        int[] prueba = {2,-4,-13,1,-3,15,1,9,6,-8,4,23,7,-13,15,-13,0,23,23,23,23,-13};
        int[] Mayor= getnumMajar_and_Count(prueba);
        int[] Menor= getnumMenor_and_Count(prueba);

        System.out.println("Salida:");

        System.out.println("El mayor es :"+Mayor[0]+" Y se repite "+Mayor[1]+" veces");
        System.out.println("El menor es :"+Menor[0]+" Y se repite "+Menor[1]+" veces");


    }


    public static int[] getnumMajar_and_Count(int[] n){

        int[] resultado =  {0,0};
        int count =0;
        int valor =Integer.MIN_VALUE;

        for (int i = 0; i < n.length-1; i++) {
            if (n[i] > valor) {
                valor = n[i];
                resultado[0]=valor;
                count= CuantasVeces_(n,valor);
                resultado[1]=count;

            }
        }
        return resultado;

    }




    public static int[] getnumMenor_and_Count(int[] n){
        int valor=Integer.MAX_VALUE;

        int[] resultado =  {0,0};
        int count =0;

        for (int i = 0; i < n.length-1; i++) {
            if (n[i] < valor) {
                valor = n[i];
                resultado[1]=count;
                resultado[0]=valor;
                count= CuantasVeces_(n,valor);
                resultado[1]=count;
            }
        }
        return resultado;




    }

    public  static int  CuantasVeces_(int[] n,int valor){

        int contador = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == valor) {
                contador++;
            }
        }
        return contador;
    }
}
