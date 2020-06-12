package com.zy24.demo.Service.impl;

import com.zy24.demo.Dto.FileDto;
import com.zy24.demo.Dto.PageDto;
import com.zy24.demo.Mapper.FileMapper;
import com.zy24.demo.Service.FileService;
import com.zy24.demo.domain.File;
import com.zy24.demo.utils.PageCalculator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileSerivceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public PageDto getFileLists(String search, int pageIndex, int pageSize) {
        PageDto<File> filePageDto = new PageDto<>();
        if(StringUtils.isNotBlank(search)){
            String[] fileNames = StringUtils.split(search," ");
            search = Arrays.stream(fileNames).collect(Collectors.joining("|"));
        }else {
            search = null;
        }
        FileDto fileDto1 = new FileDto();
        fileDto1.setSearch(search);
        Integer filesCount= fileMapper.queryFilesCount(fileDto1);
        filePageDto.setPageNum(filesCount,pageIndex,pageSize);
        if(pageIndex < 1)pageIndex = 1;
        if(pageIndex > filePageDto.getTotalPage())pageIndex = filePageDto.getTotalPage();
        Integer rowIndex = PageCalculator.calculateRowIndex(pageIndex, pageSize);
        FileDto fileDto = new FileDto();
        fileDto.setRowIndex(rowIndex);
        fileDto.setPageSize(pageSize);
        fileDto.setSearch(search);
        List<File> allFiles = fileMapper.findAllFiles(fileDto);
        filePageDto.setT(allFiles);
        filePageDto.setCount(filesCount);
        return filePageDto;
    }

    @Override
    public List<File> selectRelated(File file) {
        return null;
    }
}
