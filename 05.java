import  java.util.Scanner ;
// Receber e analisar resultados e informar se um bônus deve ser pago
public  class  Analise {
	public  static  void  main ( String [] args ) {
		// Inicializar variáveis ​​(contagem)
		// inicializar aprovações com 0
		int aprovacoes =  0 ;
		// inicializar reprovações com 0
		int reprovações =  0 ;
		// inicializa o scanner para entrada de dados
		Scanner entrada =  novo  Scanner ( System . In);

		int resultado;
		int i =  0 ;
		// Receber dados de 10 testes e contar os primeiros e reprovados
		// enquanto o contador for menor que 10
		faça {
			//    pede o resultado de um teste para o usuário
			Sistema . para fora . printf ( " Insira resultado% d (1 ou 2, -1 para terminar): " , i + 1 );
			//    leia o resultado o teste
			resultado = entrada . nextInt ();
			//    se o resultado para aprovado incremente o contador de iniciado
			if (resultado ==  1 ) {aprovacoes ++ ; }
			//    senao incremente o contador de reprovados
			else  if (resultado ==  2 ) {reprovações ++ ; }
			i ++ ;
		} enquanto (resultado ! =  - 1 );
		// Exibir os resultados e decidir se há ou não bônus.
		// imprimir o número de apontado
		Sistema . para fora . println ( " Aprovados: "  + aprovações);
		// imprimir o número de reprovados
		Sistema . para fora . println ( " Reprovados: "  + reprovações);
		// se iniciou> 8 imprimir "bônus ao instrutor"
		if (aprovações >  8 ) {
			Sistema . para fora . println ( " Bônus ao instrutor " );
		}
	}
}
