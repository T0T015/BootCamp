public class Main {
    public static void main(String[] args) {
        int resultado = summa(5,3,1);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.numerospuertas();
        miCoche.numerospuertas();
        miCoche.numerospuertas();
        System.out.println(miCoche.puertas);

    }

    public static int summa(int a, int b,int c){
        return a+b+c;
    }
}

class Coche{
    int puertas = 0;

    public void numerospuertas(){
        puertas++;
    }

}