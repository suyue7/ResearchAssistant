package org.example.researchassistant;

import org.example.researchassistant.entity.Paper;
import org.example.researchassistant.service.PaperService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PaperServiceTest {

    @Autowired
    private PaperService paperService;

    @Test
    public void testSelectAllPapers() {
        List<Paper> papers = paperService.list();
        assertNotNull(papers);
        System.out.println("查询到的论文数量：" + papers.size());
    }

    @Test
    public void testInsertPaper() {
        Paper paper = new Paper();
        paper.setTitle("Test Paper Title");
        paper.setAuthors("Author1, Author2");
        paper.setAbstractText("This is a test abstract.");
        paper.setSubmissionDate(LocalDate.now().toString());
        paper.setPdfLink("http://example.com/test.pdf");

        boolean saved = paperService.save(paper);
        assert saved;
        System.out.println("新增论文成功，ID：" + paper.getPaperId());
    }

    @Test
    public void testUpdatePaper() {
        Paper paper = paperService.getById(1L);
        if (paper != null) {
            paper.setTitle("Updated Paper Title");
            boolean updated = paperService.updateById(paper);
            assert updated;
            System.out.println("更新论文成功！");
        } else {
            System.out.println("没有找到 ID 为 1 的论文，无法测试更新。");
        }
    }

    @Test
    public void testDeletePaper() {
        boolean deleted = paperService.removeById(2L);
        assert deleted;
        System.out.println("删除论文成功！");
    }
}
