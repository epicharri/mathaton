/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

/**
 *
 * @author harrikah
 */
public class PlusExercise {
    
    private int firstNumber;
    private int secondNumber;
    
    public PlusExercise() {
        this.firstNumber = randomInt();
        this.secondNumber = randomInt();
    }
    
    // To test application logic in text based application
    // before developing gui:
    
    public String giveQuestion() {
        return "" + this.firstNumber + " + " + secondNumber + " = ";
    }
    
    public boolean checkAnswer(int number) {
        return firstNumber + secondNumber == number;
    }
    
    public int randomInt() {
        int a = 10;
        double floatNumber = (Math.random() * a);
        int number = (int) floatNumber;
        return number;
    }
    
}
