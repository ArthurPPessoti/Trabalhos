import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;

public class desafios {
    public static void main(String[] args) {
        // Create a Map and add some sample items
        Map<String, String> items = new HashMap<>();
        items.put("Olá, Mundo", "Crie um programa que imprime 'Olá, Mundo' na tela.");
        
        items.put("Soma Simples", "Peça dois números ao usuário e exiba a soma deles.");
        
        items.put("Par ou Ímpar", "Peça um número ao usuário e diga se ele é par ou ímpar.");
        
        items.put("Contador", "Imprima os números de 1 a 10 utilizando um laço de repetição.");
        
        items.put("Boas-vindas", "Peça o nome do usuário e exiba uma mensagem de boas-vindas.");        
        
        items.put("Tabuada", "Peça um número e imprima a tabuada dele de 1 a 10.");
        
        items.put("Idade no futuro", "Peça a idade do usuário e diga quantos anos ele terá em 10 anos.");
        
        items.put("Área do Retângulo", "Peça base e altura e calcule a área de um retângulo.");
        
        items.put("Maior número", "Peça dois números e diga qual é o maior.");
        
        items.put("Conversor de Temperatura", "Peça uma temperatura em Celsius e converta para Fahrenheit.");
        
        items.put("Calculadora Simples", "Crie uma calculadora que realiza as operações básicas (+, -, *, /) com dois números, usando `if` ou `switch`.");
        
        items.put("Verificador de Palíndromo", "Peça uma palavra ao usuário e diga se ela é um palíndromo (lê igual de trás pra frente).");
        
        items.put("Contador de Vogais", "Peça uma frase e conte quantas vogais existem nela.");
        
        items.put("Jogo de Adivinhação", "Gere um número aleatório entre 1 e 100 e faça o usuário tentar adivinhar. Dê dicas (maior/menor) até acertar.");
        
        items.put("Inversor de String", "Peça uma palavra e exiba ela invertida (ex: 'casa' -> 'asac').");
        
        items.put("Média de Notas", "Peça várias notas (usar array ou lista) e exiba a média final. Diga se o aluno foi aprovado (>= 6).");
        
        items.put("Contador de Palavras", "Peça uma frase e diga quantas palavras ela tem.");
        
        items.put("Número Primo", "Peça um número e diga se ele é primo.");
        
        items.put("Fibonacci até N", "Peça um número N e exiba a sequência de Fibonacci até esse número.");
        
        items.put("Agenda Simples", "Permita cadastrar e listar nomes e telefones (usar `ArrayList` ou estrutura parecida).");
        
        items.put("Gerador de Senhas", "Crie um programa que gera senhas aleatórias com letras, números e símbolos. O usuário escolhe o tamanho.");
        
        items.put("Leitor de Arquivo .txt", "Crie um programa que leia um arquivo `.txt` e conte quantas linhas, palavras e caracteres ele tem.");
        
        items.put("Conversor de Moedas", "Permita converter valores entre reais, dólares e euros com base em taxas definidas no código.");
        
        items.put("Cadastro de Usuários com Busca", "Crie um sistema que permita cadastrar usuários (nome, email, telefone) e pesquisar por nome.");
        
        items.put("Simulador de Empréstimo", "Peça valor, juros e número de parcelas. Mostre o valor total e o valor de cada parcela.");
        
        items.put("Sistema de Login Simples", "Peça um usuário e senha. Valide os dados com base em um mapa (`HashMap`) previamente preenchido.");
        
        items.put("Validador de CPF", "Crie um validador de CPF (pode usar uma lógica simplificada para treinar manipulação de strings e números).");
        
        items.put("Calculadora de IMC", "Peça altura e peso do usuário e informe o IMC e a classificação (baixo peso, normal, sobrepeso, etc).");
        
        items.put("Ordenador de Lista", "Peça ao usuário uma lista de números e ordene-a do menor para o maior (sem usar sort nativo).");
        
        items.put("Sistema de Tarefas", "Implemente um sistema de tarefas (to-do list) onde o usuário pode adicionar, remover e listar tarefas.");
        
        items.put("Gerenciador de Produtos com POO", "Implemente um sistema com classes Produto, Estoque e Gerenciador. Permita adicionar, editar e listar produtos.");
        
        items.put("API de Clima (com HTTP request)", "Consuma uma API pública de previsão do tempo (ex: OpenWeatherMap) e exiba o clima atual de uma cidade digitada pelo usuário.");
        
        items.put("Sistema Bancário Simples", "Crie um sistema com classes Conta e Cliente. Implemente saques, depósitos e transferências entre contas.");
        
        items.put("Agenda com Arquivo JSON", "Implemente uma agenda de contatos que salva e carrega os dados de um arquivo `.json`.");
        
        items.put("Controle de Biblioteca", "Crie classes para Livro, Usuário e Biblioteca. Permita cadastrar livros, emprestar e devolver.");
        
        items.put("Conversor de Moeda com API", "Use uma API para obter a cotação atual de moedas e permita conversões em tempo real.");
        
        items.put("Validador de E-mail e Senha com Regex", "Valide e-mails e senhas com expressões regulares. A senha deve conter letras, números e símbolos.");
        
        items.put("Sistema de Reservas", "Implemente um sistema de reservas de hotel ou restaurante, com datas, horários e clientes.");
        
        items.put("Simulador de Investimentos", "Permita simular investimentos com juros compostos, aportes mensais e tempo. Exiba gráficos ou relatórios simples.");
        
        items.put("Mini Jogo RPG com POO", "Crie um mini sistema de RPG com herói, inimigos e combate por turnos. Use classes e herança.");
        
        items.put("API RESTful com autenticação JWT", "Crie uma API completa com endpoints para cadastro, login (com geração de token JWT), CRUD de recursos e controle de acesso por usuário.");
        
        items.put("Sistema de Gestão Financeira", "Implemente um sistema completo de controle de gastos e receitas, com categorias, filtros por período, gráficos e exportação para CSV ou PDF.");
        
        items.put("Chat em Tempo Real com WebSocket", "Crie uma aplicação de chat que usa WebSockets para comunicação em tempo real entre múltiplos usuários.");
        
        items.put("Clonador de Sites com Análise de Conteúdo", "Crie um scraper que acessa páginas da web, extrai e analisa conteúdo textual, imagens e links, gerando um relatório automático.");
        
        items.put("Jogo Multiplayer Online (simples)", "Implemente um jogo multiplayer simples (como pedra-papel-tesoura ou batalha de turnos) com comunicação via rede ou servidor.");
        
        items.put("Framework Web Simples", "Implemente um mini framework web do zero que permita criar rotas e servir páginas HTML, apenas com sockets ou bibliotecas básicas.");
        
        items.put("Sistema de Agendamento com Calendário Integrado", "Crie um sistema onde usuários possam marcar compromissos, visualizar um calendário e receber notificações (por email ou interface).");
        
        items.put("Analisador de Código com Métricas", "Crie uma ferramenta que recebe códigos fonte e exibe métricas como número de linhas, classes, funções e complexidade.");
        
        items.put("E-commerce Simples com Carrinho e Pagamento Fictício", "Implemente um e-commerce com listagem de produtos, carrinho de compras, simulação de pagamento e painel de administração.");
        
        items.put("Deploy Automatizado com CI/CD", "Crie um projeto com pipeline automatizado (CI/CD), que faz build, testes e deploy para um servidor ao fazer push em repositório.");

        items.put("Integração com E-mail", "Crie um script que conecte à sua conta de e-mail (IMAP), busque mensagens de um remetente específico, e salve o conteúdo desses e-mails como arquivos .pdf em uma pasta local.");

        items.put("Novo sistema de sorteio", "Crie uma cópia (ou melhoria) do sistema de sorteio que permita ao usuário escolher entre diferentes categorias de desafios (ex: Python, Java, etc.) e sorteie um desafio aleatório dentro da categoria escolhida.");

        items.put("Jogo da Velha", "Implemente o jogo da velha (tic-tac-toe) em um console, permitindo que dois jogadores joguem um contra o outro.");

        items.put("Cadastro de Usuarios", "Crie um sistema de cadastro de usuários com nome, email e senha. Utilize um banco de dados simples (pode ser SQLite ou Excel) para armazenar os dados.");

        items.put("Método de Gauss", "Implemente um programa que receba uma matriz aumentada de um sistema linear e resolva esse sistema utilizando o método de eliminação de Gauss. O sistema sempre terá solução única.");
        
        items.put("Método de Gauss-Jordan", "Crie um programa que aplique o método de Gauss-Jordan em uma matriz aumentada de um sistema linear para transformá-la em sua forma escalonada reduzida e exibir a solução do sistema.");

        items.put("Mínimos Quadrados", "Escreva um programa que receba uma sequência de pontos (x, y) e calcule a equação da reta dos mínimos quadrados que melhor se ajusta aos dados, no formato y = ax + b.");

        // Convert keys to ArrayList for random selection
        ArrayList<String> keyList = new ArrayList<>(items.keySet());
        
        // Create Random object
        Random random = new Random();
        
        // Get random key
        String randomKey = keyList.get(random.nextInt(keyList.size()));
        
        // Get the value for the random key
        String randomValue = items.get(randomKey);
        
        // Print the result
        System.out.println("Desafio: " + randomKey);
        System.out.println("Descrição: " + randomValue);
        // System.out.println(items.size());
    }
}