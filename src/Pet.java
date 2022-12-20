public abstract class Pet extends Animal {
  String ownerName;
  String favFood;
  String breed;

  public Pet(String name, String gender, String ownerName, String favFood, String breed) {
    super(name, gender);

    this.ownerName = ownerName;
    this.favFood = favFood;
    this.breed = breed;
  }

  public abstract void sound();
}
