package com.azakamu.attendancemanager.adapters.database.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.azakamu.attendancemanager.adapters.database.datatransfer.values.ExamIdDto;
import com.azakamu.attendancemanager.domain.values.ExamId;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


public class ExamIdMapperUnitTests {

  ExamIdMapper mapper = Mappers.getMapper(ExamIdMapper.class);


  @Test
  void DomainToDtoTest1() {
    // arrange
    ExamId examId = ExamId.createDummy();

    // act
    ExamIdDto examIdDto = mapper.toDto(examId);

    // assert
    assertThat(examIdDto.getId()).isEqualTo(examId.id());

  }

  @Test
  void DtoToDomainTest1() {
    // arrange
    ExamIdDto examIdDto = mapper.toDto(ExamId.createDummy());

    // act
    ExamId examId = mapper.toDomain(examIdDto);

    // assert
    assertThat(examId).isEqualTo(ExamId.createDummy());
  }

  @Test
  void DomainSetToDtoSetTest1() {
    // arrange
    ExamId examId = new ExamId(1L);
    Set<ExamId> domainSet = Set.of(examId);

    // act
    Set<ExamIdDto> dtoSet = mapper.toDtoSet(domainSet);

    // assert
    assertThat(dtoSet.stream().toList().get(0).getId()).isEqualTo(1L);
  }

  @Test
  void DtoSetToDomainSetTest1() {
    // arrange
    ExamIdDto examIdDto = new ExamIdDto();
    examIdDto.setId(1L);
    Set<ExamIdDto> dtoSet = Set.of(examIdDto);

    // act
    Set<ExamId> domainSet = mapper.toDomainSet(dtoSet);

    // assert
    assertThat(domainSet.stream().toList().get(0).id()).isEqualTo(1L);
  }
}
