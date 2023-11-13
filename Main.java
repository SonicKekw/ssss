import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(200, "Toyota"); //двигатель

        Driver driver = new Driver("Тимур Тюряев", 5); //водитель

        Lorry lorry = new Lorry("Volvo", "Truck", 5000, driver, engine, 10000); //груз машина

        System.out.println(lorry.toString()); //инфа о груз машине

        System.out.println("Производитель двигателя: " + lorry.getEngine().getManufacturer());//геттеры для вывода инфы о производителе двигателя

        lorry.getEngine().setManufacturer("Ford");// меняем инфу о производителе с помощью сеттера


        System.out.println(lorry.toString());//ввод инфы с помощью сеттера
    }
}