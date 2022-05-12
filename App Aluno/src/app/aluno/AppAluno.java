
package app.aluno;

import javax.swing.JOptionPane;

public class AppAluno {

    public static void main(String[] args) {
        
         String nome=JOptionPane.showInputDialog(null,"Informe seu nome:","AppAluno",3);
         
         String ra=JOptionPane.showInputDialog(null,"Informe seu ra:","AppAluno",3);
         
         float parcial1=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua nota do instrumento parcial 1 (decimais depois de ponto):","AppAluno",3));
         
         float parcial2=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua nota do instrumento parcial 2 (decimais depois de ponto):","AppAluno",3));
         
         float principal=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua nota do instrumento principal (decimais depois de ponto):","AppAluno",3));
         
         DadosAlunos objAluno = new DadosAlunos();
        
         objAluno.setRa(ra);
         objAluno.setNome(nome);
         objAluno.setParcial1(parcial1);
         objAluno.setParcial2(parcial2);
         objAluno.setPrincipal(principal);
         
         JOptionPane.showMessageDialog(null, "Nome: "+objAluno.getNome()+"\nRA: "+objAluno.getRa()+"\nMédia Final: "+objAluno.médiaFinal(),"AppAluno",1);
       
    }
    
}
