import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Непряхин", "2789564");
        phoneDirectory.add("Путин", "2135156");
        phoneDirectory.add("Кадыров", "4653123456");
        phoneDirectory.add("Непряхин", "8-800-555-35-35");
        System.out.println("Все записи в справочнике:");
        phoneDirectory.printAll();
        System.out.println("\nНомера для фамилии Непряхин:");
        List<String> nepryakhinNumbers = phoneDirectory.get("Непряхин");
        for (String number : nepryakhinNumbers) {
            System.out.println(number);
        }
        System.out.println("\nНомера для фамилии Путин:");
        List<String> pytinNumbers = phoneDirectory.get("Путин");
        for (String number : pytinNumbers) {
            System.out.println(number);
        }
        System.out.println("\nНомера для фамилии Кадыров:");
        List<String> kadirovNumbers = phoneDirectory.get("Кадыров");
        for (String number : kadirovNumbers) {
            System.out.println(number);
        }
    }
}