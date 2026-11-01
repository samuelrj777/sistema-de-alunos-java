import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===JOGO DO BICHO===\n responda 1 para sim e 0 para não");
        System.out.println("O seu animal é Mamífero?");
        int resposta = sc.nextInt();
        if(resposta == 1){
            System.out.println("O seu animal é quadrupede?");
            resposta =sc.nextInt();
            if(resposta == 1){
        System.out.println("O seu animal é carnivoro?");
                resposta =sc.nextInt();
                if(resposta == 1){
                    System.out.println("O seu animal é um leão!!");
                }else{
                System.out.println("O seu animal é herbivoro?");
             resposta =sc.nextInt();
            if(resposta == 1){
                System.out.println("O seu animal é um cavalo!!");
                
            }else{
                System.out.println("animal não encontrado");
            }
            }
            }else{
            System.out.println("O seu animal é bípede?");
             resposta =sc.nextInt();
            if(resposta == 1){
                System.out.println("O seu animal é frutifero?");
                resposta =sc.nextInt();
                if(resposta == 1){
                    System.out.println("O seu animal é um macaco!!");
                }else{
                    System.out.println("O seu animal é um humano!!");
            }
        }
    }
    }else{
        System.out.println("O seu animal é uma ave?");
        resposta =sc.nextInt();
        if(resposta == 1){
            System.out.println("É uma ave voadora?");
            resposta =sc.nextInt();
            if(resposta == 1){
                System.out.println("O seu animal é uma águia!!");
            }else{
                System.out.println("É uma ave tropical?");
                resposta =sc.nextInt();
                if(resposta == 1){
                    System.out.println("O seu animal é um avestruz!!");
                }else if(resposta == 0){
                    System.out.println("É uma ave polar?");
                    resposta =sc.nextInt();
                    if(resposta == 1){
                        System.out.println("O seu animal é um pinguim!!");
                    }else{
                    System.out.println("É uma ave nadadora?");
                    resposta =sc.nextInt();
                    if(resposta == 1){
                        System.out.println("O seu animal é um pato!!");
                    }else{
                        System.out.println("animal não encontrado");
                    }
                }
            }else{
                System.out.println("animal não encontrado");
            }     
        }
        }else{
    System.out.println("O seu animal é um réptil?");
    resposta = sc.nextInt();
    if(resposta == 1){
        System.out.println("O seu animal possui casco?");
        resposta = sc.nextInt();
        if(resposta == 1){
            System.out.println("O seu animal é uma tartaruga!!");
       }else{
        System.out.println("O seu animal não possi patas?");
        resposta = sc.nextInt();
        if(resposta == 1){
            System.out.println("O seu animal é uma cobra!!");
        }else{
            System.out.println("O seu animal é carnivoro?");
            resposta = sc.nextInt();
            if(resposta == 1){
                System.out.println("O seu animal é um crocodilo!!");
            }else{
                System.out.println("Animal não encontrado");
            sc.close();         
            }
                    }
                }
             }
        }
     }  
    
    }
 }