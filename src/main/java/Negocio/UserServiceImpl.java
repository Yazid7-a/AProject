/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.User;
import datos.UserDao;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao InterfazUser;
    
    @Override
    public List<User> findAllUser() {
        return InterfazUser.findAllUser();
    }

    @Override
    public User findUserByID(User user) {
        return InterfazUser.findUserByID(user);
    }

    @Override
    public User findUserByEmail(User user) {
        return InterfazUser.findUserByEmail(user);
    }

    @Override
    public void insert(User user) {
        InterfazUser.insert(user);
    }

    @Override
    public void updateUser(User user) {
        InterfazUser.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        InterfazUser.deleteUser(user);
    }
    
      @Override
    public boolean comprobar(User user){
        int num = this.InterfazUser.findAllUser().size();     //Lo he tenido que meter en una variable para que funcione...
        for (int i = 0; i < num; i++) {
            //System.out.println(seleccionar().size());
            if(this.InterfazUser.findAllUser().get(i).getEmail().equalsIgnoreCase(user.getEmail()) && this.InterfazUser.findAllUser().get(i).getPassword().equalsIgnoreCase(user.getPassword())){
                return true;
            }
        }
    return false;  
    }
    
    @Override
    public String cifrarMD5(String input) throws Exception {
        String md5 = null;
        if (null == input)
            return null;
        // Create MessageDigest object for MD5
        MessageDigest digest = MessageDigest.getInstance("MD5");
        // Update input string in message digest
        digest.update(input.getBytes(), 0, input.length());
        // Converts message digest value in base 16 (hex)
        md5 = new BigInteger(1, digest.digest()).toString(16);
        
        return md5;
    }
    
}
