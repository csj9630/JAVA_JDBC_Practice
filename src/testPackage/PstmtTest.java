package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kr.co.sist.pstmt.dao.PstmtMemberDAO;
import kr.co.sist.pstmt.service.PstmtMemberService;
import kr.co.sist.statement.dto.MemberDTO;

class PstmtTest {

	@Disabled
	@DisplayName ("DAO-회원정보 추가")
	@Test
	void testDAO() {
		PstmtMemberDAO pmDAO = new PstmtMemberDAO();
		MemberDTO mDTO = new MemberDTO(0, "민병조", 12, "남자", "010-58594-545", null);
		assertEquals(pmDAO.insertMember(mDTO), 1);//1이 성공.
	}

	@DisplayName("Service회원정보 추가테스트")
	@Test
	void testService() {
		PstmtMemberService pms = new PstmtMemberService();
		MemberDTO mDTO=new MemberDTO(0,"볼트론",5, "사자", "010-3662-3845", null);
		assertTrue(pms.addMember(mDTO));
	}
}//class
