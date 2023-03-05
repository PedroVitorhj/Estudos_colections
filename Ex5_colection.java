/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_colection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pv_he
 */
public class Ex5_colection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<Character, Integer> mapa = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.next();

        char[] arrayString = frase.toCharArray();

        for (char c : arrayString) {

            if (mapa.containsKey(c)) {

                mapa.put(c, mapa.get(c) + 1);

            } else {

                mapa.put(c, 1);

            }
        }
        
        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}


