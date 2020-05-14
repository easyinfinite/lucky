package demo.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName:SentinelExceptionHandler
 * @Description //TODO
 * @Author: chenyunxuan
 * @Date: 2020/5/14 10:40 下午
 * @version: 1.0.0
 **/
@Component
@Slf4j
public class SentinelExceptionHandler implements ConsumService {
    @Override
    public String getNmae(String name) {
        log.info("sentinel 熔断处理 {}", "SentinelExceptionHandler");
        return "Sentinel {由于你的访问次数太多，已为你限流、您已进入保护模式，请稍后再试！}>>>熔断处理函数";
    }
}
