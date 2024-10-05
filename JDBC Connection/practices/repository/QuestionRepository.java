package com.techatpark.practices.repository;

import com.techatpark.practices.model.Questions;
import org.springframework.data.repository.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Optional;

public class QuestionRepository implements CrudRepository<Questions, Long> {

    private final DataSource dataSource;

    public QuestionRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public <S extends Questions> S save(S entity) {

        Questions questions = new Questions();

        String query = "INSERT"

        return null;
    }

    @Override
    public <S extends Questions> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Questions> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Questions> findAll() {
        return null;
    }

    @Override
    public Iterable<Questions> findAllById(Iterable<Long> longs) {
        return null;
    }

    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Questions entity) {

    }


    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Questions> entities) {

    }


    @Override
    public void deleteAll() {

    }
}
