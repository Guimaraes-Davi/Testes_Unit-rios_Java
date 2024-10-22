import java.util.ArrayList;
import java.util.List;

public class Teste {

    // Exercício 1: Verificação de Igualdade
    public int somar(int a, int b) {
        return a + b;
    }

    // Exercício 2: Verificação de Verdadeiro/Falso
    public boolean ehPar(int n) {
        return n % 2 == 0;
    }

    // Classe para o exercício 3
    public class Usuario {
        private int id;
        private String nome;

        public Usuario(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }
    }

    // Exercício 3: Verificação de Nulo
    public Usuario buscarUsuarioPorId(int id) {
        if (id == 1) {
            return new Usuario(1, "João");
        }
        return null;
    }

    // Exercício 4: Verificação de Listas
    public void adicionarItem(List<String> lista, String item) {
        lista.add(item);
    }

    // Exercício 5: Verificação de Exceções
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }

    // Exercício 6: Verificação de Identidade (Singleton)
    private static Teste instanciaUnica;

    public static Teste obterInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new Teste();
        }
        return instanciaUnica;
    }

    // Método principal para rodar os testes
    public static void main(String[] args) {
        Teste teste = new Teste();

        // Exercício 1: Testando somar
        if (teste.somar(2, 3) != 5) {
            throw new RuntimeException("Teste somar(2, 3) falhou");
        }
        if (teste.somar(0, 0) != 0) {
            throw new RuntimeException("Teste somar(0, 0) falhou");
        }

        // Exercício 2: Testando ehPar
        if (!teste.ehPar(4)) {
            throw new RuntimeException("Teste ehPar(4) falhou");
        }
        if (teste.ehPar(5)) {
            throw new RuntimeException("Teste ehPar(5) falhou");
        }

        // Exercício 3: Testando buscarUsuarioPorId
        if (teste.buscarUsuarioPorId(1) == null) {
            throw new RuntimeException("Teste buscarUsuarioPorId(1) falhou");
        }
        if (teste.buscarUsuarioPorId(2) != null) {
            throw new RuntimeException("Teste buscarUsuarioPorId(2) falhou");
        }

        // Exercício 4: Testando adicionarItem
        List<String> lista = new ArrayList<>();
        teste.adicionarItem(lista, "Item 1");
        if (!lista.contains("Item 1")) {
            throw new RuntimeException("Teste adicionarItem falhou");
        }

        // Exercício 5: Testando divisão
        try {
            teste.dividir(10, 0);
            throw new RuntimeException("Teste dividir(10, 0) falhou");
        } catch (IllegalArgumentException e) {
            // Exceção esperada
        }

        // Exercício 6: Testando Singleton
        Teste instancia1 = Teste.obterInstanciaUnica();
        Teste instancia2 = Teste.obterInstanciaUnica();
        if (instancia1 != instancia2) {
            throw new RuntimeException("Teste Singleton falhou");
        }

        // Se todos os testes passarem
        System.out.println("Todos os testes passaram!");
    }
}
