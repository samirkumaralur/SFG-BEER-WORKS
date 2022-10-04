package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.Service.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerID}"})
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerID") UUID customerID){
        return new ResponseEntity<>(customerService.getById(customerID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto customerDto1=  customerService.createCustomer(customerDto);
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/customer/"+ customerDto1.getUuid().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity updateCustomer(@PathVariable("customerId") UUID uuid, @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(uuid, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByCustomerId(@PathVariable("customerId") UUID uuid){
        customerService.deleteByCustomerId(uuid);
    }
}
