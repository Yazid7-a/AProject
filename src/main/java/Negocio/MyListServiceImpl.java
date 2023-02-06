/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Mylist;
import datos.MylistDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class MyListServiceImpl implements MylistService {

    @Inject
    private MylistDao InterfazMylist;
    
    @Override
    public List<Mylist> findAllMylist() {
        return InterfazMylist.findAllMylist();
    }

    @Override
    public Mylist findMylistByID(Mylist mylist) {
        return InterfazMylist.findMylistByID(mylist);
    }

    @Override
    public Mylist findMylistByUser(Mylist mylist) {
        return InterfazMylist.findMylistByUser(mylist);
    }

    @Override
    public void insert(Mylist mylist) {
        InterfazMylist.insert(mylist);
    }

    @Override
    public void updateMylist(Mylist mylist) {
        InterfazMylist.updateMylist(mylist);
    }

    @Override
    public void deleteMylist(Mylist mylist) {
        InterfazMylist.deleteMylist(mylist);
    }
    
}
