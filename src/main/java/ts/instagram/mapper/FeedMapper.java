package ts.instagram.mapper;

import org.apache.ibatis.annotations.Mapper;
import ts.instagram.domain.Feed;

import java.util.List;

@Mapper
public interface FeedMapper {
    void save(Feed feed);
    Feed selectById(int id);
    List<Feed> selectAll();
}
