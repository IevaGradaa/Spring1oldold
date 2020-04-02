package hello.mapper;

import hello.dto.CustomerDto;
import hello.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerMapper {

    //TODO: Implement method that maps entity to dto
    public CustomerDto map(Customer customer)//, CustomerDto customerDto)
    {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setId(customer.getId());
        return customerDto;
    }

    //TODO: Implement method that maps dto to entity
    public Customer map(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto.getFirstName(), customerDto.getLastName());
        return customer;
    }

    //TODO: Implement method that maps List of entities to List of dto
    public List<CustomerDto> map(List<Customer> customerList) {
        List<CustomerDto> list = new ArrayList<CustomerDto>();
        for (Customer customer : customerList) {
            list.add(map(customerList.get(customerList.listIterator().nextIndex())));

        }
        return list;
    }

    //TODO: Implement method that maps List of dto to List of entities
    public List<Customer> mapList(List<CustomerDto> customerDtoList) {
        List<Customer> list = new ArrayList<Customer>();
        for (CustomerDto customerDto : customerDtoList) {
            list.add(map(customerDtoList.get(customerDtoList.listIterator().nextIndex())));
        }
        return list;
    }

    //TODO: Implement method that updates entity with dto data
    public Customer update(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto.getFirstName(), customerDto.getLastName());

        return customer;
    }



}
