package org.example.researchassistant.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.researchassistant.entity.Paper;
import org.example.researchassistant.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/papers")
public class PaperController {

    @Autowired
    private PaperService paperService;

    @GetMapping
    public List<Paper> getAllPapers() {
        return paperService.list();
    }

    @GetMapping("/{id}")
    public Paper getPaperById(@PathVariable Long id) {
        return paperService.getById(id);
    }

    @PostMapping
    public boolean addPaper(@RequestBody Paper paper) {
        return paperService.save(paper);
    }

    @PutMapping
    public boolean updatePaper(@RequestBody Paper paper) {
        return paperService.updateById(paper);
    }

    @DeleteMapping("/{id}")
    public boolean deletePaper(@PathVariable Long id) {
        return paperService.removeById(id);
    }
}
