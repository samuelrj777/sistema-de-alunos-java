import javax.swing.JOptionPane;
public class Main {
    public static void main (String[] args){
        int opcao = -1;
        int qnt = 0;
        String[] nome = null;
        int[] matr = null;
        double[] not1 = null;
        double[] not2 = null;
        double[] not3 = null;
        double[] media = null;
    while(opcao != 0){
        
     opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "===== SISTEMA DE ALUNOS =====\n" +
                "\n" +
                "digite:1 para Cadastrar aluno\n" +
                "digite:2 para Listar alunos\n" +
                "digite:3 para Mostrar médias\n" +
                "digite:0 para Sair"));
        switch(opcao) {
            case 1:
                qnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos você ira registrar"));
                nome = new String[qnt];
                matr = new int[qnt];
                not1 = new double[qnt];
                not2 = new double[qnt];
                not3 = new double[qnt];
                media = new double[qnt];
                for (int i = 0; i < qnt; i++) {
                        nome[i] = JOptionPane.showInputDialog(null, "Qual nome do aluno ");
                    matr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de mátricula do aluno "));
                    not1[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota do aluno "));
                    not2[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota do aluno "));
                    not3[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota do aluno "));
                }

                break;
            case 2:
                if (nome == null) {
                    JOptionPane.showMessageDialog(null,"Nenhum aluno regitrado ainda");
                }else {
                for (int i = 0; i < qnt; i++) {

                    JOptionPane.showMessageDialog(null, "\n" + nome[i] + "\nNumero de matricula: \n" + matr[i] + "\nMédia: \n" + media[i]);
                }
            }
                break;
            case 3:
                 if (media == null) {
                    JOptionPane.showMessageDialog(null,"Nenhum aluno regitrado ainda");
                }else {
                for (int i = 0; i < qnt; i++) {
                    media[i] = (not1[i] + not2[i] + (not3[i] * 2)) / 4;
                    JOptionPane.showMessageDialog(null, "Nome: \n" + nome[i] + "\nMédia: \n"+media[i]);
                    }
                }
                break;
            case 0:
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opção invalida");

             }
        }
    }
}
