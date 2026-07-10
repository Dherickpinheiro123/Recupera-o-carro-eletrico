public class Carro {

    private String modelo;
    private int velocidade;
    private int bateria;

    public Carro(String modelo) {
        this.modelo = modelo;
        velocidade = 0;
        bateria = 100;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getBateria() {
        return bateria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {

        if (bateria == 0) {
            System.out.println("Bateria descarregada.");
            return;
        }

        if (velocidade == 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }

        velocidade += 20;
        bateria -= 5;

        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Bateria: " + bateria + "%");
    }

    public void frear() {

        if (velocidade > 0) {
            velocidade -= 20;
        }

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void carregarBateria() {

        if (velocidade != 0) {
            System.out.println("O carro precisa estar parado para carregar.");
            return;
        }

        bateria = 100;
        System.out.println("Bateria carregada.");
    }
}
