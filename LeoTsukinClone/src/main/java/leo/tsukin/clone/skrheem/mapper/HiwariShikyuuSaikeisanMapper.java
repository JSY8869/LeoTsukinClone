package leo.tsukin.clone.skrheem.mapper;

import org.apache.ibatis.annotations.Select;

import leo.tsukin.clone.skrheem.domain.HiwariShikyuuSaikeisanVO;

public interface HiwariShikyuuSaikeisanMapper {
	
	@Select("SELECT ssk.JITSU_KINMU_NISSU, ssk.KATAMICHI_KIN\r\n" + 
			"        FROM shinsei_start_keiro ssk\r\n" + 
			"        JOIN shinsei s \r\n" + 
			"        ON ssk.kigyo_cd = s.kigyo_cd \r\n" + 
			"        AND ssk.shinsei_no = s.shinsei_no")
	HiwariShikyuuSaikeisanVO getInfo();
	
	
	public String getTime();
}
