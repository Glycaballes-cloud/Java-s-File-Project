public class FunctionsBasics {

    // A welcoming message
    public static void printGreeting() {
        System.out.println("Hello, Promotion 27! Ready to code?");
    }

    //A simple pattern
    public static void printPattern(){
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
    }

    //A message
    public static void printMessage(){
        String message = "Coding is the future!";
        System.out.println(message);
    }

    // For line
    public static void printLine(){
        System.out.println("--------------------");
    }

    //A personal greetings 
    public static void printPersonalGreeting(String name){
        System.out.println("Hello " + name + " ! Welcome to Promotion 27!");
    }

    //Print a symbol for re[eated times
    public static void printRepeatedPattern(char symbol, int times){
        for(int i = 0; i < times; i++){
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static int getPromotionYear(){
        return 2026;
    }

    public static String getMotivationalQuote(){
        return "Keep coding, Promotion 27!";
    }

    public static int calculateSquare(int number){
        return number * number;
    }

    public static String concatenateStrings(String str1, String str2){
        return str1 + " " + str2;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void printStudentInfo(String firstname, String lastName, int age){
        if ( age < 18) {
            System.out.println(firstname + "" + lastName + " is a minor.");
        }else{
            System.out.println(firstname + " " + lastName + " is an adult.");
        }

        if(isEven(age)){
            System.out.println("Their age is even");
        }else{
            System.out.println("Their age is odd");
        }
    }
    //The main function
    public static void main(String[] args){

        int number = 15;
        
        printLine();
        printGreeting();
        printLine();
        printPattern();
        printLine();
        printMessage();
        printLine();

        printPersonalGreeting ("Glaica");
        printRepeatedPattern('*', 50);

        System.out.println("Promotion Year: " + getPromotionYear ());
        System.out.println("Motivational Quote: " + getMotivationalQuote() );

        System.out.println("Square of " + number + ": " + calculateSquare(number));
        System.out.println("Concatenated String : " +concatenateStrings("hello", "world !"));
        System.out.println("Is " + number + " even ?" + isEven(number));

        printStudentInfo("Glaica Heart", "Caballes", 18);
    }


}
 