<<<<<<< HEAD
package com.example.erp.wenwei.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.erp.wenwei.pojo.DsproductprodidEntity;
import com.example.erp.wenwei.vo.AllotVO;

public interface IAllotDao {
	
	public List<AllotVO> findAllMove();
	
	public List<DsproductprodidEntity> findProdByWare(@Param("WareID") String WareID);

	public int addMainMove(@Param("WareOutID") Integer wareoutid, @Param("WareInID") Integer wareinid,
			@Param("Permitter") Integer permitter, @Param("MoveDate") String moveDate, @Param("MoveNO") String moveno,
			@Param("MakerID") Integer makerid, @Param("MoveDetailNO") String movedetailno);

	public int addDetailMove(@Param("MoveNO") String moveno, @Param("ProdID") String prodid,
			@Param("Reason") String reason, @Param("MoveDetailNO") String movedetailno,
			@Param("MoveBillNO") String movebillno);
}
=======
package com.example.erp.wenwei.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.erp.wenwei.pojo.DsproductprodidEntity;
import com.example.erp.wenwei.vo.AllotVO;

public interface IAllotDao {
	
	public List<AllotVO> findAllMove();
	
	public List<DsproductprodidEntity> findProdByWare(@Param("WareID") String WareID);

	public int addMainMove(@Param("WareOutID") Integer wareoutid, @Param("WareInID") Integer wareinid,
			@Param("Permitter") Integer permitter, @Param("MoveDate") String moveDate, @Param("MoveNO") String moveno,
			@Param("MakerID") Integer makerid, @Param("MoveDetailNO") String movedetailno);

	public int addDetailMove(@Param("MoveNO") String moveno, @Param("ProdID") String prodid,
			@Param("Reason") String reason, @Param("MoveDetailNO") String movedetailno,
			@Param("MoveBillNO") String movebillno);
}
>>>>>>> parent of feee0d9... s
