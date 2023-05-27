package dao;

import entities.Administration;

public interface IAdministrationDao {
    void save(Administration admin);
    Administration find(String login);
    boolean check(Administration admin);
}
