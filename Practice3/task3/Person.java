class Person {
    private String lastName;
    private int birthyear;
    private Address address;

    public Person(String lastName, int birthyear, Address address) {
        this.lastName = lastName;
        this.birthyear = birthyear;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }
    public void printLastName() {
        System.out.println(lastName);
    }

    public int getBirthYear() {
        return birthyear;
    }

    public Address getAddress() {
        return address;
    }
    public void printStreet() {
        System.out.println(address.getStreet());
    }
}
class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
    public void printStreet() {
        System.out.println(street);
    }
}
