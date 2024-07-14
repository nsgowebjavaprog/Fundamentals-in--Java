//package Bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getter & setter

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

}
public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "Nagaraj Loni";
        acc.email = "nagarajloni@gmail.com";
        //acc.password = "as12";  // private show error to solve using
                               // getter and setter
    
        acc.setPassword("as12");     
        System.out.println(acc.getPassword());                 
    }
}
