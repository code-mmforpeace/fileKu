package com.zy24.demo.Controller;

import com.zy24.demo.Dto.PageDto;
import com.zy24.demo.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private FileService fileService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name="pageIndex",defaultValue = "1")int pageIndex,
                        @RequestParam(name = "pageSize",defaultValue = "7") int pageSize,
                        @RequestParam(name = "search",required = false) String search){
        PageDto pageDto = fileService.getFileLists(search,pageIndex,pageSize);
        model.addAttribute("search",search);
        model.addAttribute("pageDto",pageDto);
        return "index";
    }


}
