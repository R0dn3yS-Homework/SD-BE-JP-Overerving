public abstract class Animal {
  String name;
  String gender;

  public Animal(String thisName, String thisGender) {
    name = thisName;
    gender = thisGender;
  }

  public void sleep() {
    System.out.println(this.name + " sleeps for 8 hours.");
  }

  public void move() {
    System.out.println(this.name + " moved for 0.25m.");
  }

  public void eat(String food) {
    System.out.println(this.name + " eats " + food);
  }

  public abstract void sound();
}
