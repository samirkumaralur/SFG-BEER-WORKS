package guru.springframework.msscbrewery.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID uuid) {
        return CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .name("Samir")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().uuid(customerDto.getUuid())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID uuid, CustomerDto customerDto) {
        log.debug("Inside update Customer function...");
    }

    @Override
    public void deleteByCustomerId(UUID uuid) {
        log.debug("delete by Customer Id...");
    }


}
