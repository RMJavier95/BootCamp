public class Main{
    public static void main(String[] args) {
        Coche miCoche = new Coche(4);
        miCoche.anadirPuerta();

        System.out.println(miCoche.puertas);
    }
}

class Coche {
    int puertas = 4;

    public Coche(){
        this.puertas = 4;
    }
    public Coche(int puertas){
        this.puertas = puertas;
    }
    
    public int anadirPuerta(){
        return this.puertas ++;
    }

}
