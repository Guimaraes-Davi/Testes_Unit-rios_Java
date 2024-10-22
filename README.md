Teste 1: Verificação de Igualdade
Teste: Verifica se o método somar(int a, int b) retorna a soma correta dos dois números fornecidos.
Objetivo: Garantir que a soma de dois inteiros seja correta usando assertEquals.

Teste 2: Verificação de Verdadeiro/Falso
Teste: Verifica se o método ehPar(int n) retorna true para números pares e false para números ímpares.
Objetivo: Garantir a lógica correta de verificação de paridade usando assertTrue e assertFalse.

Teste 3: Verificação de Nulo
Teste: Verifica se o método buscarUsuarioPorId(int id) retorna um objeto Usuario quando o ID é encontrado e null quando o ID não existe.
Objetivo: Assegurar que o método retorna o objeto correto ou null quando necessário, usando assertNull e assertNotNull.

Teste 4: Verificação de Listas
Teste: Verifica se o método adicionarItem(List<String> lista, String item) realmente adiciona o item à lista.
Objetivo: Certificar-se de que o item foi adicionado à lista usando assertTrue para verificar a presença do item.

Teste 5: Verificação de Exceções
Teste: Verifica se o método dividir(double a, double b) lança uma exceção IllegalArgumentException quando o divisor é zero.
Objetivo: Garantir que o método lida corretamente com divisões inválidas, usando assertThrows para capturar a exceção esperada.

Teste 6: Verificação de Identidade
Teste: Verifica se o método obterInstanciaUnica() retorna sempre a mesma instância (padrão Singleton).
Objetivo: Certificar-se de que duas chamadas ao método retornam o mesmo objeto, usando assertSame.
