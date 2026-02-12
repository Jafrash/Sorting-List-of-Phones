import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Phone implements Comparable<Phone>{
    public int id;
    public String name;
    public String brand;
    double cost;
    private final LocalDate releaseDate; // made final

    public Phone(int id, String name, String brand, double cost, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate(){
        return releaseDate;
    }

     public void display(){
         System.out.println("ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Brand: " + brand);
         System.out.println("Cost: " + cost);
         System.out.println("Release Date: " + (releaseDate != null ? releaseDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : "N/A"));
     }

     @Override
    public int compareTo(Phone other){
        return Double.compare(this.cost,other.cost);
     }


}

class PhoneManager extends Phone{

    List<Phone> list = new ArrayList<>();
    public PhoneManager(int id, String name, String brand, double cost, LocalDate releaseDate, List<Phone>li) {
        super(id, name, brand, cost, releaseDate);
        this.list=li;
    }

        public void display(){
            super.display();
            System.out.println("This is a phone manager.");
        }

        void addPhone(Phone phone){
            list.add(phone);
            System.out.println("Adding phone: " + phone.name);
        }

        void removePhone(Phone phone){
            if(!list.isEmpty()){
                list.remove(phone);
                System.out.println("Removing phone: " + phone.name);
            }else {
                System.out.println("No phones to remove");
            }

        }

        void removePhoneById(int id){

        Iterator<Phone> it=list.iterator();

        while(it.hasNext()){
            Phone p = it.next();
            if(p.id==id){
                it.remove();
                System.out.println("Removing phone with ID: " + id);
                return;
            }
        }

        System.out.println("Phone with ID " + id + " not found.");


        }

        void sortPhonesByCost(){

            list.sort(Comparator.naturalOrder());

        }

        //void sortByName(){
        //Collections.sort(list,Comparator.comparing(p -> p.name));
        //}

        void sortByReleaseDate(){
        list.sort(Comparator.comparing(Phone::getReleaseDate).reversed());
        }

        void filterByBrand(String brand){
            System.out.println("Phones of brand: " + brand);
            for(Phone phone : list){
                if(phone.brand.equalsIgnoreCase(brand)){
                    phone.display();
                }
            }
        }



}
public class Main {
    public static void main(String[] args) {
        PhoneManager Manager = new PhoneManager(0, "Manager", "N/A", 0.0, LocalDate.now(), new ArrayList<>());
        Phone phone1 = new Phone(1, "iPhone 13", "Apple", 999.99, LocalDate.parse("2021-09-10"));
        Phone phone2 = new Phone(2, "Galaxy S21", "Samsung", 799.99, LocalDate.parse("2021-01-15"));
        Phone phone3 = new Phone(3, "Pixel 6", "Google", 599.99, LocalDate.parse("2021-10-22"));

        Manager.addPhone(phone1);
        Manager.addPhone(phone2);
        Manager.addPhone(phone3);

        /*
        System.out.println("\nPhones sorted by cost:");
        Manager.sortPhonesByCost();
        for(Phone phone : Manager.list){
            phone.display();
            System.out.println();
        }
        System.out.println("\nFiltering phones by brand 'Apple':");
        Manager.filterByBrand("Apple");
        Manager.removePhoneById(2);
        System.out.println("\nPhones after removal:");
        for(Phone phone : Manager.list){
            phone.display();
            System.out.println();
        }

        */
        Manager.sortByReleaseDate();
        for(Phone p: Manager.list){
          p.display(); System.out.println();
        }

    }


    }
