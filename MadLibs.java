import java.util.Scanner;

class MadLibs {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = keyboardInput.nextLine();
        System.out.print("Name a silly word: ");
        String word = keyboardInput.nextLine();
        System.out.print("Enter a number: ");
        double base = Double.parseDouble(keyboardInput.nextLine());
        double number = Math.pow(base, 5.0);
        System.out.print("Name an adjective: ");
        String adjective = keyboardInput.nextLine();
        System.out.print("Enter a noun: ");
        String noun = keyboardInput.nextLine();
        System.out.print("Give me an another number: ");
        double a = Double.parseDouble(keyboardInput.nextLine());
        double number2 = Math.sinh(a);
        String story = "Hello, " + "my name is astronaut " + name + ". " + "I am on my way to planet " + word + ". " + "I will be gone for " + number + " days. " + "I am very " + adjective + " about the trip but I will miss my " + noun + ". I heard that the atmosphere there is " + number2 + " degree in an alien world.";
        System.out.println(story);

    }
}