public class Cat extends Pet {
  String type;

  public Cat(String name, String gender, String ownerName, String favFood, String breed, String type) {
    super(name, gender, ownerName, favFood, breed);

    this.type = type;
  }

  public void sound() {
    System.out.println("Meow");
  }

  public void eat(String food) {
    System.out.println(this.name + " eats " + food);
  }
}
