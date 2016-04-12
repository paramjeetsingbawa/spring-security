/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vivsoft.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Path("/ProductsService")
@Service
@Scope("request")
public class ProductsService {

    @Autowired
    private ProductsController products;

    @POST
    @Path("/getProductsList")
    @Produces("text/plain")
    public String getProductsList() {
        return products.getProductsList();
    }
}
