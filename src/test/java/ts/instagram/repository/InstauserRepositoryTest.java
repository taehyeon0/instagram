package ts.instagram.repository;

// JUnit5 사용 시 작성, MybatisTest 2.0.1버전 이상에서 생략 가능
// @ExtendWith(SpringExtension.class)
// JUnit4 사용 시 작성
// @RunWith(SpringRunner.class)

// @MybatisTest 어노테이션 추가

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ts.instagram.domain.Feed;
import ts.instagram.domain.Instauser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MyBatis 연결 테스트") // 해당 테스트 케이스에 대한 이름을 제공 , 테스트 실행 결과에서 이 이름이 사용
@Slf4j //  Lombok 라이브러리의 어노테이션으로, 간단한 로깅을 위해 사용
@Transactional // 트랜잭션 처리를 지원, 테스트 중에 데이터베이스 트랜잭션을 롤백하는 데 사용
@SpringBootTest // 테스트용 애플리케이션 컨텍스트를 설정
public class InstauserRepositoryTest {
    //@Autowired
    //의존성 주입(Dependency Injection)을 수행하는 데에 활용
    //스프링 컨테이너가 객체들 간의 의존 관계를 설정해주는 디자인 패턴
    //객체 간의 결합도를 낮추고 코드의 유연성과 재사용성을 향상
    //생성자, 세터 메서드, 필드에 사용 가능
    @Autowired
    InstauserRepository instauserRepository;

    @DisplayName("instauser Mapper Select Test")
    @Test //해당 메서드가 JUnit 테스트로 실행
    public void mybatis_Mapper_XML_Test() throws Exception {

        /*// given
        String seq = "1";

        // when
        User user = userMapper.getUser(seq);

        // then
        assertThat(user.userId).isEqualTo("1");*/

        List<Instauser> result = instauserRepository.selectAll();
        log.info("result={}", result);

        // then
        assertThat(result).isNotEmpty();


    }

    public void insertInstauser(){

        /*long previousCount = feedRepository.selectAll().stream().count();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Feed feed = new Feed(2, 0, "abc", LocalDateTime.parse("2021-05-30 23:53:46", formatter), "than", LocalDateTime.parse("2021-05-30 23:53:46", formatter), "than");

        // when
        feedRepository.save(feed);

        // then
        assertThat(feedRepository.selectAll().stream().count()).isEqualTo(previousCount + 1);*/

    }


}
