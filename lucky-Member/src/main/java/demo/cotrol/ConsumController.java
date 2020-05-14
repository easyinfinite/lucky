package demo.cotrol;

import demo.server.ConsumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:ConsumController
 * @Description //TODO
 * @Author: chenyunxuan
 * @Date: 2020/5/14 10:34 下午
 * @version: 1.0.0
 **/
@RestController
@RequestMapping("/aonsum")
public class ConsumController {
    @Autowired
    private ConsumService consumService;

    @RequestMapping("/getNmae")
    public String getNmae(@RequestParam("name") String name) {
        String nmaes = consumService.getNmae(name);
        System.out.println(".......消费者fegin调用.....配置中心................." + nmaes);
        return nmaes;
    }
}
