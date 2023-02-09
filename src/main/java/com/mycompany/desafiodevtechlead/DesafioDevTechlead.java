package com.mycompany.desafiodevtechlead;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioDevTechlead {
    
    static Scanner input = new Scanner(System.in);
    
    static ArrayList<Cliente> clientes;
    static ArrayList<Livro> livros;
    
    public static void main(String[] args) {
        
        clientes = new ArrayList<Cliente>();       
        livros = new ArrayList<Livro>();
        
        Cliente cliente1 = new Cliente("hugo", 2, 5378756, 123456);
        Cliente cliente2 = new Cliente("adm", 23, 5378755, 123456);
        Livro livro1 = new Livro("aaa", 2023, "eee", 5378756);
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        livros.add(livro1);
        
        menu();
        
    }
    
    public static void menu() {

        System.out.println(" ");
        System.out.println("Seja bem-vindo ao sistema da Biblioteca TECHLEAD");
        System.out.println(" ");
        System.out.println("Por favor selecione a operação desejada");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Logar");
        System.out.println("3 - Esqueci minha senha");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                logar();
                break;

            case 3:
                /////

            default:
                System.out.println("Operação inválida!");
                menu();
                break;
        }
    }
    
    public static void criarConta(){
        
        System.out.println("Favor insira o seu nome: ");
        String nome = input.next();

        System.out.println("Favor insira seu RG: ");
        int id = input.nextInt();

        System.out.println("Favor insira uma senha: ");
        int senha = input.nextInt();
        
        int tipoConta = 2; //id que identifica o tipo de conta cliente 

        Cliente cliente = new Cliente(nome, tipoConta, id, senha);
                
        clientes.add(cliente);

        System.out.println("Cadastro criado com sucesso!");

        menu();        
    
    }
    
    public static void logar() {
    
        System.out.println("Digite o número do RG: ");
        int idLogin = input.nextInt();
        Cliente cliente = encontrarId(idLogin);
        
        if(cliente != null) {
            System.out.println("Digite a senha: ");
            int senha = input.nextInt();
            
            if (senha == cliente.getSenha()){
                System.out.println("Logado com sucesso!");
                
                int idClientePerfil = cliente.getTipoConta();
                
                menuLogado(idClientePerfil);
                
            }else{
                System.out.println("Credenciais incorretas!");
                menu();
            }
        
    
        }
        
    }
    
    public static void menuLogado(int idClientePerfil) {

        if (idClientePerfil == 2) {
        
        System.out.println(" ");
        System.out.println("Seja bem-vindo, leitor!");
        System.out.println(" ");
        System.out.println("Por favor selecione a operação desejada");
        System.out.println("1 - Listar livros");
        System.out.println("2 - Cadastrar livros");
        System.out.println("3 - Editar livros");
        System.out.println("4 - Excluir livros");
        System.out.println("5 - Sair");
        

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                listarLivros(idClientePerfil);
                break;
            
            case 2:
                cadastrarLivros(idClientePerfil);
                break;

            case 3:
                editarLivros(idClientePerfil);
                break;
                
            case 4:
                excluirLivros(idClientePerfil);
                break;
                
            case 5:
                System.out.println("Volte sempre!");
                System.exit(0);    

            default:
                System.out.println("Operação inválida!");
                menuLogado(idClientePerfil);
                break;
        }
            
        }if (idClientePerfil == 23) {
            
        System.out.println(" ");
        System.out.println("Seja bem-vindo, leitor!");
        System.out.println(" ");
        System.out.println("Por favor selecione a operação desejada");
        System.out.println("1 - Listar livros");
        System.out.println("2 - Cadastrar livros");
        System.out.println("3 - Editar livros");
        System.out.println("4 - Excluir livros");
        System.out.println("5 - Detalhar livros");
        System.out.println("5 - Sair");
        

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                listarLivros(idClientePerfil);
                break;
            
            case 2:
                cadastrarLivros(idClientePerfil);
                break;

            case 3:
                editarLivros(idClientePerfil);
                break;
                
            case 4:
                excluirLivros(idClientePerfil);
                break;
                
            case 5:
                System.out.println("Volte sempre!");
                System.exit(0);    

            default:
                System.out.println("Operação inválida!");
                menuLogado(idClientePerfil);
                break;
        }
        }
          
    }
    
    private static Cliente encontrarId (int id) {
        Cliente cliente = null;
        if(clientes.size() > 0) {
            for(Cliente clientee : clientes) {
                if(clientee.getId() == id) {
                    cliente = clientee;
                }
            }
        }
        return cliente;
    }
    
    public static void listarLivros(int idClientePerfil) {
        if(livros.size() > 0) {
            for(Livro livro: livros) {
                System.out.println(livro);
            }
        }else {
            System.out.println("Não há livros cadastrados");
        }

        menuLogado(idClientePerfil);
    }
    
    public static void cadastrarLivros(int idClientePerfil){
        
        System.out.println("Favor insira o nome do livro: ");
        String nome = input.next();

        System.out.println("Favor insira o ano do livro: ");
        int ano = input.nextInt();

        System.out.println("Favor insira a editora que publicou o livro: ");
        String editora = input.next();
        
        System.out.println("Favor insira o seu RG para confirmar o cadastro: ");
        int codigoCadastro = input.nextInt();

        Livro livro = new Livro(nome, ano, editora, codigoCadastro);
                
        livros.add(livro);

        System.out.println("Livro cadastrado com sucesso!");

        menuLogado(idClientePerfil);     
      
    }
    
    public static void editarLivros(int idClientePerfil){
        
        if (idClientePerfil == 2){
        
        System.out.println("Favor insira o nome do livro: ");
        String nome = input.next();
        
        System.out.println("Favor insira o ano de publicação do livro: ");
        int ano = input.nextInt();
        
        System.out.println("Favor insira o seu RG para prosseguir: ");
        int codigoCadastro = input.nextInt();
        
        if(livros.size() > 0) {
            for(Livro livroo : livros) {
                if(livroo.getNome().equals(nome) && livroo.getAno() == ano && livroo.getCodigoCadastro() == codigoCadastro ) {
                    System.out.println("Por favor selecione a operação desejada");
                    System.out.println("1 - Editar nome");
                    System.out.println("2 - Editar ano de publicação");
                    System.out.println("3 - Editar editora");
                    System.out.println("4 - Voltar ao menu principal");
                    
                    int operacao = input.nextInt();

                    switch (operacao) {
                    case 1:
                        System.out.println("Favor insira o nome do livro: ");
                        String nomeEditado = input.next();
                        livroo.setNome(nomeEditado);
                        System.out.println("Editado com sucesso!");
                        menuLogado(idClientePerfil);
                        break;

                    case 2:
                        System.out.println("Favor insira o ano do livro: ");
                        int anoEditado = input.nextInt();
                        livroo.setAno(anoEditado);
                        System.out.println("Editado com sucesso!");
                        menuLogado(idClientePerfil);
                        break;

                    case 3:
                        System.out.println("Favor insira a editora do livro: ");
                        String editoraEditada = input.next();
                        livroo.setEditora(editoraEditada);
                        System.out.println("Editado com sucesso!");
                        menuLogado(idClientePerfil);
                        break;
                        
                    case 4:
                        menuLogado(idClientePerfil);
            
                    default:
                        System.out.println("Operação inválida!");
                        menuLogado(idClientePerfil);
                        break;

                      
                }
                    
                }else {
                    System.out.println("Perfil sem permissao para editar este livro");
                    menuLogado(idClientePerfil);
                }
            }
        }
                
        }
        
        if (idClientePerfil == 23){
        
        System.out.println("Favor insira o nome do livro: ");
        String nome = input.next();
        
        System.out.println("Favor insira o ano de publicação do livro: ");
        int ano = input.nextInt();
        
        if(livros.size() > 0) {
            for(Livro livroo : livros) {
                if(livroo.getNome().equals(nome) && livroo.getAno() == ano) {
                    System.out.println("Por favor selecione a operação desejada");
                    System.out.println("1 - Editar nome");
                    System.out.println("2 - Editar ano de publicação");
                    System.out.println("3 - Editar editora");
                    System.out.println("4 - Voltar ao menu principal");
                    
                    int operacao = input.nextInt();

                    switch (operacao) {
                    case 1:
                        System.out.println("Favor insira o nome do livro: ");
                        String nomeEditado = input.next();
                        livroo.setNome(nomeEditado);
                        System.out.println("Editado com sucesso!");
                        menuLogado(idClientePerfil);
                        break;

                    case 2:
                        System.out.println("Favor insira o ano do livro: ");
                        int anoEditado = input.nextInt();
                        livroo.setAno(anoEditado);
                        System.out.println("Editado com sucesso!");
                        menuLogado(idClientePerfil);
                        break;

                    case 3:
                        System.out.println("Favor insira a editora do livro: ");
                        String editoraEditada = input.next();
                        livroo.setEditora(editoraEditada);
                        System.out.println("Editado com sucesso!");
                        menuLogado(idClientePerfil);
                        break;
                        
                    case 4:
                        menuLogado(idClientePerfil);
            
                    default:
                        System.out.println("Operação inválida!");
                        menuLogado(idClientePerfil);
                        break;

                      
                }
                    
                }
                
            }
            
        }
            
        }
        
        
        
        
    }
    
    public static void excluirLivros(int idClientePerfil){
        
        System.out.println("Favor insira o nome do livro: ");
        String nome = input.next();
        
        System.out.println("Favor insira o ano de lançamento do livro: ");
        int ano = input.nextInt();
        
        System.out.println("Favor insira o seu RG para prosseguir: ");
        int codigoCadastro = input.nextInt();
        
        if(livros.size() > 0) {
            for(Livro livroo : livros) {
                if(livroo.getNome().equals(nome) && livroo.getAno() == ano && livroo.getCodigoCadastro() == codigoCadastro ) {
                
                    //Livro livro = new Livro(nome, ano, editora, codigoCadastro);
                
                    livros.remove(livroo);
                    
                    System.out.println("Livro excluído com sucesso!");
                    menuLogado(idClientePerfil);
                    
                }else {
                    System.out.println("Perfil sem permissao para excluir este livro");
                    menuLogado(idClientePerfil);
                }
            }
        }
        
        
        
    }
    
    
}
