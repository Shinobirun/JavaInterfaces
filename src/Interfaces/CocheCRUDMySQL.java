package Interfaces;

import java.util.List;

public class CocheCRUDMySQL implements CocheCRUD{




    @Override
    public void save(Coche coche) {
        System.out.println("Se guardó Coche");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Se buscaron Coche");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Se borró Coche");
    }
}
