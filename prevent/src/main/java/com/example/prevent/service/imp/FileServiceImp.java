/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prevent.service.imp;

import com.example.prevent.models.File;
import com.example.prevent.repository.FileRepository;
import com.example.prevent.service.FileService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author Cast
 */
@Service
public class FileServiceImp implements FileService{
    	
    private FileRepository fileRepository;


    @Override
    public List<File> insert(MultipartFile file) {
        Scanner sc = null;    
        List<String> lista = new ArrayList();
        try {
             sc = new Scanner(file.getInputStream());
             while (sc.hasNextLine()) {
                 String line = sc.nextLine();
                 lista.add(line);
            } 


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
        return lista.stream().map(s -> new File(Arrays.asList(s.split("\\|")))).map(f -> this.fileRepository.save(f)).collect(Collectors.toList());
    }
    
}
