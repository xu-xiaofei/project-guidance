package xu.xiaofei.autoconfigdemo.entity;

/**
 * @Author fei
 */

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

@Slf4j
public class EnvConfig implements EnvironmentAware {

    private final Logger logger = log;

    private Environment env;

    public String getStringValue(String key) {
        return env.getProperty(key);
    }

    public Long getLongValue(String key) {
        String value = getStringValue(key);
        try {
            return Long.parseLong(value);
        } catch (Exception e) {
            logger.error("字符串转换Long失败：{} = {}", key, value);
        }
        return 0L;
    }

    public int getIntValue(String key) {
        return getLongValue(key).intValue();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }

}
