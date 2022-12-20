public class Dog extends Pet {
  public Dog(String name, String gender, String ownerName, String favFood, String breed) {
    super(name, gender, ownerName, favFood, breed);
  }

  @Override
  public void sound() {
    System.out.println("Woof");
  }
}
