package four;

import four.exceptions.NationalIdException;

/**
 * *Developer: ALireza Abolhasani
 * 2/13/2024
 * 5:51 PM
 **/


public class Customer {
    private String name;
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) throws NationalIdException {
        String idSTR= String.valueOf(id);
        if(idSTR.length()<10 || idSTR.length()>10){
            throw new NationalIdException("Error In NationalID");
        }else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getCustInfo(String name){
        System.out.println(name);
    }
}
