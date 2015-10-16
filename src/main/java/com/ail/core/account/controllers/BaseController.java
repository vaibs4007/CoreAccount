package com.ail.core.account.controllers;

import com.ail.core.account.models.Address;
import com.ail.core.account.models.CoreMyAccount;
import com.ail.core.account.service.CoreMyAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by vaibhav on 15/10/15.
 */
//@RestController
//@EnableMongoAuditing
public class BaseController {


    //    @Autowired
    public CoreMyAccountService coreMyAccountService;

    /*protected void setAccountService(CoreMyAccountService servcie)
    {
        coreMyAccountService=servcie;
    }*/
//
//    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
//    public CoreMyAccount createAccount(@RequestBody @Valid final CoreMyAccount account) {
//        System.out.println("Accessing base controller");
//        return coreMyAccountService.insert(account);
//    }


    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
    public Object getAccount(@PathVariable("id") final String id) {
        return (CoreMyAccount) coreMyAccountService.findOne(id);
    }

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.DELETE)
    public Boolean removeAccount(@PathVariable("id") final String id) {
        return coreMyAccountService.remove(id);
    }


    @RequestMapping(value = "/accounts/{id}/addresses", method = RequestMethod.POST)
    public Address createAddress(@PathVariable("id") final String id, @RequestBody @Valid final Address address) {
        return coreMyAccountService.insert(id, address);
    }

    @RequestMapping(value = "/accounts/{id}/addresses/{key}", method = RequestMethod.DELETE)
    public Boolean removeAddress(@PathVariable("id") final String id, @PathVariable("key") final String key) {
        return coreMyAccountService.removeAddress(id, key);

    }

    public void setAccountService(CoreMyAccountService accountService) {
        this.coreMyAccountService = accountService;
    }

}
