package org.example.researchassistant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.researchassistant.entity.Chat;
import org.example.researchassistant.entity.User;
import org.example.researchassistant.mapper.ChatMapper;
import org.example.researchassistant.mapper.UserMapper;
import org.example.researchassistant.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements ChatService {
}
