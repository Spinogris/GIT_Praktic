package org.example._2023_11_6.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;

/**
 * --[Mockito.mock] ---> dummy(UNreal object)
 * --[@Mock/Mockito.mock] + when + verify ----> Mock(UNreal object)
 * --[@Stub/Mockito.mock] + when ----> Stub(UNreal object)
 * --[@Spy] + verify ----> Spy(real object)
 */

class CustomerRepositoryTest {

//    @Mock
//    CustomerRepository customerRepository;

    @Test
    void getInvalidCustomerById() {
        Customer customer = new Customer();
        CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class);

        Mockito.when(customerRepository.getCustomerById(anyLong())).thenThrow(new CustomerNotFoundException());

        CustomerService customerService = new SimpleCustomerService(customerRepository);
        Assertions.assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
    }
}