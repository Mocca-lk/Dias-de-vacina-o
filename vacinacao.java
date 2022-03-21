
import javax.swing.JOptionPane;


 
public class vacinacao {

    
    public static void main(String[] args) {
       String nome;
       int idade;
       //declaração de variáveis
       
       nome = JOptionPane.showInputDialog("Digite seu nome");
       idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
       /*Solicitando informação do usuário...Nome e Idade
       ao mesmo tempo que transforma a variável idade em inteiro
       */
       switch (idade){
           case 60:
           case 61:
           case 62:
           case 63:
           case 64:
               JOptionPane.showMessageDialog(null, "Olá "+nome+ ", seu dia de vacinação é na sexta-feira");
               break;
    //Idades entre 60-64, a pessoa será direcionada para sexta-feira, caso não...
               
          
           case 65:
           case 66:
           case 67:
           case 68:
           case 69:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é na quinta-feira");
               break;
    //Caso a pessoa tenha entre 65-69 anos ela será direcionada para quinta-feira, se não...
               
           case 70:
           case 71:
           case 72:
           case 73:
           case 74:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é na quarta-feira");
               break;
    // Caso a pessoa tenha entre 70-74 anos, ela será direcionada para quarta-feira, se não...
           case 75:
           case 76:
           case 77:
           case 78:
           case 79:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é na terça-feira");
               break;
    // Caso a pessoa tenha entre 75-79 anos, ela será direcionada para terça-feira, se não...
           case 80:
           case 81:
           case 82:
           case 83:
           case 84:
           case 85:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é na segunda-feira");
               break;
    /* Caso a pessoa tenha entre 80-85 anos, ela será direcionada para segunda-feira,
               Todos os que não se encaixam nas opções, serão direcionados pra uma outra mensagem
               */
               
           default: JOptionPane.showMessageDialog(null, "Lamentamos "+nome+", mas você está fora do período de vacinação");
           break;
               
                       
       }
               
    }
    
}
