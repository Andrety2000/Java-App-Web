public class Main {
    public static void main(String[] args) {

        int num[] = {10, 2, 8, 3, 1, 22, -2};//Datos numericos de interpretación

        int i=0; //Del o al 3
        int temp;

        //Menor a Mayor
        System.out.println("El Rerustado de Menor a Mayor");
        for(int j = 0;j<num.length -1;j++) {
            for (i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) { //Solo hará el cambio, cuando el actual > siguiente Menor a Mayor
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("Fin del Rerustado de Menor a Mayor");
    }
}