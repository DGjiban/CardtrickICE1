/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Random;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    Random random = new Random();
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   
    //number
    public static int number() {
       
        Random random = new Random();
        return random.nextInt(12)+1;
    
    }
    
    //method for suits
    public static String suit(){
       
        Random random = new Random();
        
        return SUITS[random.nextInt(3)];
        
    }
    
    public String toString(){
        return  getValue() + " " + getSuits();
    }
    
}
