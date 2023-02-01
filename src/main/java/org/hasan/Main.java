package org.hasan;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Set<Customer> customers = new HashSet<>();

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();

        // Müşterileri ve faturaları ekleyin
        Customer c1 = new Customer("ACME Inc.", "Manufacturing", LocalDate.of(2020, 5, 1));
        c1.addInvoice(new Invoice(1000, LocalDate.of(2020, 5, 15)));
        c1.addInvoice(new Invoice(2000, LocalDate.of(2020, 6, 15)));
        customers.add(c1);

        Customer c2 = new Customer("Beta Corp.", "Retail", LocalDate.of(2020, 6, 1));
        c2.addInvoice(new Invoice(500, LocalDate.of(2020, 6, 1)));
        c2.addInvoice(new Invoice(1500, LocalDate.of(2020, 6, 15)));
        customers.add(c2);
        Customer c3 = new Customer("Gamma LLC", "Services", LocalDate.of(2020, 6, 15));
        c3.addInvoice(new Invoice(2000, LocalDate.of(2020, 6, 15)));
        c3.addInvoice(new Invoice(3000, LocalDate.of(2020, 7, 15)));
        customers.add(c3);

        Scanner sc = new Scanner(System.in);
        int switchButton = 0;
        System.out.println("1-List all customers\n" +
                "2-List customers with the letter 'C' in it\n" +
                "3-List the total amount of invoices of customers registered in June\n" +
                "4-List all invoices in the system\n" +
                "5-List invoices over 1500TL in the system\n" +
                "6-List the names of customers with invoices under 500TL in the system\n" +
                "7-Type the code that lists the sector in which the companies with June invoices with an average of less than 750 are located\n" +
                "please select the process : ");
        String name = sc.nextLine();
        switch (switchButton) {
            case 1:
                System.out.println("All customers:");
                customerService.getAllCustomers();
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            default:
                System.out.println("Haftasonu");
        }




        // İçerisinde 'C' harfi olan müşterileri listeleyin
        System.out.println("\nCustomers with 'C' in their name:");
        customers.stream()
                .filter(c -> c.getName().contains("C"))
                .forEach(c -> System.out.println(c.getName()));

        // Haziran ayında kayıt olan müşterilerin faturalarının toplam tutarını listeleyin
        System.out.println("\nTotal invoice amount for customers registered in June:");
        double total = customers.stream()
                .filter(c -> c.getRegisterDate().getMonth().equals(LocalDate.of(2020, 6, 1).getMonth()))
                .map(c -> c.getInvoices())
                .flatMap(inv -> inv.stream())
                .mapToDouble(Invoice::getAmount)
                .sum();
        System.out.println(total);

        // Sistemdeki tüm faturaları listeleyin
        System.out.println("\nAll invoices:");
        customers.stream()
                .map(c -> c.getInvoices())
                .flatMap(inv -> inv.stream())
                .forEach(i -> System.out.println(i.getAmount() + " - " + i.getDate()));

        // Sistemdeki 1500TL üstündeki faturaları listeleyin
        System.out.println("\nInvoices above 1500:");
        customers.stream()
                .map(c -> c.getInvoices())
                .flatMap(inv -> inv.stream())
                .filter(i -> i.getAmount() > 1500)
                .forEach(i -> System.out.println(i.getAmount() + " - " + i.getDate()));

        // Sistemdeki 1500TL üstündeki faturaların ortalamasını hesaplayın
        System.out.println("\nAverage invoice amount above 1500:");
        double avg = customers.stream()
                .map(c -> c.getInvoices())
                .flatMap(inv -> inv.stream())
                .filter(i -> i.getAmount() > 1500)
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0);
        System.out.println(avg);
        // Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri listeleyin
        System.out.println("\nCustomers with invoices below 500:");
        List<String> custNames = customers.stream()
                .filter(c -> c.getInvoices().stream().anyMatch(i -> i.getAmount() < 500))
                .map(Customer::getName)
                .collect(Collectors.toList());
        custNames.forEach(System.out::println);

        // Haziran ayını faturalarını ortalaması 750 altı olan firmalarının hangi sektörde olduğunu listeleyen kodu yazın
        System.out.println("\nCompanies with June invoice average below 750, grouped by sector:");
        Map<String, List<String>> companiesBySector = customers.stream()
                .filter(c -> c.getInvoices().stream().anyMatch(i -> i.getDate().getMonth().equals(LocalDate.of(2020, 6, 1).getMonth())))
                .filter(c -> c.getInvoices().stream().filter(i -> i.getDate().getMonth().equals(LocalDate.of(2020, 6, 1).getMonth())).mapToDouble(Invoice::getAmount).average().orElse(0) < 750)
                .collect(Collectors.groupingBy(Customer::getSector, Collectors.mapping(Customer::getName, Collectors.toList())));
        companiesBySector.forEach((sector, companies) -> {
            System.out.println(sector + ":");
            companies.forEach(System.out::println);
        });
    }
}