class solarSystem {
}
class mars extends solarSystem {
}
class earth extends solarSystem {
}
public class hybridinherit extends earth {
    public static void main(String args[])
    {
      solarSystem s = new solarSystem();
      mars m = new mars();
      earth e = new earth();

      System.out.println(s instanceof solarSystem);
      System.out.println(m instanceof mars);
      System.out.println(e instanceof solarSystem);
    }
}
