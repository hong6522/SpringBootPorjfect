package fc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fc.db.BasketDTO;
import fc.db.BasketMapper;
import fc.db.MemberDTO;
import fc.db.MemberMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;

@Controller
public class AjaxController {
	
	@Resource
	BasketMapper bm;
	
	@Resource
	MemberMapper mp;
	
	@RequestMapping("/ajax/loginSession")
	@ResponseBody
	String session_insert(@RequestParam("type")String type,HttpSession session) {
		System.out.println("세션타입: "+type);
		session.setAttribute("type", type);
		return ""+true;
	}
	
	@RequestMapping("/ajax/idChk")
	@ResponseBody
	String idChk(MemberDTO dto) {
		
		System.out.println(mp.idChk(dto));
		
		return "";
	}
	
	@RequestMapping("/ajax/addBasket")
	@ResponseBody
	String add_baskit(HttpSession session,BasketDTO dto) {
//		System.out.println("시작?");
//		
//		MemberDTO mDTO;
		if(session.getAttribute("id")!=null) {
//			mDTO = new MemberDTO();
//			mDTO.setEmail((String)session.getAttribute("id"));
//			MemberDTO member = mp.myPage(mDTO);
			
		dto.setAddress((String)session.getAttribute("address"));
		dto.setId((String)session.getAttribute("id"));
		System.out.println(dto);
		bm.add_basket(dto);
		}
		System.out.println(dto);
		
		return true+"";
	}
	
	
}
