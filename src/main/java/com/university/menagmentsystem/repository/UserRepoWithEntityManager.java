package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepoWithEntityManager {
    private final EntityManager entityManager;

    public UserRepoWithEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<User> getById(final Long id) {
        User user = entityManager.find(User.class, id);
        return Optional.ofNullable(user);
    }

    public List<User> findAll() {
        return entityManager.createQuery("SELECT f FROM user f", User.class).getResultList();
    }

    public void delete(final User user) {
        entityManager.remove(user);
    }

    public void deleteById(final Long id) {
        entityManager.createQuery("DELETE FROM user u WHERE u.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    public User createUser(final User user) {
        entityManager.persist(user);
        return user;
    }
}
