package qna.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import qna.dao.IQnaDao;
import qna.dao.QnaDaoImpl;
import util.SqlMapClientFactory;
import vo.PagingVO;
import vo.QnaVO;

public class QnaServiceImpl implements IQnaService{
	
//	Dao객체 생성
	private IQnaDao qnaDao;
	
//	SqlMapClient객체 생성
	private SqlMapClient smc;
	
//	Service static변수 생성
	private static IQnaService qnaService;
	
//	싱글톤으로 만들기 위한 생성자 숨기기
	private QnaServiceImpl() {
		qnaDao = QnaDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
//	겟인스턴스 만들기 : null일때만 객체생성
	public static IQnaService getInstance() {
		
		if(qnaService == null) {
			qnaService = new QnaServiceImpl();
		}
		
		return qnaService;
	}
	

	@Override
	public int insertQna(QnaVO qnaVO) {
		
		int cnt = 0;
		
		try {
			cnt = qnaDao.insertQna(smc, qnaVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
		
	}

	@Override
	public List<QnaVO> getQnaAll(PagingVO pagingVO) {
		
		List<QnaVO> qnaList = new ArrayList<QnaVO>();
		
		try {
			qnaList = qnaDao.getQnaAll(smc, pagingVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qnaList;
	}

	@Override
	public int updateQna(QnaVO qnaVO) {
		
		int cnt = 0;
		
		try {
			cnt = qnaDao.updateQna(smc, qnaVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
		
	}

	@Override
	public int deleteQna(String qnaCode) {
		
		int cnt = 0;
		
		try {
			cnt = qnaDao.deleteQna(smc, qnaCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
		
	}

	@Override
	public int getTotalCnt() {
		
		int cnt = 0;
		
		try {
			cnt = qnaDao.getTotalCnt(smc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
		
	}

	@Override
	public QnaVO getQna(String qnaCode) {
		
		QnaVO qnaVO = null;
		
		try {
			qnaVO = qnaDao.getQna(smc, qnaCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qnaVO;
	}

	@Override
	public String getMemNick(QnaVO qnaVO) {
		
		String memNick = "";
		
		try {
			memNick = qnaDao.getMemNick(smc, qnaVO);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return memNick;
	}

}
