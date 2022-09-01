public class Automovil {
    static int puertas;
    public void SumaPuerta(){
        puertas++;
    }

    public static void main(String[] args) {
        Automovil miAutomovil = new Automovil();
        miAutomovil.SumaPuerta();
        miAutomovil.SumaPuerta();
        System.out.println(Automovil.puertas);
    }


}
