/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Administration;

/**
 *
 * @author ADMIN
 */
public interface IAdministrationService {

    boolean check(Administration user);

    void save(Administration user);
    Administration find(String username);
}
