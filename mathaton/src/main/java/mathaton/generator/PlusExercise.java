/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathaton.generator;

/**
 *
 * @author harrikah
 */
public class PlusExercise {
    
    private int firstNumber;
    private int secondNumber;

    public PlusExercise(int maxNumber) {
        this.firstNumber = randomInt(maxNumber);
        this.secondNumber = randomInt(maxNumber);
    }
      
    // To test application logic in text based application
    // before developing gui:
    
    public String giveQuestion() {
        return "" + this.firstNumber + " + " + secondNumber + " = ";
    }
    
    public boolean checkAnswer(int number) {
        return firstNumber + secondNumber == number;
    }
    
    public int randomInt(int max) {
        max = 10;
        double floatNumber = (Math.random() * max);
        int number = (int) floatNumber;
        return number;
    }
    
}
