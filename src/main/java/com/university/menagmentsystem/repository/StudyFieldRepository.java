package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.StudyField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyFieldRepository extends JpaRepository<StudyField, Long> {
    void  deleteById(Long id);
    StudyField getById(Long id);
}
