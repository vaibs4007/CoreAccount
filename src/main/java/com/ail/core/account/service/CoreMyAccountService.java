package com.ail.core.account.service;

import com.ail.core.account.models.Address;
import com.ail.core.account.models.CoreMyAccount;
import com.ail.core.account.repository.CoreAccountRepository;

import java.util.List;

public interface CoreMyAccountService {

    //POST methods
    String insert(CoreMyAccount account);

    Address insert(String id, Address address);


    //PUT methods
//    CoreMyAccount save(CoreMyAccount account);
//
//    Address save(String id, Address address, String key);

    //DELETE methods
    Boolean remove(String id);

    Boolean removeAddress(String id, String key);

    //PATCH methods
//    CoreMyAccount updateAccount(String id, HashMap<String, String> data);
//
//    Address patchAddress(String id, HashMap<String, Object> addressHashMap, String key);

    //GET methods
    Object findOne(String id);

    Address findAddress(String id, String key);


    List<Address> getAddresses(String id);


    void setCoreAccountRepository(CoreAccountRepository coreAccountRepository);


    String sayHelloWord();

}