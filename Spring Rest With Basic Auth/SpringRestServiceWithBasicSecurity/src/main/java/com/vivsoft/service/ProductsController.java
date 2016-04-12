/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vivsoft.service;

/**
 *
 * @author param
 */
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

@Component
@Secured("ROLE_ADMIN")
public class ProductsController {

    public String getProductsList() {
// Implementation of method
        return "1,2,3,4";
    }
}
