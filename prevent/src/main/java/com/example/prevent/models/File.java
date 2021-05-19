/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prevent.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Cast
 */
@Entity
public class File implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataHora;
    private String ip;
    private String request;
    private String status;
    private String userAgente;

    public File(List<String> datas) {
        if (datas.size() > 0) this.dataHora = datas.get(0);
        if (datas.size() > 1) this.ip = datas.get(1);
        if (datas.size() > 2) this.request = datas.get(2);
        if (datas.size() > 3) this.status = datas.get(3);
        if (datas.size() > 4) this.userAgente = datas.get(4);
    }
    
//    public File(String[] lineSpit) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public File() {
    }
    
    

    public String getData() {
        return dataHora;
    }

    public void setData(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserAgente() {
        return userAgente;
    }

    public void setUserAgente(String userAgente) {
        this.userAgente = userAgente;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
