package com.zy24.demo.Mapper;

import com.zy24.demo.Dto.FileDto;
import com.zy24.demo.domain.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface FileMapper {
    List<File> findAllFiles(FileDto fileDto);

    Integer queryFilesCount(FileDto fileDto);

    Integer newFile(File file);

    List<File> selectRelated(File file);

    Integer updateFile(File file);
}
