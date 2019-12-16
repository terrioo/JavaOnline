package epam_intro_online.module_4.ClassesAndObject.Task8_Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {

    public static List<Customer> sortCostomer(Customer[] customer) {
        List<Customer> listOfCustomers = new ArrayList<>();
        Comparator<Customer> comparator = Comparator.comparing(Customer::getSurname)
                .thenComparing(Customer::getName).thenComparing(Customer::getPatronymic);

        Arrays.stream(customer).sorted(comparator).forEach(listOfCustomers::add);
        return listOfCustomers;
    }


    public static List<Customer> findCustomersInCardNumber(Customer[] customer, int from, int to) {
        List<Customer> listOfCustomers = new ArrayList<>();
        for (Customer customers : customer) {
            if (customers.getCreditCard() >= from && customers.getCreditCard() <= to) {
                listOfCustomers.add(customers);
            }
        }
        return listOfCustomers;
    }


    public static void print(List<Customer> customer) {
        for (Customer customers : customer) {
            System.out.println(customers);
        }
    }


}

