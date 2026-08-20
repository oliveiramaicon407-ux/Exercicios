/**
 *
 * Nesta primeira etapa, o nível do cliente é um número:
 * 1 = nível A, 2 = nível B e 3 = nível C.
 * Assim, usamos apenas comparações numéricas, que já foram estudadas.
 */
public class Cliente {

    // Encapsulamento: os atributos ficam protegidos com private.
    private String codigoCti;
    private String segmento;
    private int nivel;
    private String faixaFaturamento;
    private Consultor consultorResponsavel;

    /**
     * Construtor: cria um cliente e chama os setters para validar os dados.
     */
    public Cliente(
            String codigoCti,
            String segmento,
            int nivel,
            String faixaFaturamento,
            Consultor consultorResponsavel) {
        setCodigoCti(codigoCti);
        setSegmento(segmento);
        setNivel(nivel);
        setFaixaFaturamento(faixaFaturamento);
        setConsultorResponsavel(consultorResponsavel);
    }

    // Getter: consulta o código do cliente.
    public String getCodigoCti() {
        return codigoCti;
    }

    // Setter: neste exemplo inicial, apenas guarda o valor recebido.
    public void setCodigoCti(String codigoCti) {
        this.codigoCti = codigoCti;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    // Getter do nível numérico.
    public int getNivel() {
        return nivel;
    }

    /**
     * Setter com validação usando apenas operadores numéricos.
     * Os valores permitidos são 1, 2 ou 3.
     */
    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 3) {
            this.nivel = nivel;
        } else {
            System.out.println("Erro: o nível deve ser 1, 2 ou 3.");
        }
    }

    public String getFaixaFaturamento() {
        return faixaFaturamento;
    }

    public void setFaixaFaturamento(String faixaFaturamento) {
        this.faixaFaturamento = faixaFaturamento;
    }

    public Consultor getConsultorResponsavel() {
        return consultorResponsavel;
    }

    public void setConsultorResponsavel(Consultor consultorResponsavel) {
        this.consultorResponsavel = consultorResponsavel;
    }

    /**
     * Método de negócio: atualiza o nível usando a mesma regra do setter.
     */
    public void atualizarNivel(int novoNivel) {
        setNivel(novoNivel);
    }

    /**
     * Exibe os dados principais do cliente.
     */
    public void exibirResumo() {
        System.out.println("\n--- RESUMO DO CLIENTE CTI ---");
        System.out.println("Código CTI: " + codigoCti);
        System.out.println("Segmento: " + segmento);
        System.out.println("Nível numérico: " + nivel);
        System.out.println("Faixa de faturamento: " + faixaFaturamento);
        System.out.println("Consultor: " + consultorResponsavel.getNome());
    }
}
