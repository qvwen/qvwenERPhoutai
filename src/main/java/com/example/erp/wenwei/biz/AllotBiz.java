<<<<<<< HEAD
package com.example.erp.wenwei.biz;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.erp.wenwei.dao.IAllotDao;
import com.example.erp.wenwei.pojo.DsproductprodidEntity;
import com.example.erp.wenwei.vo.AllotVO;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AllotBiz {
	
	@Resource
	private IAllotDao dao;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addMove(Integer wareoutid, Integer wareinid, Integer permitter, String moveDate, String moveno,
			Integer makerid, String movedetailno) {
				return dao.addMainMove(wareoutid, wareinid, permitter, moveDate, moveno, makerid, movedetailno);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addDetail(String moveno, String prodid, String reason,  String movebillno, String movedetailno) {
		return dao.addDetailMove(moveno, prodid, reason, movedetailno, movebillno);
	}
	
	public List<AllotVO> findAllMove(){
		return dao.findAllMove();
	}
	
	public List<DsproductprodidEntity> findProdByWare(String wareid) {
		return dao.findProdByWare(wareid);
	}
}
=======
package com.example.erp.wenwei.biz;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.erp.wenwei.dao.IAllotDao;
import com.example.erp.wenwei.pojo.DsproductprodidEntity;
import com.example.erp.wenwei.vo.AllotVO;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AllotBiz {
	
	@Resource
	private IAllotDao dao;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addMove(Integer wareoutid, Integer wareinid, Integer permitter, String moveDate, String moveno,
			Integer makerid, String movedetailno) {
				return dao.addMainMove(wareoutid, wareinid, permitter, moveDate, moveno, makerid, movedetailno);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addDetail(String moveno, String prodid, String reason,  String movebillno, String movedetailno) {
		return dao.addDetailMove(moveno, prodid, reason, movedetailno, movebillno);
	}
	
	public List<AllotVO> findAllMove(){
		return dao.findAllMove();
	}
	
	public List<DsproductprodidEntity> findProdByWare(String wareid) {
		return dao.findProdByWare(wareid);
	}
}
>>>>>>> parent of feee0d9... s
