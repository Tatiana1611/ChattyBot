import java.util.Scanner;

public class SimpleBot {
    private String name = "Rebecca";
    private int year = 2023;
    Scanner scanner = new Scanner(System.in);

    public SimpleBot() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    public void havingAConversation(){
        sayHello();
        guessingAge();
        counting();
        askQuestions();
    }
    public void sayHello(){
        System.out.printf("Hello, my name is %s%n", getName());
        System.out.printf("I was created in %d%n", getYear());
        System.out.printf("Please, remind me your name.%n");
        String yourName = scanner.next();
        System.out.printf("What a great name you have, %s! %n", yourName);
    }
    public void guessingAge(){
        System.out.printf("Let me guess your age.%n");
        System.out.printf("Enter remainders of dividing your age by 3, 5 and 7.%n");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!%n", age);
    }
    public void counting(){
        System.out.printf("Now I will prove to you that I can count to any number you want.%n");
        int number = scanner.nextInt();
        for(int i = 0; i<= number; i++){
            System.out.printf("%d!%n",i);
        }
        System.out.printf("Let's test your programming knowledge. %n");
    }

    public void askQuestions(){
        boolean flag = true;
        while(flag) {
            System.out.println(""" 
                    Please choose 1, 2, 3 or 4.
                    Who won Champions League last year?
                    1 - Barcelona
                    2 - Real Madrid
                    3 - Bayern Munchen
                    4 - PSG
                    """);
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Please, try again");
                    flag = true;
                    break;
                case 2:
                    System.out.println("Congratulations, have a nice day!");
                    flag = false;
                    break;
                case 3:
                    System.out.println("Please, try again");
                    flag = true;
                    break;
                case 4:
                    System.out.println("Please, try again");
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid answer. Please try again");
                    flag = true;
                    break;
            }
        }
    }
}
