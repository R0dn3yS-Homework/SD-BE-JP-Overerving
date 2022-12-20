import java.util.Scanner;

public class AnimalMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the name of your cat: ");
    String catName = sc.nextLine();

    System.out.print("What is the gender of your cat: ");
    String catGender = sc.nextLine();

    System.out.print("What is your name: ");
    String catOwner = sc.nextLine();

    System.out.print("What is your cats favorite food: ");
    String catFavFood = sc.nextLine();

    System.out.print("What breed is your cat: ");
    String catBreed = sc.nextLine();

    System.out.print("Is your cat a inside or outside cat: ");
    String catType = sc.nextLine();

    Cat cat = new Cat(catName, catGender, catOwner, catFavFood, catBreed, catType);

    cat.move();
    cat.sleep();
    cat.eat(cat.favFood);
  }
}
