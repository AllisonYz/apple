/**
 * 财务入账逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Finance;

/**
 * @author ye
 * @date 2016/4/20
 */
public interface IFinanceService {
	/**
	 * 增加财务入账
	 */
	public void createFinance(Finance finance);
	
	/**
	 * 删除财务入账
	 */
	public void deleteFinance(Integer fid);
	
	/**
	 * 更新财务入账
	 */
	public void updateFinance(Finance finance);
	
	/**
	 * 查找财务入账
	 */
	public void findFinance();
	
	/**
	 * 分页查找财务入账
	 * @param pageInfo
	 * @return
	 */
	public List<Finance> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找财务入账
	 * @param fid
	 * @return
	 */
	public Finance findFinanceById(Integer fid);
}