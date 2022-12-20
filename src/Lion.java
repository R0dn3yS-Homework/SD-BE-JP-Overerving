public class Lion extends Animal {
  String pen;
  String lastFed;
  String originCountry;
  int kids;

  public Lion(String name, String gender, String pen, String lastFed, String originCountry, int kids) {
    super(name, gender);

    this.pen = pen;
    this.lastFed = lastFed;
    this.originCountry = originCountry;
    this.kids = kids;
  }

  public void sound() {
    System.out.println("Roar");
  }
}
