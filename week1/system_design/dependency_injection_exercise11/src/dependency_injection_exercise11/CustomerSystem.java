package dependency_injection_exercise11;
interface CustomerRepository {
    String findCustomerById(String id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        return "Customer[id=" + id + ", name=Rahul, city=Delhi]";
    }
}

class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer Found: " + customer);
    }
}
