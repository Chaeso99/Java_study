package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMgr {
	
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();
	}

	//모든 리스트:select -db1
	public Vector<MemberBean> selectAll(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();//SQL문 실행
			while(rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setId(rs.getInt("id"));//컬럼명
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setAddress(rs.getString("address"));
				bean.setTeam(rs.getString("team"));
				vlist.addElement(bean);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	//저장:insert - db2
	public boolean insert(MemberBean bean)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert tblMember values(null,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,  bean.getName());//첫번째 물음표에 매개변수로 들어온 bean의 name값 세팅:'aaa' 
			pstmt.setString(2,  bean.getPhone());
			pstmt.setString(3,  bean.getAddress());
			pstmt.setString(4,  bean.getTeam());
			
			//insert, update, delete 적용된 레코드 개수 리턴(성공하면 1, 문제있으면 0)
			int cnt = pstmt.executeUpdate();
			if(cnt==1) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//한개의 레코드:select -db1
	
	//수정:update -db2
	
	//삭제:delete -db2
	
	//주소검색(우편번호 검색):select -db1
	public Vector<ZipcodeBean> zipcodeSearch(String area3){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblZipcode "
					+ "where area3 like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+area3+"%");//like '%강남대로%'
			rs = pstmt.executeQuery();//쿼리문 실행결과를 받아옴
			while(rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				//select 뒤에 가져오는 컬럼의 index(1번부터 시작)
				bean.setZipcode(rs.getString(1));
				bean.setArea1(rs.getString(2));
				bean.setArea2(rs.getString(3));
				bean.setArea3(rs.getString(4));
				vlist.addElement(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	
	
	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		MemberBean bean = new MemberBean();
		bean.setName("강동호");
		bean.setPhone("010-1134-5678");
		bean.setAddress("부산시 연제구");
		bean.setTeam("대");
	    //boolean flag = mgr.insert(bean);
	    //System.out.println(flag);
		Vector<MemberBean> vlist = mgr.selectAll();
		for (int i = 0; i < vlist.size(); i++) {
			MemberBean bean1 = vlist.get(i);
			System.out.println(bean1.getId() + "\t"
			+ bean1.getName()+"\t"
			+bean1.getPhone() + "\t"
			+bean1.getAddress() + "\t"
			+bean1.getTeam());
		}
	}
}