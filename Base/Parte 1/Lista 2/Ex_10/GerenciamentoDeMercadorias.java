public class GerenciamentoDeMercadorias {
		
		public static void main(String[] args){
				
				/*
				 * 
				 * Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa que declare
				 * variáveis para representar os seguintes dados: número do pedido, código do produto, quantidade e valor
				 * total da compra. Inicialize essas variáveis com valores apropriados. Por fim, exiba os valores armazenados.
				 * 
				 * */
				 
				 short numeroDoPedido = 120;
				 String codigoDoProduto = "9501101530003";
				 int quantidade = 10;
				 double valorTotalDaCompra = 300;
				 
				 System.out.printf("\n O numero do pedido solicitado e %d com codigo de produto %s.\n A quantidade de produtos e %d, resultando em R$ %.2f a serem pagos.", numeroDoPedido, codigoDoProduto, quantidade, valorTotalDaCompra);
				
		}
}
