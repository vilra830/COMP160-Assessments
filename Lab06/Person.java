public class Person{ private int age;
  private String name, country_of_origin;
  public void methodOne(int ageIn){ age = ageIn;
  }
  public void methodTwo(String nameIn, String originIn){
    name = nameIn;
    country_of_origin = originIn;
  }
  public int methodThree(){ return age;
  }
  public void methodFour(){
    System.out.println(name + " " + country_of_origin);
  }
  public String methodFive(){
    return name + " " + country_of_origin;
  } }
