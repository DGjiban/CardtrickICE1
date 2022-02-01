
package cardtrickice1;
import java.util.Scanner;


/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found.
 *
 * @author David Gilvan
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
                
        Card[] magicHand = new Card[7]; //Array of object
        int usernumber = 0;
        String usersuit = "";
        
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.number());//use a method to generate random *13
            
            c1.setSuits(c1.suit());//random method suit 
        
            magicHand[i] = c1;
            
            for (int j=0; j<i;j++){
                if (magicHand[i] == magicHand[j]){
                    c1.setValue(c1.number());
                    c1.setSuits(c1.suit());
                    magicHand[i] = c1;
                }
            }
        }
        
        //Card [] user = new Card[1];
        Card uc = new Card();            
        
        /*
        //step 2:take input 
        while(usernumber == 0){
            try{
                System.out.println("Type a number of card between 1 and 13:");
                usernumber = input.nextInt();
                    if (usernumber < 1 || usernumber > 13){
                        System.out.println("wrong number, please try again.");
                        usernumber = 0;
                    }
            }catch(Exception e){
                System.out.println("wrong number, please try again.");
                input.next();
            }
        }
           
        while(usersuit == ""){
            try{
                System.out.println("Type a suit: (diamonds - clubs - spades - hearts)");
                usersuit = input.next().toLowerCase();
                    if ("diamonds".equals(usersuit)||"clubs".equals(usersuit)||
                        "spades".equals(usersuit)||"hearts".equals(usersuit)){
                        continue;
                    }else{
                        System.out.println("wrong suit, please try again.");
                        usersuit = "";
                    }
            }catch (Exception e){
                System.out.println("wrong suit, please try again.");
                input.next();
                continue;
            }
        }*/
        
         //luckycard hard-coded
        username=5
        usersuit="clubs";    
        uc.setValue(usernumber);
        uc.setSuits(usersuit);
                 
        //step 3: match with array 
        System.out.println("Your guess was: " + uc);
        System.out.println("The random numbers were: ");
        for (int j=0; j<magicHand.length;j++){
            System.out.println(magicHand[j]);
        }
        
        int count =0;
        for (int i=0; i <magicHand.length;i++){
            if (magicHand[i].getValue() == uc.getValue() && magicHand[i].getSuits().equals(uc.getSuits())){
                count++;  
            }   
        }
        if(count > 0){    
            System.out.println("You Win! Your card was found " + count + " times");            
        }else{
            System.out.println("Sorry, you lose :(");
        }
    }

}
