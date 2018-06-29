package com.example.erp.liaoshuanchen.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erp.liaoshuanchen.dao.SellquoteLscMapper;
import com.example.erp.liaoshuanchen.pojo.SellquoteLsc;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AllBiz {   // implements 

	//命名规则 类名简单的前缀加上功能名
	@Autowired
	private SellquoteLscMapper dao1;
	
	
	/**
	 * 用修改方法代替删除方法，查询所有方法已经修改成带条件查询（条件，是否删除状态为1）
	 * @param billid
	 * @return
	 */
	public int sellqdelete(String billid) {
		// TODO Auto-generated method stub
		return dao1.updateCheckstate(billid);
	}
	
	public int sellqdelete2(String billid) {
		// TODO Auto-generated method stub
		return dao1.deleteByPrimaryKey(billid);
	}
	
	public int sellqinsert(SellquoteLsc record) {
		// TODO Auto-generated method stub
		return dao1.insert(record);
	}

	
	public SellquoteLsc sellqselectByPrimaryKey(String billid) {
		// TODO Auto-generated method stub
		return dao1.selectByPrimaryKey(billid);
	}

	public PageInfo<SellquoteLsc> findSaleByPage(Integer pageNum) {
		System.out.println("进入分页方法");
		PageHelper.startPage(pageNum, 1);
		return new PageInfo<SellquoteLsc>(dao1.selectAll());
	}

	public int sellqupdate(SellquoteLsc record) {
		// TODO Auto-generated method stub
		return dao1.insert(record);
	}
	
	/**
	 * 用修改方法代替删除方法，查询所有方法已经修改成带条件查询（条件，是否删除状态为1）
	 * @param billid
	 * @return
	 */
	public int updateCheckstate(String billid) {
		// TODO Auto-generated method stub
		return dao1.updateCheckstate(billid);
	}

}
