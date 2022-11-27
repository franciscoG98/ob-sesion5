public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        Coche coche1 = new Coche();

        cocheCrud.save(coche1);
        cocheCrud.findAll();
        cocheCrud.delete(coche1);

    }
}