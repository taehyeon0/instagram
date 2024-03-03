package ts.instagram.config;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ts.instagram.mapper.FeedMapper;
import ts.instagram.repository.FeedRepository;

@Configuration
@MapperScan(basePackages = "ts.instagram.mapper")
@RequiredArgsConstructor
public class MyBatisConfig {

    private final FeedMapper feedMapper;

    @Bean
    public FeedRepository feedRepository() {
        return new FeedRepository(feedMapper);
    }
}
