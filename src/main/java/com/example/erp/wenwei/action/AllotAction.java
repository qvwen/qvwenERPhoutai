package com.example.erp.wenwei.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.wenwei.biz.AllotBiz;
import com.example.erp.wenwei.pojo.DsproductprodidEntity;
import com.example.erp.wenwei.vo.AllotVO;

@RestController
@RequestMapping("/allot")
public class AllotAction {

	@Resource
	private AllotBiz biz;

	@GetMapping("/findProdByWare/{wareid}")
	public List<DsproductprodidEntity> findProdByWare(@PathVariable String wareid) {
		return biz.findProdByWare(wareid);
	}

	@PostMapping("addMove/{moveno}/{prodid}/{reason}/{movebillno}/{movedetailno}/{wareoutid}/{wareinid}/{permitter}/{moveDate}/{makerid}")
	public int addMove(@PathVariable String moveno, @PathVariable String prodid, @PathVariable String reason,
			@PathVariable String movebillno, @PathVariable String movedetailno, @PathVariable Integer wareoutid,
			@PathVariable Integer wareinid, @PathVariable Integer permitter, @PathVariable String moveDate,
			@PathVariable Integer makerid) {
		String aaa=moveno;
		biz.addMove(wareoutid, wareinid, permitter, moveDate, aaa, makerid, movedetailno);
		biz.addDetail(moveno, prodid, reason, movebillno, movedetailno);
		return 1;
	}
}
<<<<<<< wen
<<<<<<< wen
<<<<<<< HEAD
=======
=======
package com.example.erp.wenwei.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.wenwei.biz.AllotBiz;
import com.example.erp.wenwei.pojo.DsproductprodidEntity;
import com.example.erp.wenwei.vo.AllotVO;

@RestController
@RequestMapping("/allot")
public class AllotAction {

	@Resource
	private AllotBiz biz;

	@GetMapping("/findProdByWare/{wareid}")
	public List<DsproductprodidEntity> findProdByWare(@PathVariable String wareid) {
		return biz.findProdByWare(wareid);
	}

	@PostMapping("addMove/{moveno}/{prodid}/{reason}/{movebillno}/{movedetailno}/{wareoutid}/{wareinid}/{permitter}/{moveDate}/{makerid}")
	public int addMove(@PathVariable String moveno, @PathVariable String prodid, @PathVariable String reason,
			@PathVariable String movebillno, @PathVariable String movedetailno, @PathVariable Integer wareoutid,
			@PathVariable Integer wareinid, @PathVariable Integer permitter, @PathVariable String moveDate,
			@PathVariable Integer makerid) {
		String aaa=moveno;
		biz.addMove(wareoutid, wareinid, permitter, moveDate, aaa, makerid, movedetailno);
		biz.addDetail(moveno, prodid, reason, movebillno, movedetailno);
		return 1;
	}
}
>>>>>>> parent of feee0d9... s
>>>>>>> refs/heads/master
=======
>>>>>>> ac531e3 Revert "Revert "s""
=======
>>>>>>> ac531e3 Revert "Revert "s""
