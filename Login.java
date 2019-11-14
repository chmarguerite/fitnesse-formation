package fr.dawan.formation.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login {
    Map<String, String> users = new HashMap<String, String>();

    public Login(){
        users.put("admin","Selenium&2018");
        users.put("jsmith","Selenium&2018");
        users.put("lsmith","Selenium&2018");
    }



    public boolean connect(String identifiant, String password) {
        if(users.containsKey(identifiant)){
            if(users.get(identifiant).equals(password)){
                return true;
            }
        }
        return false;
    }

}
