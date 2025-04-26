package org.example.researchassistant;

import org.example.researchassistant.entity.User;
import org.example.researchassistant.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectAllUsers() {
        List<User> users = userService.list();
        assertNotNull(users);
        System.out.println("查询到的用户数量：" + users.size());
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUserName("test_user2");
        user.setUserPassword("123456");
//        user.setUserPic("http://example.com/avatar.jpg");

        boolean saved = userService.save(user);
        assert saved;
        System.out.println("新增用户成功，ID：" + user.getUserId());
    }

    @Test
    public void testUpdateUser() {
        // 假设你数据库里有个ID为1的用户
        User user = userService.getById(1L);
        if (user != null) {
            user.setUserName("updated_name");
            boolean updated = userService.updateById(user);
            assert updated;
            System.out.println("更新用户成功！");
        } else {
            System.out.println("没有找到 ID 为 1 的用户，无法测试更新。");
        }
    }

    @Test
    public void testDeleteUser() {
        // 删除ID为2的用户（注意防止误删）
        boolean deleted = userService.removeById(2L);
        assert deleted;
        System.out.println("删除用户成功！");
    }
}
