package com.azakamu.attendancemanager.adapters.database.mapper;

import com.azakamu.attendancemanager.adapters.database.datatransfer.values.TimeframeDto;
import com.azakamu.attendancemanager.domain.values.Timeframe;
import org.mapstruct.Mapper;

@Mapper
public interface TimeframeMapper {

  Timeframe toDomain(TimeframeDto timeframeDto);

  TimeframeDto toDto(Timeframe timeframe);
}

