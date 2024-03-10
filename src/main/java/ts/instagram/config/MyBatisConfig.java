package ts.instagram.config;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ts.instagram.mapper.FeedMapper;
import ts.instagram.mapper.UserMapper;
import ts.instagram.repository.FeedRepository;
import ts.instagram.repository.UserRepository;

@Configuration
@MapperScan(basePackages = "ts.instagram.mapper")
@RequiredArgsConstructor
public class MyBatisConfig {

    private final FeedMapper feedMapper;
    private final UserMapper userMapper;

    @Bean
    public FeedRepository feedRepository() {
        return new FeedRepository(feedMapper);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository(userMapper);
    }

}
