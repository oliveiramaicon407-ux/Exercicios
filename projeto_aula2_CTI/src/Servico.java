/**
 * Modelo de domínio do Projeto CTI Insights.
 * Demonstra atributos private e métodos de negócio.
 */
public class Servico {

    private String codigo;
    private String nome;
    private String descricao;
    private boolean ativo;

    /**
     * Construtor: cria um serviço e começa com o status ativo.
     */
    public Servico(String codigo, String nome, String descricao) {
        setCodigo(codigo);
        setNome(nome);
        setDescricao(descricao);
        this.ativo = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter de boolean: usa isAtivo para fazer uma pergunta ao objeto.
    public boolean isAtivo() {
        return ativo;
    }

    // Não criamos setAtivo. O estado muda por ações do negócio.
    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void exibirResumo() {
        System.out.println("\n--- RESUMO DO SERVIÇO ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Ativo? " + ativo);
    }
}
