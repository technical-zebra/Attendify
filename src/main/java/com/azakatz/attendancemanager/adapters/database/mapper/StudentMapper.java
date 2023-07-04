package com.azakamu.attendancemanager.adapters.database.mapper;

import com.azakamu.attendancemanager.adapters.database.datatransfer.entities.StudentDto;
import com.azakamu.attendancemanager.domain.entities.Student;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(
    uses = {
        VacationMapper.class,
        ExamIdMapper.class})
public interface StudentMapper {

  Student toDomain(StudentDto studentDto);

  StudentDto toDto(Student student);

  List<Student> toDomainSet(List<StudentDto> studentDtos);
}
