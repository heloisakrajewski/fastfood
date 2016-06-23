package br.sc.catolica.fastfood;

import br.sc.catolica.fastfood.model.Consumidor;
import br.sc.catolica.fastfood.model.Item;
import br.sc.catolica.fastfood.model.Pagamento;
import br.sc.catolica.fastfood.model.Pedido;
import br.sc.catolica.fastfood.model.Produto;
import br.sc.catolica.fastfood.model.TipoPagamento;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Teste {

    
    public static void main(String[] args) {
       
        Consumidor consumidor = new Consumidor();
        consumidor = cadastrarConsumidor();
        
        System.out.println("--------- LISTA DE PRODUTOS ---------");
        List<Produto> listaProdutos = carregarListaProdutos();
        
        List<Item> listaItens = selecionarItensPedido(listaProdutos);
        
        Pagamento pagamento = criarPagamento(listaItens);
        criarPedido(listaItens, consumidor, pagamento);
        
        
    }
    
    public static Consumidor cadastrarConsumidor(){
    
        Scanner in = new Scanner(System.in);
        
        limpaTela();
                
        System.out.println("--------- DADOS DO CONSUMIDOR ---------");
        System.out.println("Nome..:  ");
        String nome = in.nextLine();
        
        System.out.println("CPF...:  ");
        String cpf = in.nextLine();
        
        Consumidor consumidor = new Consumidor(1, nome, cpf);
        
        return consumidor;
    }
    
     public static Pedido cadastrarPedido(){
    
        Scanner in = new Scanner(System.in);
        
        limpaTela();
                
        System.out.println("--------- DADOS DO PEDIDO ---------");
        System.out.println("Nome..:  ");
        String nome = in.nextLine();
        
        System.out.println("CPF...:  ");
        String cpf = in.nextLine();
        
        Pedido pedido = new Pedido();
        
        return pedido;
    }
    
    
    
    public static void limpaTela(){
        for (int i = 0; i < 100; ++i)  
            System.out.println();
    }
    
    public static List<Produto> carregarListaProdutos(){
        
        Produto produto;
        List<Produto> listaProdutos = new ArrayList();
        
        Random gerador = new Random(); 
        
        for (int i = 1; i < 20; i++){
            
            int valor = gerador.nextInt(30);
            double valorUnitario = (double) valor;
            String descricaoProduto = "Produto " + i;
            produto = new Produto(i, "Produto " + i, valorUnitario);
            
            listaProdutos.add(produto);
            
            System.out.println(i + " - " + descricaoProduto + " - R$" + valorUnitario);

        }
        return listaProdutos; 
        
    }
    
    
    public static List<Item> selecionarItensPedido(List<Produto> listaProdutos){
        
        Scanner in = new Scanner(System.in);
        
        Item item;
        List<Item> listaItens = new ArrayList();
        Produto produto;
        
        boolean flagSair = false;
        int i=0;
        System.out.println("Digite 0 para sair.");
        while (flagSair == false){
            System.out.println("Digite o código do produto: ");
            long idProduto = in.nextLong();
            
            if (idProduto == 0) {
                System.out.println("Criando pedido");
                flagSair = true;
                
            } else if (idProduto > 19) {
                System.out.println("Produto inválido!");
            } else {
                produto = listaProdutos.get((int) idProduto); 
                System.out.println("Digite a quantidade que deseja: ");
                int quantidade = in.nextInt();
                double valor = produto.getValorUnitario();

                item = new Item(i++, quantidade, valor, produto);
                listaItens.add(item);
            }
        }
        
        return listaItens; 
    }
    
    public static Pedido criarPedido(List<Item> items, Consumidor consumidor, Pagamento pagamento) {
        
        Scanner in = new Scanner(System.in);
        Pedido pedido;
        System.out.println("Deseja embalagem? ");
        String tp = in.nextLine();
        boolean embalagem = true;
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date dataHoraGeracao = new Date();
        Date dataHoraEntrega = new Date();
        pedido = new Pedido(0, dataHoraGeracao, dataHoraGeracao, embalagem, pagamento, consumidor, items);
        System.out.println("Pedido realizado com sucesso. Valor total: " + pagamento.getValorPagamento());
        return pedido;
        
    }
    
    public static Pagamento criarPagamento(List<Item> items) {
        Pagamento pagamento;
        Pedido pedido = new Pedido();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Número do cartão: ");
        int numeroCartao = in.nextInt();
        
        TipoPagamento tpPag = TipoPagamento.DÉBITO;
        
        double valorTotal = pedido.calcularPedido(items);
        System.out.println(valorTotal);
        pagamento = new Pagamento(0, tpPag, valorTotal, numeroCartao, true);
        
        System.out.println("Pagamento aprovado");
        return pagamento;
    }
    
    
    
}

