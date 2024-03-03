package ts.instagram.mapper;

import org.apache.ibatis.annotations.Mapper;
import ts.instagram.domain.Feed;

@Mapper
public interface FeedMapper {
    Feed selectById(int id);
    Feed selectAll();
}
