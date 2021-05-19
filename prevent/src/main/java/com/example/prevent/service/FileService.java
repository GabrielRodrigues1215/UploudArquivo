/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prevent.service;

import com.example.prevent.models.File;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Cast
 */
public interface FileService {
    
    	public List<File> insert(MultipartFile file);

}
