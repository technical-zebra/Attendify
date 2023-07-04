package com.azakamu.attendancemanager.application.repositories;

import com.azakamu.attendancemanager.domain.entities.LogMessage;
import java.util.List;

public interface AdminRepository {

  List<LogMessage> findAll();

  LogMessage save(LogMessage message);

}
