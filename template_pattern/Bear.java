public abstract class Bear {

  public void typicalDay() {
      wakeUp();
      gatherFood();
      eat();
      sleep();
  }

  public abstract void gatherFood();

  public void wakeUp() {
      System.out.println("Waking up");
  }

  public void eat() {
    System.out.println("OM NOM NOM");
  }

  public void sleep() {
    System.out.println("Zzz");
  }

  public void roar(){
    System.out.println("roar!");
  }

}
