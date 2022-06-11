package siaap;

import java.util.Scanner;

public class siaap{

    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        String nome = "";
        String sexo = null;
        int idade = 0;
        
        double A = 0, B = 0, multiplicacao = 0, divisao = 0;
        double multiplicacao2 = 0;
        double multiplicacao3 = 0;
      
       
        String escolha = "";

        System.out.println("Olá,bem-vindo ao nosso sistema para o medição de IMC");
        System.out.println("Precisamos iniciamente fazer o seu cadastro");
        System.out.println("Digite seu nome");
        nome = aux.nextLine();
        System.out.println("Digite seu sexo");
        sexo = aux.nextLine();
        System.out.println("para finalizar e começarmos a calcular seu IMC precisaremos da sua idade");
        idade = aux.nextInt();
        System.out.println("Muito bem para calcularmos precisamos do seu peso como itém A, digite seu peso");
        A = aux.nextDouble();
        System.out.println("Agora falta somente sua altura como itém B, digite sua altura");
        B = aux.nextDouble();
        escolha = aux.nextLine();

        divisao = A / (B * B);
        multiplicacao = A * 1.7; 
        multiplicacao2 = A * 5;
        multiplicacao3 = A * 1;
      
        
        

        //saida de dados
        System.out.println("");
        System.out.println("Dados coletados");
        System.out.println("");
        System.out.println("nome: " + nome + "\nsexo: " + sexo + "\nidade: " + idade + "\nseu imc: " + divisao + "\nCom base no seu peso: "
                + "carboidratos " + multiplicacao2 + "\nProteína " + multiplicacao + "\nO valor de gordura diárias é de: " + multiplicacao3);

        if (divisao < 18.5) {
            System.out.println("Neste caso vc está abaixo do peso, mas já preparamos uma alimentação adequada para você, deseja participar? digite sua resposta (sim ou não)");
            escolha = aux.nextLine();
            if (escolha.equals("sim")) {
                System.out.println("então começaremos!");
                System.out.println("Dieta programada diariamente:");
                System.out.println("");
                System.out.println("No café da manhã sugerimos:");
                System.out.println("2 pães");
                System.out.println("2 Ovos");
                System.out.println("1 Iorgut Natural");
                System.out.println("1 Suco de laranja 200ml");
                System.out.println("");
                System.out.println("No almoço:");
                System.out.println("6x Colheres de arroz branco "); 
                System.out.println("2x colheres de sopa de feijão");   
                System.out.println("100g de peito de frango cozido");
                System.out.println("200g Saladas de folhas");
                System.out.println("Lembre-se de ir intercalando a carne vermelha com peixes em geral, e frango!");             
                System.out.println("Para bebidas a recomendação é sucos caseiros ricos em calorias podendo ser um soco de laranja que tem aproximadamente 180 calorias por 250ml");
                System.out.println("");
                System.out.println("refeição da tarde:");
                System.out.println("Iorgut natural 200ml"); 
                    System.out.println("2x Bananas");
                    System.out.println("Se caso você faça treinos diários, recomendamos 2x scoop maltodextria ou 1x scoop de Hipercaloricos");
                System.out.println("");
                System.out.println("Jantar:");
                System.out.println("6x Colheres de arroz branco");
                System.out.println("2x Carne refolgada");
                System.out.println("3x ovos cozidos");
                System.out.println("Salada de alface (tomate, cebola)");
                System.out.println("4x feijão");
                System.out.println("Com o auxilio de suplementação você tem uma evolução ainda maior, porém não é recomendado trocar a alimentação por suplementos");
              
            } else {
                if (escolha.equals("não")) {
                    System.out.println("Muito obrigado");
                }
            }
        } else {
            if (divisao == 25) {
                System.out.println("Parabéns você está no peso ideal, continue com sua alimentação e sus praticas físicas!");
            } else {
                if (divisao > 22) {
                    System.out.println("está acima do peso");
                }

            }
        }
    }
}


