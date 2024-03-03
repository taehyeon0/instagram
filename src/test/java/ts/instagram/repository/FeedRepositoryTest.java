package ts.instagram.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ts.instagram.domain.Feed;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


@DisplayName("MyBatis 연결 테스트")
@Slf4j
@Transactional
@SpringBootTest
class FeedRepositoryTest {

    @Autowired
    FeedRepository feedRepository;

    @DisplayName("select 테스트")
    @Test
    void givenTestData_whenSelecting_thenWorksFine() {
        // given

        // when
        List<Feed> result = feedRepository.selectAll();
        log.info("result={}", result);

        // then
        assertThat(result).isNotEmpty();
    }

    @DisplayName("insert 테스트")
    @Test
    void givenTestData_whenInserting_thenWorksFine() {
        // given
        long previousCount = feedRepository.selectAll().stream().count();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Feed feed = new Feed(2, 0, "abc", LocalDateTime.parse("2021-05-30 23:53:46", formatter), "than", LocalDateTime.parse("2021-05-30 23:53:46", formatter), "than");

        // when
        feedRepository.save(feed);

        // then
        assertThat(feedRepository.selectAll().stream().count()).isEqualTo(previousCount + 1);
    }
}