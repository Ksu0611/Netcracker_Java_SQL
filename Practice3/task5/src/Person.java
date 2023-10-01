class Person {
    private String FullName;
    private int Age;

    public Person(String FullName, int Age) {     //конструктор
        this.FullName = FullName;
        this.Age = Age;
    }
    public Person(){                    //конструктор по умолчанию
        this.FullName = "John Smith";
        this.Age = 25;
    }
    public String getFullName() {         //получить имя
        return FullName;
    }
    public int getAge() {          //получить возраст
        return Age;
    }
    public void move() {                                 //метод move
        System.out.println(this.FullName + " moves");
    }
    public void talk() {                                 //метод talk
        System.out.println(this.FullName + " talks");
    }

}