/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prevent.repository;

import com.example.prevent.models.File;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Cast
 */
public interface FileRepository extends CrudRepository<File, Long>{
    
    @Override
    File save(File file);
    
}
