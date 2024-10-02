import java.util.Scanner;

 public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        boolean playAgain = true;
        while (playAgain) {

    /* Creating a new scanner object */

            Scanner scan = new Scanner (System.in);

                System.out.println("Choose your madlib story");
                System.out.println("Enter 1 or 2");
                String choiceStory = scan.nextLine();

    /* If statement to select story based on user input */

                if (choiceStory.equals("1")) {
                    doMadlib();
                } 
    /* Else prints story 2 (anything but 1) */

                else {
                    doMadlib2 (); 
                } 
    /* Waiting for user input */

                System.out.println ("Would you like to continue? (y/n)");
                String continueStory = scan.nextLine ();

    /* plays madlib from printInstructions */

                if (continueStory.equals("y")){
                printInstructions();
                }

    /* Breaking loop */

                else{
                    System.out.print("Thanks for playing! ");
                    break;
                }


        }
    }
    
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 

    /* Getting user's name*/

    public String getUserName(){
        System.out.println(">=>        >=>            >=>                                            >=>");
        System.out.println(">=>        >=>            >=>                                            >=>");
        System.out.println(">=>   >>   >=>   >==>     >=>    >==>    >=>     >===>>=>>==>    >==>    >=>");
        System.out.println(">=>  >=>   >=> >>   >=>   >=>  >=>     >=>  >=>   >=>  >>  >=> >>   >=>  >=>");
        System.out.println(">=> >> >=> >=> >>===>>=>  >=> >=>     >=>    >=>  >=>  >>  >=> >>===>>=> >>>");
        System.out.println(">> >>    >===> >>         >=>  >=>    >=>  >=>  >=>  >>  >=> >>             ");
        System.out.println(">=>        >=>  >====>   >==>    >==>    >=>     >==>  >>  >=>  >====>   >=>");

        

        System.out.println("Please enter your name:");

    /* Waiting for user input */

        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        
        return name;
    }
    /*Printing greeting with previous inputs */   

    public void printGreeting (String userName){
        System.out.println("Hi "+userName+"!");

    } 
    /*Printing out how to play*/
    public void printInstructions() {

    System.out.println ("In order to play madlibs, enter the correct type of word the prompt is asking for.");

    }

    /*Asking User for Inputs with scanner*/

    public void doMadlib (){
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter an Adjective:");
        String adj1 = scan.nextLine ();

        System.out.println ("Enter a noun");
        String noun1 = scan.nextLine ();

        System.out.println ("enter a name");
        String name1 = scan.nextLine ();

        System.out.println ("enter a place");
        String place1 = scan.nextLine();

        System.out.println ("Enter a verb with ing");
        String verb1 = scan.nextLine ();

        System.out.println ("Enter another adjective");
        String adj2 = scan.nextLine ();

        System.out.println ("Enter another noun");
        String noun2 = scan.nextLine ();

        System.out.println ("Enter another verb");
        String verb2 = scan.nextLine ();

        System.out.println ("Enter a verb ending in ed");
        String verbed = scan.nextLine ();

        System.out.println ("Enter an animal");
        String animal = scan.nextLine ();

        System.out.println ("enter a number and a plural thing");
        String numThing = scan.nextLine();


    /*fill in inputs to make madlib */

        String story1  = "Once upon a time, there was a " + adj1 + " " + noun1 + " called " + name1 +
        " who lived in " + place1 + " " + ". One day, as they were " + verb1 + "in the streets of " + place1 + " they found a " + 
        adj2 + " " + noun2 + " and decided to " + verb2 + " it until " + verbed + ". Fortunately, a magical " + animal + " swooped in and gave everyone " + numThing + ". they were all very satisfied with their new " + numThing + " so they all went home and lived happily ever after!";
    
    /*Print story */

        System.out.println("Here's your madlib");
        System.out.println (story1);
    
        
    }
    /* Run second story */

    public void doMadlib2(){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a place");
        String place2 = scan.nextLine();

        System.out.println ("Enter a plural edible (or inedible if ur weird) object ");
        String ing1 = scan.nextLine ();

        System.out.println ("Enter another plural food item");
        String ing2 = scan.nextLine ();

        System.out.println ("Enter a made-up food item");
        String ing3 = scan.nextLine ();

        System.out.println ("enter a noun");
        String scent1 = scan.nextLine ();

        System.out.println("Enter another noun");
        String scent2 = scan.nextLine ();

    /*filling story with user input and printing it out*/
    
        String story2 = "In the mythical land of " + place2 + " , vlorp is the most popular dish. It's ingredients include " + ing1 + " " + ing2 + " and the delicious delicacy of " + ing3 + ". Vlorp has a captivating smell of " + scent1 + " and " + scent2 ;
        
        System.out.println (story2);
    }


    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}