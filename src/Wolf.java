public class Wolf extends Animal {
  String pen;
  String lastFed;
  String originCountry;
  String packname;

  public Wolf(String name, String gender, String pen, String lastFed, String originCountry, String packname) {
    super(name, gender);

    this.pen = pen;
    this.lastFed = lastFed;
    this.originCountry = originCountry;
    this.packname = packname;
  }

  public void sound() {
    System.out.println("Howl");
  }
}
