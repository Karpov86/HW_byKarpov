package by.karpov.transactions.dao;

public interface PersonDao<T> {

    boolean save(T entity);
    void read();
    boolean update(Long id, String string);
    boolean delete(Long id);
}
