package com.zerobase.fastlms.course.mapper;

import com.zerobase.fastlms.course.dto.CourseDto;
import com.zerobase.fastlms.admin.model.CommonParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {


    long selectListCount(CommonParam parameter);
    List<CourseDto> selectList(CommonParam parameter);
}
