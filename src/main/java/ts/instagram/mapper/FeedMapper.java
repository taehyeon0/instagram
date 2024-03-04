package ts.instagram.mapper;

import org.apache.ibatis.annotations.Mapper;
import ts.instagram.domain.Feed;

import java.util.List;

@Mapper
public interface FeedMapper {
    void save(Feed feed);
    void delete(long id);
    void update(Feed feed);
    Feed selectById(long id);
    List<Feed> selectAll();
}
