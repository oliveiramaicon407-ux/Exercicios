public class Caminhao {
    private String placa;
    private String modelo;

    public Caminhao(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    } 
    
public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirResumo() {
        System.out.println("\n--- RESUMO DO CAMINHÃO ---");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
    }
}
