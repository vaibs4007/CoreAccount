package com.ail.core.account.service;

import com.ail.core.account.models.Address;
import com.ail.core.account.models.CoreMyAccount;
import com.ail.core.account.repository.CoreAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by vaibhav on 15/10/15.
 */
//@Service("coreMyAccountService")
public class CoreMyAccountServiceImpl implements CoreMyAccountService {


    @Autowired
    CoreAccountRepository coreAccountRepository;


    @Override
    public String sayHelloWord() {

        return "hello world";
    }

    @Override
    public String insert(CoreMyAccount account) {

//        CoreMyAccount existing = coreAccountRepository.findOneByEmail(account.getEmail());

        if (account == null)
            return "account null";
        if (coreAccountRepository == null)
            return "coreAccountRepository null";
        else coreAccountRepository.insert(account);
        return "nothing";


    }

    @Override
    public Address insert(String id, Address address) {

        CoreMyAccount account = (CoreMyAccount) coreAccountRepository.findOne(id);
        account.getAddresses().add(address);
        coreAccountRepository.save(account);
        return address;
    }

//    @Override
//    public CoreMyAccount save(CoreMyAccount account) {
//        return null;
//    }
//
//    @Override
//    public Address save(String id, Address address, String key) {
//        return null;
//    }

    @Override
    public Boolean remove(String id) {
        if (coreAccountRepository.exists(id)) {
            coreAccountRepository.delete(id);
            return true;
        } else return false;
    }

    @Override
    public Boolean removeAddress(String id, String key) {
        return null;
    }

//    @Override
//    public CoreMyAccount updateAccount(String id, HashMap<String, String> data) {
//        return null;
//    }
//
//    @Override
//    public Address patchAddress(String id, HashMap<String, Object> addressHashMap, String key) {
//        return null;
//    }

    @Override
    public CoreMyAccount findOne(String id) {
        return (CoreMyAccount) coreAccountRepository.findOne(id);
    }

    @Override
    public Address findAddress(String id, String key) {
        CoreMyAccount acc = findOne(id);
        List<Address> addresses = acc.getAddresses();

        for (Address address : addresses) {

            if (key.equals(address.getKey())) {
                return address;
            }
        }
        return null;


    }


    @Override
    public List<Address> getAddresses(String id) {
        return null;
    }

    @Override
    public void setCoreAccountRepository(CoreAccountRepository coreAccountRepository) {

        this.coreAccountRepository = coreAccountRepository;
    }
}
