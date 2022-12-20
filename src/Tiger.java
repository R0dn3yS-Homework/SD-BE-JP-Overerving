public class Tiger extends Animal {
  String pen;
  String lastFed;
  String originCountry;
  int stripes;

  public Tiger(String name, String gender, String pen, String lastFed, String originCountry, int stripes) {
    super(name, gender);

    this.pen = pen;
    this.lastFed = lastFed;
    this.originCountry = originCountry;
    this.stripes = stripes;
  }

  public void sound() {
    System.out.println("Growl");
  }
}
