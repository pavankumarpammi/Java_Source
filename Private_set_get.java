class Person{
  private int age;
  private String name;
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }

}

class Main {
  public static void main(String[] args) {
    Person test = new Person();
    test.setAge(20);
    test.setName("Pavan");

    // get value of private variables
    System.out.println("Age: " + test.getAge());
    System.out.println("Name: " + test.getName());
  }
}