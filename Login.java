package fr.dawan.formation.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login {
    private Map<String, String> users;

    public Login(){
    	users = new HashMap<String, String>();
        users.put("admin","Selenium&2018");
        users.put("jsmith","Selenium&2018");
        users.put("lsmith","Selenium&2018");
    }

    public Map<String, String> getUsers() {
    	return this.users;
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
