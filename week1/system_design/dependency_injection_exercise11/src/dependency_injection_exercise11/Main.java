package dependency_injection_exercise11;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.displayCustomer("C101");
    }
}
