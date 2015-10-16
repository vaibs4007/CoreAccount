package com.ail.core.account.repository;

import com.ail.core.account.models.CoreMyAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by vaibhav on 15/10/15.
 */
//@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts")
public interface CoreAccountRepository extends MongoRepository<CoreMyAccount, String> {


    @Query(value = " { 'email' :?0 }")
    CoreMyAccount findOneByEmail(@Param("email") String email);

//    @Query(value = "{firstName: ?0}")
//    CoreMyAccount find(String firstName);

//   CoreMyAccount findOne(@Param("id") String id);

}
