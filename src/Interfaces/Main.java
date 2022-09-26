package Interfaces;

public class Main {

    static CocheCRUD coche1 = new CocheCRUDMySQL();

    public static void main(String[] args) {


        Coche Coche = null;
        coche1.save(Coche);

        coche1.findAll();
        coche1.delete(Coche);

    }
}