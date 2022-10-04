package guru.springframework.msscbrewery.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID uuid);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(UUID uuid, CustomerDto customerDto);

    void deleteByCustomerId(UUID uuid);
}
