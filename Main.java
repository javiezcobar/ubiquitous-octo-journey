public class Main {
    public static void main(String[] args) {
        int result = suma(10,4,36);
        System.out.println(result);

        Coche myCoche = new Coche();
        myCoche.sumarPuertas();
        int numeroDePuertas = myCoche.puertas;
        System.out.println(numeroDePuertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }


}

class Coche {
    public int puertas = 0;

    public void sumarPuertas() {
        this.puertas++;
    }
}