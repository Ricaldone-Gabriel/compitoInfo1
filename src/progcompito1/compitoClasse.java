/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progcompito1;

/**
 *
 * @author gigga
 */
public class compitoClasse {
    boolean trov = false;
    int cont = 0;
    int i;
    
    public int identicheFino(String s1, String s2) {
        if (s1.equals(s2)) {
            return 0;
        } else {
            do {
                if (s1.charAt(i) == s2.charAt(i)) {
                    cont++;
                } else {
                    trov = true;
                }
                i++;
            } while (!trov);
            if (cont == 0) {
                return -1;
            } else {
                return cont;
            }
        }
    }
    
    public int contieneVocaleMaiuscola(String s1) {
        String s2 = s1.toUpperCase();
        char c;
        for (int i= 0; i < s1.length(); i++) {
            c=s1.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
                return 0;
            }
        }
        return -1;
    }
    
    public int treConsonantiConsecutive(String s1) {
        int cont = 0;
        char c;
        for (int i = 0; i < s1.length(); i++) {
            s1 = s1.toLowerCase();
            c=s1.charAt(i);
            if (c != 'a'  && c != 'e'  && c != 'i' && c != 'o'  && c != 'u' && c != 'y') {
                cont++;
            }
            if (c == 'a'  || c == 'e'  || c == 'i' || c == 'o'  || c == 'u' || c == 'y') {
                if (cont > 2) {
                    return 0;
                }
                cont = 0;
            }
        }
        return -1;
    }
    
    public int doppia(String s1) {
        int cont = 0;
        boolean trov = false;
        char c;
        for (int i = 0; i < s1.length()-1 && !trov; i++) {
            c=s1.charAt(i);
            if (c == s1.charAt(i+1) && c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' && c != 'o' && c != 'O' && c != 'u' && c != 'U' && c != 'y' && c != 'Y' ) {
                cont++;
            }
            if (c != s1.charAt(i+1)) {
                if (cont == 1) {
                    return 0;
                }
            }
        }
        return -1;
    }
}
