package ts.instagram.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ts.instagram.domain.Feed;
import ts.instagram.mapper.FeedMapper;

@Slf4j
@Repository
@RequiredArgsConstructor
public class FeedRepository {

    private final FeedMapper feedMapper;

    public Feed selectById(int id) {
        return feedMapper.selectById(id);
    }

    public Feed selectAll() {
        return feedMapper.selectAll();
    }
}
