package ts.instagram.mapper;

import org.apache.ibatis.annotations.Mapper;
import ts.instagram.domain.Feed;
import ts.instagram.domain.Instauser;

import java.util.List;

// @Mapper 어노테이션을 통한 mapper 등록
@Mapper
public interface InstauserMapper {

    // @Select, @insert 등의 어노테이션으로 xml 작성 없이 간단한 쿼리문을 날릴 수 있음.
    // @Select("Select * from orderbook where seq = #{seq}")
    //User getUser(@Param("seq") String seq);
    List<Instauser> selectAll();

    void save(Instauser instauser);


}