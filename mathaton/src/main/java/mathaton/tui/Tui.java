/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathaton.tui;
import java.util.*;
import mathaton.generator.PlusExercise;
/**
 *
 * @author harrikah
 */
public class Tui {
    
    Scanner input;
    
    public Tui(){
        this.input = new Scanner(System.in);
        
    }

    public String input() {
        String s = "";
        while (s.isEmpty()){
            s = input.nextLine();
        }
        return s;
    }
    
    public String askString(String question){
        System.out.println(question);
        return input();
    }
    
    public boolean isNumber(String s) {
        try {
            int number = Integer.parseInt(input());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public int askNumber() {
        String s = "";
        while (!isNumber(s)){
            System.out.print("? ");
            s = input();
        }
        return Integer.parseInt(s);
    }
    
    
    public void newExam() {
        
        System.out.println("Tervetuloa laskemaan!");
        System.out.print("Montako tehtävää haluat? ");
        //int amount = askNumber();        
        int amount = Integer.parseInt(input.nextLine());
        int rightAnswers = 0;
        for (int i = 0; i < amount; i++){
            PlusExercise ex = new PlusExercise(10);
            System.out.print(ex.giveQuestion());
            int answer = Integer.parseInt(input.nextLine());
            if (ex.checkAnswer(answer)){
                System.out.println("Oikein!");
                rightAnswers++;
            } else {
                System.out.println("Väärin.");
            }
        }
        System.out.println("Sait tehtävistä oikein " + rightAnswers);   
    }
}
