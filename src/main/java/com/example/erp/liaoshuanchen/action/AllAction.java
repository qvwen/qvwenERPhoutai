package com.example.erp.liaoshuanchen.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.liaoshuanchen.biz.AllBiz;
import com.example.erp.liaoshuanchen.pojo.SellquoteLsc;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lsc/api")
public class AllAction {

	@Autowired
	private AllBiz biz;
	
	/**
	 * 销售报价，分页查询一条记录
	 * @param pageNum
	 * @return
	 */
	@GetMapping("sellquoteLsc/{pageNum}")
	public PageInfo<SellquoteLsc> findSaleByPage(@PathVariable("pageNum") Integer pageNum) {
		return biz.findSaleByPage(pageNum);
	}
	
	
	/**
	 * 销售报价，删除主表并且删除从表
	 * @param billno
	 * @return
	 */
	@DeleteMapping("sellquoteLsc/{billno}")
	public Map<String,String> selectAll22(@PathVariable String billno) {
		Map<String,String> message=new HashMap<String,String>();
		System.out.println("输出单号："+billno);
		int count1=biz.updateCheckstate(billno);
		if(count1!=0) {
			message.put("code","200");
			message.put("msg","删除成功！");
		}else {
			message.put("code","500");
			message.put("msg","删除失败!");
		}
		return message;
	}
	
	
	/**
	 * 销售报价新增方法
	 * @param stockOrder
	 * @return
	 */
	@PostMapping("sellquoteLsc")
	public Map<String,String> insertSellquoteLsc(@RequestBody SellquoteLsc sellquoteLsc) {
		Map<String,String> message=new HashMap<String,String>();
		sellquoteLsc.setEnables(2);
		sellquoteLsc.setCheckstate(2);
		int count1=biz.sellqupdate(sellquoteLsc);
		if(count1!=0) {
			System.out.println("单号："+sellquoteLsc.getBillid()+"新增成功");
			message.put("code","200");
			message.put("msg","新增成功！");
		}else {
			System.out.println("单号："+sellquoteLsc.getBillid()+"新增失败");
			message.put("code","500");
			message.put("msg","新增失败!");
		}
		return message;
	}
	
	/**
	 * 修改，先删再增
	 * @param stockOrder
	 * @return
	 */
	@PutMapping("sellquoteLsc")
	public Map<String,String> updateSellquoteLsc(@RequestBody SellquoteLsc sellquoteLsc) {
		Map<String,String> message=new HashMap<String,String>();
		//删除方法
		if(biz.sellqdelete2(sellquoteLsc.getBillid())!=0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
		int count1=biz.sellqinsert(sellquoteLsc);
		if(count1!=0) {
			System.out.println("单号："+sellquoteLsc.getBillid()+"修改成功");
			message.put("code","200");
			message.put("msg","修改成功！");
		}else {
			System.out.println("单号："+sellquoteLsc.getBillid()+"修改失败");
			message.put("code","500");
			message.put("msg","修改失败!");
		}
		message.put("code","200");
		message.put("msg","修改成功！");
		return message;
	}
}
