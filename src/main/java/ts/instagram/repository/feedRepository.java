package ts.instagram.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ts.instagram.domain.Feed;

@Slf4j
@Repository
@RequiredArgsConstructor
public class feedRepository {

    public Feed insert(Feed feed) {


        return feed;
    }
}
