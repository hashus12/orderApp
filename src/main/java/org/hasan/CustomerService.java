package org.hasan;

public class CustomerService {

    // Tüm müşterileri listeleyin
    public void getAllCustomers(){
        customers.forEach(c -> System.out.println(c.getName()));
    }
}
