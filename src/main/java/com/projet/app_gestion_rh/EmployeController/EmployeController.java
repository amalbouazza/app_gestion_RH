package com.projet.app_gestion_rh.CustomerController;

import com.projet.app_gestion_rh.DTO.CustomerDTO;
import com.projet.app_gestion_rh.DTO.CustomerSaveDTO;
import com.projet.app_gestion_rh.DTO.CustomerUpdateDTO;
import com.projet.app_gestion_rh.Service.CustomerService;
import com.projet.app_gestion_rh.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;

    }

    @GetMapping(path="/getAll")

    public List<CustomerDTO> getlall (){
        List<CustomerDTO>allCustomers = customerService.getALL();
        return allCustomers;
    }

    @PostMapping(path = "/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        String id = customerService.updateCustomers(customerUpdateDTO);
        return id;

    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id")int id)
    {
        boolean deleteCustomer = customerService.deleteCustomer(id);
        return "deleted";

    }

}
