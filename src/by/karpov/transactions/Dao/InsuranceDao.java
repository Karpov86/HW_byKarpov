package by.karpov.transactions.dao;

public interface InsuranceDao <T, V> {

    boolean save(T entity1, V entity2);
    void read();
    boolean update(Long id, String string);
    boolean delete(Long id);
}
