package demo.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName:ConsumService
 * @Description //TODO
 * @Author: chenyunxuan
 * @Date: 2020/5/14 10:36 下午
 * @version: 1.0.0
 **/

@FeignClient(value = "book-crud-sca-provider-config",fallback = SentinelExceptionHandler.class)
public interface ConsumService {
    @RequestMapping("/alibaba/getBook/111")
    public String getNmae(@RequestParam("name")  String name);
}
