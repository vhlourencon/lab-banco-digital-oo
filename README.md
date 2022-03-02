# lab-banco-digital-oo
Lab do desafio da criação do banco digital da DIO 


-Adicionado o Lombok ao Projeto nas Classes Cliente e Banco 

Novas Funcionalidades: 

** Classe Conta **
- Cria os atritutos temChequeEspecial , e limiteChequeEspecial para as contas correntes. 
- Função Sacar: Retornar uma Exceção , se o cliente tentar realizar um saque maior que o saldo em conta poupança.
                Retorna uma exeçao, se o cliente tentar realizar um saque maior que o limite do cheque especial em conta corrente. 
                Verificar se o valor da operação é positivo. 


- Função depositar: Verifica se o valor da operação é positivo 

** Classe Banco ** 
-Funcao criar conta corrente , e criar conta poupanca e adicionando na lista de contas.  
-Função Imprimir Lista De contas: imprime todas as contas cadastradas no banco. 