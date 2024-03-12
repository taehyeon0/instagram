package ts.instagram.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ts.instagram.domain.Feed;
import ts.instagram.domain.Instauser;
import ts.instagram.mapper.InstauserMapper;

import java.util.List;

@Slf4j

//@Repository
//스프링 컨테이너(ApplicationContext)가 해당 클래스를 빈(bean)으로 등록하고, 데이터 액세스 예외를 처리하는 데 도움을 줌
@Repository


//@RequiredArgsConstructor Lombok 어노테이션중 하나로 final 필드 또는 @NonNull 어노테이션이 붙은 필드를 인자로 받는 생성자가 생성
//해당 필드들을 매개변수로 받는 생성자가 자동으로 만들어지므로, 객체를 생성할 때 모든 필드를 반드시 제공해야 합니다.
//생성자 : OOP에서 클래스의 인스턴스를 생성할 때 호출되는 특수한 메서드 , 객체를 초기화 하기위함, 생성자를 통해 객체를 한번 설정하면 변경 불가
@RequiredArgsConstructor

public class InstauserRepository {
    private final InstauserMapper instauserMapper;
    /*public User getUser(String id) {
        return userMapper.selectById(id);
    }*/

    public List<Instauser> selectAll() {
        return instauserMapper.selectAll();
    }

    public void save(Instauser instauser) {
        instauserMapper.save(instauser);
    }

    public Instauser selectById(long id) {
        return instauserMapper.selectById(id);
    }
    public void update(Instauser instauser) {
        instauserMapper.update(instauser);
    }


}
