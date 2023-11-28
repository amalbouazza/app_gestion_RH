package com.projet.app_gestion_rh.Service;

import com.projet.app_gestion_rh.CustomerRepo.CustomerRepo;
import com.projet.app_gestion_rh.DTO.CustomerDTO;
import com.projet.app_gestion_rh.DTO.CustomerSaveDTO;
import com.projet.app_gestion_rh.DTO.CustomerUpdateDTO;
import com.projet.app_gestion_rh.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL  implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {

        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getCustomeradresse(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomername();

    }

    @Override
    public List<CustomerDTO> getALL() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (Customer a : getCustomers) {
            CustomerDTO customerDTO = new CustomerDTO(

                    a.getCustomerid(),
                    a.getCustomername(),
                    a.getCustomeradresse(),
                    a.getMobile()

            );
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

    @Override
    public String updateCustomers(CustomerUpdateDTO customerUpdateDTO) {
        if (customerRepo.existsById(customerUpdateDTO.getCustomerid())) {
            Customer customer = customerRepo.getById(customerUpdateDTO.getCustomerid());
            customer.setCustomername(customerUpdateDTO.getCustomername());
            customer.setCustomeradresse(customerUpdateDTO.getCustomeradresse());
            customer.setMobile(customerUpdateDTO.getMobile());
            customerRepo.save(customer);
        }

            else
            {
                System.out.println("Customer ID n'exsite pas!");
            }

            return null;
        }

    @Override
    public boolean deleteCustomer(int id) {

        if(customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        }
        else
        {
            System.out.println("ID n'existe pas!!");
        }
        return false;
    }
}




