package ts.instagram.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ts.instagram.domain.Feed;

import static org.assertj.core.api.Assertions.*;


@DisplayName("ByBatis 연결 테스트")
@Slf4j
@Transactional
@SpringBootTest
class FeedRepositoryTest {

    @Autowired
    FeedRepository feedRepository;

    @Test
    void findFeeds() {
        Feed result = feedRepository.selectAll();
        assertThat(result.getFeed_id()).isEqualTo(1);
        log.info("feed={}", result);
    }
}