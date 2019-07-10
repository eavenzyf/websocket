package com.websocket.demo.Controller;

import com.websocket.demo.WebSocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Classname InfoController
 * @Description TODO
 * @Date 2019/7/10 15:05
 * @Created by Eaven
 */
@RestController
public class InfoController {
    @Autowired
    WebSocketServer server;
    @PostMapping("login")
    public String login(String username,String password) throws Exception{
        server.sendInfo(username + "进入了聊天室!");
        return username;
    }
    @RequestMapping("")
    public ModelAndView showIndex(){
        System.out.println("controller");
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
