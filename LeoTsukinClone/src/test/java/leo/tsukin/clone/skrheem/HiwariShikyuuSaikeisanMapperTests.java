package leo.tsukin.clone.skrheem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import leo.tsukin.clone.skrheem.domain.HiwariShikyuuSaikeisanVO;
import leo.tsukin.clone.skrheem.mapper.HiwariShikyuuSaikeisanMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HiwariShikyuuSaikeisanMapperTests {

    @Setter(onMethod_ = @Autowired)
    private HiwariShikyuuSaikeisanMapper mapper;

    @Test
    public void getInformation() {
    	//log.info(mapper.getTime());
    	HiwariShikyuuSaikeisanVO result = mapper.getInfo();
    	
    	
    	log.info("결과 : " + result);
    }
}
