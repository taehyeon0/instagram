package ts.instagram.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ts.instagram.domain.Feed;
import ts.instagram.mapper.FeedMapper;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class FeedRepository {

    private final FeedMapper feedMapper;

    public void save(Feed feed) {
        feedMapper.save(feed);
    }

    public Feed selectById(int id) {
        return feedMapper.selectById(id);
    }

    public List<Feed> selectAll() {
        return feedMapper.selectAll();
    }
}
