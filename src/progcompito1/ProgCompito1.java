/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progcompito1;

/**
 *
 * @author gigga
 */
public class ProgCompito1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        compitoClasse a1 = new compitoClasse();
        String s1 = "palazzo";
        String s2 = "palaZzo";
        String s3 = "palllazzo";
        String s4 = "palazzzo";
        String s5 = "palazo";
        String s6 = "palllazzzo";
        System.out.println(a1.identicheFino(s1, s2));
        System.out.println(a1.contieneMaiuscola(s2) + " " + a1.contieneMaiuscola(s1));
        System.out.println(a1.treConsonantiConsecutive(s3) + " " + a1.treConsonantiConsecutive(s4) + " " + a1.treConsonantiConsecutive(s1));
        System.out.println(a1.doppia(s5) + " " + a1.doppia(s1) + " " + a1.doppia(s6));
    }
    
}
