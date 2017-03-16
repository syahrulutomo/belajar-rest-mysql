/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagecode.belajar.access.restfull.mysql.dao;

import com.sagecode.belajar.access.restfull.mysql.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author syahrul
 */
public interface UserRepository extends CrudRepository<User,Long>{
    
}
