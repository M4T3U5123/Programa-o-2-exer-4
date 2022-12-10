import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean chave = false;
        boolean individuo01 = false;
        boolean individuo02 = false;
        boolean falha = false;
        boolean desmaio = false;
    

        System.out.println("Escolha com quem vc quer jogar :");
        System.out.println("João:                Maria:");
        System.out.println("Energia = 150         Energia = 200");
        System.out.println("hp = 150       hp =200 ");

        while (individuo01 == false && individuo02 == false){
            System.out.println("Digite 'Joao' ou 'Maria'");
            String x = input.nextLine();
            if (x.equalsIgnoreCase("João")){
                individuo01 = true;
            }
            else if(x.equalsIgnoreCase("Maria")){
                individuo02 = true;
            }
            else{
                System.out.println("Opção inválida");
            }
        }

        pessoa Maria = new pessoa("Maria", 200, 200);
        pessoa Joao = new pessoa("Joao", 150, 150);

        while (falha == false){
            System.out.print("Vc está brincando no bosque até que encontram uma casa feita de doce, a tentação em comer aqueles doce faz vc vai em direção em direção a casa, ");
            System.out.print("ao chegar perto vc esculta uma risada e de detro da casa sai uma bruxa, ela diz olá criança que vc desejaria comer um pouco desses doces ?.  ");
            System.out.println("Você vai comer os doces?");
            while (chave == false){
                System.out.println("Digite 'Sim' ou 'Não'");
                String y = input.nextLine();
                if (y.equalsIgnoreCase("Sim")){
                    System.out.print("Vc aceita o convite da bruxa e vai em direção aos doces, começa a comer, após comer muito os doces ");
                    System.out.print("vc nota que a bruxa esta abrindo uma jaula e após isso ela vira em sua direção, vc tenta fugir porém sente que sua enrgia foi reduzida te impossibilitando de escapar.");
                    if(individuo02 == true){
                        Maria.cansaso(100);
                        System.out.println("Energia atual: " + Maria.energia);
                    }
                    else if (individuo01 == true){
                        Joao.cansaso(100);
                        System.out.println("Energia atual: " + Joao.energia);
                    }
                    chave = true;
                }
                else if (y.equalsIgnoreCase("Não")){
                    System.out.println("Vc recusa a oferta da bruxa e vai embora. Fim ");
                    chave = true;
                    break;
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
            chave = false;
            System.out.print("A bruxa te coloca dentro da gaiola e vai preparar o Forno pra te cozinhar ");
            System.out.print("Porém vc nota que o cadeado da gaiola esta muito enferrujado e velho sendo possivel de quebrar com facilidade ");
            System.out.println("Vc pode tentar quebralo porém gastara 50 de energia, oque vc vai fazer?  ");
            while (chave == false){
                System.out.println(" 'Quebrar ' ou 'Não fazer nada'");
                String z = input.nextLine();
                if (z.equalsIgnoreCase("Quebrar")){
                    System.out.println("Vc quebra o cadeado porém perde 50 pontos de energia.");
                    System.out.println("A bruxa não escuta nada e vc aproveita que ela esta destraida e a empurra no forno acabando com a bruxa. FIM!  ");
                    chave = true;
                    break;
                }
                if(individuo02== true){
                    Maria.cansaso(50);
                    System.out.println("Energia atual: " + Maria.energia);
                }
                else if (individuo01 == true){
                    Joao.cansaso(50);
                    System.out.println("Energia atual: " + Joao.energia);
                }
                if(Joao.energia == 0 || Maria.energia == 0){
                    System.out.print("Vc quebra o cadeado porém sua eneria acaba e vc desmaia a bruxa tepega e te joga no forno. Fim!  ");
                    desmaio = true;
                    break;
                }
                
                else if(z.equalsIgnoreCase("Não fazer nada")){
                    System.out.println("Como vc não fez nada a bruxa te pegou e te colocou no forno. FIM!"); 
                    chave = true;
                    break;
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
