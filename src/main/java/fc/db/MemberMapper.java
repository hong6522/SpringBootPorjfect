package fc.db;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberMapper {
	List<MemberDTO> mem(MemberDTO advcx);
	
	MemberDTO login(MemberDTO dto);
	
	int join(MemberDTO dto);
	
	int mem_modify(MemberDTO dto);
	
	MemberDTO myPage(MemberDTO dto);
	
	boolean idChk(MemberDTO dto);
}
