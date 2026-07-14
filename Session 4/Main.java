public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Braxten Knox Crujido", 5);
        Person person2 = new Person("Elaiza Belle Caballes", 15);

        person1.setName("Braxten Knox Crujido");
        person1.setAge(5);

        person2.setName("Elaiza Belle Caballes");
        person2.setAge(15);
        
        person1.introduce();
        person2.introduce();
    }
}
