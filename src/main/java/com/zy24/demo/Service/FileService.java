package com.zy24.demo.Service;

import com.zy24.demo.Dto.PageDto;
import com.zy24.demo.domain.File;

import java.util.List;

public interface FileService {
    PageDto getFileLists(String search, int pageIndex, int pageSize);

    List<File> selectRelated(File file);
}
