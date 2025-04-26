package org.example.researchassistant;

import org.example.researchassistant.entity.UserResource;
import org.example.researchassistant.service.UserResourceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserResourceServiceTest {

    @Autowired
    private UserResourceService userResourceService;

    @Test
    public void testSelectAllResources() {
        List<UserResource> resources = userResourceService.list();
        assertNotNull(resources);
        System.out.println("查询到的用户资源数量：" + resources.size());
    }

    @Test
    public void testInsertResource() {
        UserResource resource = new UserResource();
        resource.setUserId(1L);
        resource.setContent("This is a test resource.");
        resource.setTime(LocalDateTime.now().toString());

        boolean saved = userResourceService.save(resource);
        assert saved;
        System.out.println("新增资源成功，ID：" + resource.getResourceId());
    }

    @Test
    public void testUpdateResource() {
        UserResource resource = userResourceService.getById(1L);
        if (resource != null) {
            resource.setContent("Updated resource content.");
            boolean updated = userResourceService.updateById(resource);
            assert updated;
            System.out.println("更新资源成功！");
        } else {
            System.out.println("没有找到 ID 为 1 的资源，无法测试更新。");
        }
    }

    @Test
    public void testDeleteResource() {
        boolean deleted = userResourceService.removeById(2L);
        assert deleted;
        System.out.println("删除资源成功！");
    }
}
