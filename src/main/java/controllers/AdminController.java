/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Administration;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import services.IAdministrationService;
import services.ImpAdministrationService;

/**
 *
 * @author ADMIN
 */
@ManagedBean
@RequestScoped
public class AdminController {
    Administration admin = new Administration();
    IAdministrationService service = new ImpAdministrationService();
    String msg ="";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Administration getAdmin() {
        return admin;
    }

    public void setAdmin(Administration admin) {
        this.admin = admin;
    }
    
    public String check(){
        if(this.service.check(this.admin))
            return "home";
        this.msg="incorrect password or login";
        return "login";
    }
    
    
    
}
