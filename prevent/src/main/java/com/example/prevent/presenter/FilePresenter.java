/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prevent.presenter;

import com.example.prevent.models.File;
import java.sql.Date;

/**
 *
 * @author Cast
 */
public class FilePresenter {
    private Long id;
    private String data;
    private String ip;
    private String request;
    private String status;
    private String userAgente;

    public FilePresenter(File file) {
        this.id = file.getId();
        this.data = file.getData();
        this.ip = file.getIp();
        this.request = file.getRequest();
        this.status = file.getStatus();
        this.userAgente = file.getUserAgente();
    }
    
    

    public Long getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getIp() {
        return ip;
    }

    public String getRequest() {
        return request;
    }

    public String getStatus() {
        return status;
    }

    public String getUserAgente() {
        return userAgente;
    }
    
}
