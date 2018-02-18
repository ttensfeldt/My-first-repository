import java.util.Scanner;

        public class Main4 {

            public static void main(String[] args) {    //this is my comment for the commit on github

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter a hexadecimal number: ");

                String input = scan.nextLine();

                if(input.charAt(0) == '0' && input.charAt(1) == 'x'){   //remove 0x

                    input = input.substring(2);

                }

                int len = input.length();
                input = input.toUpperCase();    //make it all upper

                long out = 0;

                for(int i = 0; i < len; i++){   //iterating through all characters in the string

                    if(input.charAt(i) >= 65 && input.charAt(i) <= 90){ //check if its a letter

                        out += Math.pow(16,(len-(i+1))) * (input.charAt(i)-55);


                    }
                    else{

                        out += Math.pow(16,(len-(i+1))) * (input.charAt(i)-48);


                    }

                }


                System.out.println( "Your number is " + out + " in decimal");

            }
        }

