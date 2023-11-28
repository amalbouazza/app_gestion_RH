package com.projet.app_gestion_rh.Service;

import com.projet.app_gestion_rh.DTO.CustomerDTO;
import com.projet.app_gestion_rh.DTO.CustomerSaveDTO;
import com.projet.app_gestion_rh.DTO.CustomerUpdateDTO;
import com.projet.app_gestion_rh.entity.Customer;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getALL();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
