package com.example.demo.mapper;

import com.example.demo.models.Activity;
import com.example.demo.models.ActivityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ActivityMapper {

    ActivityDto activityToDto(Activity activity);
}
