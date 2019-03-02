public class OOP {
    public static void main(String[] args) {


        Person person = new Person("Kowalski", "Szeregowy", 15);
        Person person1 = new Person("Kowalski", "Szeregowy", 15);

        if(person.equals(person1)){
            System.out.println("Takie same!");
        }else{
            System.out.println("NIE :(");
        }

        Car car = new Car("Foucs", "Ford", 3500);
        car.show();




    }
}
