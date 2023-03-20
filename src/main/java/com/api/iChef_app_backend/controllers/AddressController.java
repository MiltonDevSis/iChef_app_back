package com.api.iChef_app_backend.controllers;

import com.api.iChef_app_backend.models.Address;
import com.api.iChef_app_backend.models.response.AddressDTO;
import com.api.iChef_app_backend.services.AddressService;
import io.swagger.annotations.Api;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Adicionar Endereço")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/AdicionarEndereco", method = RequestMethod.POST)
    public ResponseEntity<Address> addAddress(@RequestBody @Valid AddressDTO addressDTO) {
        var address = new Address();
        BeanUtils.copyProperties(addressDTO, address);
        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.add(address));
    }
}
