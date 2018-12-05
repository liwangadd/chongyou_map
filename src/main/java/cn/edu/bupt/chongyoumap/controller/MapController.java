package cn.edu.bupt.chongyoumap.controller;

import cn.edu.bupt.chongyoumap.pojo.po.Topic;
import cn.edu.bupt.chongyoumap.pojo.vo.SubmitPostVo;
import cn.edu.bupt.chongyoumap.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("submit-post")
    public String submitPostView(ModelMap resMap) {
        List<Topic> topics = this.mapService.queryAllTopics();
        List<SubmitPostVo> vos = topics.stream().map(t->{
            SubmitPostVo v=new SubmitPostVo();
            v.setId(t.getId());
            v.setTitle(t.getTitle());
            return v;
        }).collect(Collectors.toList());
        resMap.put("topics", vos);
        return "submit-post";
    }

}
