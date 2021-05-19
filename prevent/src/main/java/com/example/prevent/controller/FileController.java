/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prevent.controller;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Cast
 */
@RestController
@RequestMapping("v1/file")
public class FileController {
    
    @Autowired
    private FileService fileService;
    
    
    @PostMapping("upload")
    public List<File> upload(@RequestParam MultipartFile file) throws IOException{
        
        List<File> files = this.fileService.insert(file);

        return files;
    }
//    @PostMapping("get")
//    public List<File> parseData(@RequestParam MultipartFile file) throws IOException {
//
//        
//        List<String> lines = Files.readAllLines((Path) file);
//
//        // remove date and amount
//        lines.remove(0);
//        lines.remove(lines.size() - 1);
//
//        return (List<File>) lines.stream()
//                .map(s -> s.split("[|]")).map(val -> new File(val[0], val[1], val[2],val[3],val[4])).collect(Collectors.toList());
//    } 
//    
    
}
