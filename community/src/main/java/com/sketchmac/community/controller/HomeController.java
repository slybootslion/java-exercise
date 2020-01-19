package com.sketchmac.community.controller;

import com.sketchmac.community.entity.DiscussPost;
import com.sketchmac.community.entity.Page;
import com.sketchmac.community.entity.User;
import com.sketchmac.community.service.DiscussPostService;
import com.sketchmac.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    protected UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page) {

        // 方法调用前，SpringMVC会自动把Page注入到Model中
        page.setRows(discussPostService.findDiscussPostRows(0));
        page.setPath("/index");

        List<DiscussPost> list = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        ArrayList<Map<String, Object>> al = new ArrayList<>();
        if (list != null) {
            for (DiscussPost post : list) {
                HashMap<String, Object> hm = new HashMap<>();
                hm.put("post", post);
                User user = userService.findUserById(post.getUserId());
                hm.put("user", user);
                al.add(hm);
            }
        }
        model.addAttribute("discussPosts", al);
        return "/index";
    }

}
