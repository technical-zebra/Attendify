package com.azakatz.attendancemanager.adapters.database.dataaccess;

import com.azakamu.attendancemanager.adapters.database.datatransfer.entities.ExamDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamDao extends JpaRepository<ExamDto, Long> {

}
