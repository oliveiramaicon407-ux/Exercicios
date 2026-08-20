public class Main {

    public static void main(String[] args) {
        System.out.println("=== CTI INSIGHTS - EXERCÍCIO DA AULA 2 ===");

        // ETAPA 1: criar um objeto da classe Consultor.
        // O objeto representa a pessoa responsável pelo atendimento.
        Consultor consultor = new Consultor(
                "CON-0089",
                "Rafael Barbosa Santos",
                3);

        // ETAPA 2: criar um objeto da classe Servico.
        // O serviço começa ativo porque essa é a regra do construtor.
        Servico servico = new Servico(
                "SER-002",
                "Diagnóstico de Processos",
                "Análise inicial dos processos da empresa.");

        // ETAPA 3: criar um objeto da classe Cliente.
        // O último argumento é o objeto consultor criado na etapa 1.
        // Assim, o cliente fica ligado ao consultor responsável.
        Cliente cliente = new Cliente(
                "CTI-002",
                "Comercio",
                1,
                "Entre R$ 1 e R$ 10 milhões",
                consultor);

        // ETAPA 4: usar getters para consultar informações.
        // Não acessamos cliente.nivel diretamente porque o atributo é private.
        System.out.println("\n--- OBJETOS CRIADOS ---");
        System.out.println("Código do cliente: " + cliente.getCodigoCti());
        System.out.println("Nome do consultor: " + consultor.getNome());
        System.out.println("Nome do serviço: " + servico.getNome());

        // ETAPA 5: testar um valor inválido no setter do Cliente.
        // O nível só pode ser 1, 2 ou 3.
        System.out.println("\n--- TESTE DE NÍVEL INVÁLIDO ---");
        cliente.setNivel(4);
        System.out.println("Nível mantido: " + cliente.getNivel());

        // ETAPA 6: testar um valor válido no setter do Cliente.
        System.out.println("\n--- TESTE DE NÍVEL VÁLIDO ---");
        cliente.setNivel(2);
        System.out.println("Novo nível: " + cliente.getNivel());

        // ETAPA 7: testar a regra do setter do Consultor.
        // Anos de experiência não podem ser negativos.
        System.out.println("\n--- TESTE DE EXPERIÊNCIA INVÁLIDA ---");
        consultor.setAnosExperiencia(-2);
        System.out.println("Experiência mantida: "
                + consultor.getAnosExperiencia() + " anos");

        // ETAPA 8: testar os métodos de negócio da classe Servico.
        // Não usamos setAtivo(). Usamos ações com nomes claros.
        System.out.println("\n--- TESTE DO SERVIÇO ---");
        System.out.println("Serviço ativo no início? " + servico.isAtivo());

        servico.desativar();
        System.out.println("Depois de desativar: " + servico.isAtivo());

        servico.ativar();
        System.out.println("Depois de ativar: " + servico.isAtivo());

        // ETAPA 9: criar um relatório com getters.
        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Código CTI: " + cliente.getCodigoCti());
        System.out.println("Segmento: " + cliente.getSegmento());
        System.out.println("Nível: " + cliente.getNivel());
        System.out.println("Faixa de faturamento: "
                + cliente.getFaixaFaturamento());
        System.out.println("Consultor responsável: "
                + cliente.getConsultorResponsavel().getNome());
        System.out.println("Serviço escolhido: " + servico.getNome());
        System.out.println("Serviço ativo? " + servico.isAtivo());

        System.out.println("\nExercício concluído!");
    }
}
