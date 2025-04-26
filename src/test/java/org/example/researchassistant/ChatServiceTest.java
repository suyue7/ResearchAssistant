package org.example.researchassistant;

import org.example.researchassistant.entity.Chat;
import org.example.researchassistant.service.ChatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ChatServiceTest {

    @Autowired
    private ChatService chatService;

    @Test
    public void testSelectAllChats() {
        List<Chat> chats = chatService.list();
        assertNotNull(chats);
        System.out.println("查询到的聊天记录数量：" + chats.size());
    }

    @Test
    public void testInsertChat() {
        Chat chat = new Chat();
        chat.setUserId(1L);
        chat.setContent("This is a test chat message.");
        chat.setTime(LocalDateTime.now().toString());

        boolean saved = chatService.save(chat);
        assert saved;
        System.out.println("新增聊天成功，ID：" + chat.getChatId());
    }

    @Test
    public void testUpdateChat() {
        Chat chat = chatService.getById(1L);
        if (chat != null) {
            chat.setContent("Updated chat content.");
            boolean updated = chatService.updateById(chat);
            assert updated;
            System.out.println("更新聊天记录成功！");
        } else {
            System.out.println("没有找到 ID 为 1 的聊天记录，无法测试更新。");
        }
    }

    @Test
    public void testDeleteChat() {
        boolean deleted = chatService.removeById(2L);
        assert deleted;
        System.out.println("删除聊天记录成功！");
    }
}
