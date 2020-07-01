package desafiofinalques6;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class DesafioFinalQues6 {

    /**
     * Questão 6
     * Em uma eleição presidencial existem quatro candidatos. Os votos são 
     * informados através de códigos. Os dados utilizados para a contagem dos
     * votos obedecem à seguinte codificação:
     * 1,2,3,4 = voto para os respectivos candidatos;
     * 5 = voto nulo;
     * 6 = voto em branco;
     * Elabore um algoritmo que leia o código do candidato em um voto. 
     * Calcule e escreva:
     *  total de votos para cada candidato;
     *  total de votos nulos;
     *  total de votos em branco;
     *  o percentual de votos de cada candidato em relação ao total de votos.
     * Como finalizador do conjunto de votos, tem-se o valor 0.
     */
    public static void main(String[] args) {
       int voto, c1,c2,c3,c4,vn,vb,cg,ct;
       c1=0; c2=0; c3=0; c4=0; vn=0; vb=0; cg=0;ct=0;
       voto = 10;
       while(voto!=0){
           voto = Integer.parseInt(JOptionPane.showInputDialog("Vote:\n"
                   + "1 - Cadidato 1\n"
                   + "2 - Cadidato 2\n"
                   + "3 - Cadidato 3\n"
                   + "4 - Cadidato 4\n"
                   + "5 - Voto Nulo\n"
                   + "6 - Voto Branco\n"
                   + "A qualquer momento voto zero termina\n"
                   + "Digite:"));
           if(voto == 1){
               c1++;
               JOptionPane.showMessageDialog(null, "Seu voto para o cadidato 1 foi computado!");
           }else if(voto == 2){
               c2++;
               JOptionPane.showMessageDialog(null, "Seu voto para o cadidato 2 foi computado!");
           }else if(voto == 3){
               c3++;
               JOptionPane.showMessageDialog(null, "Seu voto para o cadidato 3 foi computado!");
           }else if(voto == 4){
               c4++;
               JOptionPane.showMessageDialog(null, "Seu voto para o cadidato 4 foi computado!");
           }else if(voto == 5){
               vn++;
               JOptionPane.showMessageDialog(null, "Você anulou seu voto - "
                       + "seu voto foi computado!");
               cg--;
           }else if(voto == 6){
               vb++;
               JOptionPane.showMessageDialog(null, "Você votou em branco - "
                       + "seu voto foi computado!");
               cg--;
           }else if (voto==0){
             JOptionPane.showMessageDialog(null,"A Eleição terminou!! Boa sorte para a democracia!");   
             cg--; ct--;
           } else{
                JOptionPane.showMessageDialog(null,"Este voto não existe por gentileza vote novamente");
                cg--; ct--;
           }
           ct++;
           cg++;
       }//fim do loop
       
       JOptionPane.showMessageDialog(null,"Candidato 1: "+c1+" votos"
                +"\nCandidato 2: "+c2+" votos"
                +"\nCandidato 3: "+c3+" votos"
                +"\nCandidato 4: "+c4+" votos"
                +"\nNulos: "+vn +" votos"
                +"\nEm Brancos: "+vb+" votos"
                +"\n A eleição contou com "+cg+" votos válidos"
                +"\n A eleição contou com "+ct+" Eleitores"
                        + "\n---------------------------------------------\n"
                        + "Candidato 1: "+((double)c1/cg*100)+" %"
                +"\nCandidato 2: "+((double)c2/cg*100)+" %"
                +"\nCandidato 3: "+((double)c3/cg*100)+" %"
                +"\nCandidato 4: "+((double)c4/cg*100)+" %"
                
                +"\n A eleição contou com 100% dos eleitores");
        
        
    }
    
}
