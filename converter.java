import java.util.Scanner;

class converter{
    public static void main(String[] argv) {

        int input;

        System.out.println("From pdf to... (press the number)");
        System.out.println("1. PNG\n2.JPG");
        System.out.print(">>");

        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        in.close();

        switch(input){
            case 1:     //conversion to png
            System.out.println("to PNG");
            break;

            case 2:     //conversion to jpg
            System.out.println("to JPG");
            break;

        }
        
    }
}