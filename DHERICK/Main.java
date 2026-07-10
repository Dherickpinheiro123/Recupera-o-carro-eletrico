public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Tesla Model 3");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
        System.out.println("Bateria: " + carro.getBateria() + "%");

        System.out.println("\nAcelerando...");

        for (int i = 0; i < 7; i++) {
            carro.acelerar();
        }

        System.out.println("\nTentando carregar com o carro em movimento...");
        carro.carregarBateria();

        System.out.println("\nFreando...");

        while (carro.getVelocidade() > 0) {
            carro.frear();
        }

        System.out.println("\nCarregando bateria...");
        carro.carregarBateria();

        System.out.println("\nEstado final do carro:");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
        System.out.println("Bateria: " + carro.getBateria() + "%");
    }
}