package ts.instagram.config;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ts.instagram.mapper.FeedMapper;
import ts.instagram.mapper.InstauserMapper;
import ts.instagram.repository.FeedRepository;
import ts.instagram.repository.InstauserRepository;

@Configuration
@MapperScan(basePackages = "ts.instagram.mapper")
@RequiredArgsConstructor
public class MyBatisConfig {

    private final FeedMapper feedMapper;
    private final InstauserMapper instauserMapper;

    @Bean
    public FeedRepository feedRepository() {
        return new FeedRepository(feedMapper);
    }

    @Bean
    public InstauserRepository userRepository() {
        return new InstauserRepository(instauserMapper);
    }


}
