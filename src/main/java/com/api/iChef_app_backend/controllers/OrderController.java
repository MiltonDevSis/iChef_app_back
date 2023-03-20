package com.api.iChef_app_backend.controllers;

import com.api.iChef_app_backend.models.Order;
import com.api.iChef_app_backend.models.response.OrderDTO;
import com.api.iChef_app_backend.services.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "API REST Adicionar Pedidos")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/AdicionarPedido", method = RequestMethod.POST)
    public ResponseEntity<Order> addOrder(@RequestBody @Valid OrderDTO orderDTO) {
        var order = new Order();
        BeanUtils.copyProperties(orderDTO, order);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.add(order));
    }
}
