/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.encryptdecryptmanualTest;

import com.edward.encryptdecrypt.EncryptDecrypt;

/**
 *
 * @author ext_ealinares
 */
public class EncryptDecryptTest {

    public static void main(String[] args) throws Exception {

        //Name of the properties file that needs encryption
        //String propertyFileName = "resources/properties/application.properties";
        String propertyFileName = "properties/application.properties";
        //Key portion of the properties the left hand side
        String userPwdKey = "database.user.password";
        //Key in the properties file that will tell us if the password is already encrypted or not
        String isPwdEcnryptedKey = "is.database.user.password.encrypted";

        EncryptDecrypt app = new EncryptDecrypt(propertyFileName, userPwdKey, isPwdEcnryptedKey);
        
        String result = app.decryptedUserPassword;
        
        System.out.println(String.format("Showing password %s", result));
        
        

    }

}
