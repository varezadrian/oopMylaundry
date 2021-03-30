/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Abu Rijal
 */
public class model_Login {
    private char UserName;
    private char Password;

    public model_Login(char UserName, char Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    
    
    public void model_Login(String UserName, String Password){
        if (UserName.equals("Admin") && Password.equals("Admin")){
            System.out.println("Login Berhasil");
        }
        else if (txt_name.getText().equals(rs.getString("username")) && txt_pass.getText().equals(rs.getString("password"))){
            System.out.println("Berhasil Login");
            
            try {
            sql = "SELECT * FROM admin WHERE username='"+txt_name.getText()+"' AND password='"+txt_pass.getText()+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if(txt_name.getText().equals(rs.getString("username")) && txt_pass.getText().equals(rs.getString("password"))){
                    System.out.println("Berhasil Login");
                }
                
        
        }
            
        else{
            System.out.println("User Name dan Password Salah!!"); 
        }
    }

    /**
     * @return the UserName
     */
    public char getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(char UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Password
     */
    public char getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(char Password) {
        this.Password = Password;
    }
    
    
}
