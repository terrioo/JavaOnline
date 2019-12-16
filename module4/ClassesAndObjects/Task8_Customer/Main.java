package epam_intro_online.module_4.ClassesAndObject.Task8_Customer;

public class Main {
    public static void main(String[] args) {
        Customer[] customer = {
                new Customer("Vislav", "Alexey", "Pavlovich", "Minsk", 1175395, 234901),
                new Customer("Volkov", "Aleksandr", "Andreevich", "Moscow", 7482953, 333863),
                new Customer("Pashkevich", "Aleksandra", "Ihorevna", "Brest", 1144295, 288601),
                new Customer("Voclav", "Viktor", "Pavlovich", "Molodechno", 1355395, 994901),
                new Customer("Alfimov", "Pavel", "Aleksandrovich", "Grodno", 8833972, 182953),
                new Customer("Volkov", "Dmitryi", "Andreevich", "Moscow", 6371357, 111111)
        };
        System.out.println("Sort by name: ");
        CustomerLogic.print(CustomerLogic.sortCostomer(customer));
        System.out.println("Filter by number of credit card: ");
        CustomerLogic.print(CustomerLogic.findCustomersInCardNumber(customer, 1100000, 3000000));

    }
}
