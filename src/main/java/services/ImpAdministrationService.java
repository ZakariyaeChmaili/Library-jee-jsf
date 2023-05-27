/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import dao.IAdministrationDao;
import dao.ImpAdministrationDao;
import entities.Administration;

/**
 *
 * @author ADMIN
 */
public class ImpAdministrationService implements IAdministrationService {

    private IAdministrationDao dao = new ImpAdministrationDao();

    @Override
    public Administration find(String username) {
        return dao.find(username);
    }

    @Override
    public boolean check(Administration user) {
        return dao.check(user);
    }

    @Override
    public void save(Administration user) {
        dao.save(user);
    }

}
