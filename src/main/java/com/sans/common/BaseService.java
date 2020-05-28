package com.sans.common;


import com.github.pagehelper.PageHelper;
import com.sans.common.entity.IDomain;
import com.sans.common.entity.Page;
import com.sans.common.util.DateUtil;
import com.sans.common.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

public abstract class BaseService {

	public <T extends IDomain> void initModel(String operator, T t) {
		t.setCreateUserLabel(operator);
		t.setUpdateUserLabel(operator);
		t.setRecordVersion(Integer.valueOf(1));
		t.setCreateDate(DateUtil.currentDate());
		t.setUpdateDate(DateUtil.currentDate());
	}
	
	public <T extends IDomain> void updateModel(String operator, T t) {
		t.setUpdateUserLabel(operator);
		t.setRecordVersion(t.getRecordVersion()+1);
		t.setUpdateDate(DateUtil.currentDate());
	}
	public <T extends IDomain> void deleteModel(String operator, T t) {
		t.setDeleteUserLabel(operator);
		t.setRecordVersion(t.getRecordVersion()+1);
		t.setDeleteDate(DateUtil.currentDate());
	}

	/**
	 * 设置分页参数
	 * @param page
	 */
	public void setToPage(Page page){
		if (page != null) {
			PageHelper.startPage(page.getPageNum(), page.getPageSize());
			String sortname = page.getSortname();
			String sortorder = page.getSortorder();
			String defaultOrder = page.getDefaultOrder();
			if (!StringUtil.isEmpty(sortname)) {
				PageHelper.orderBy(sortname + " " + sortorder);
			} else if (!StringUtil.isEmpty(defaultOrder)) {
				PageHelper.orderBy(defaultOrder);
			}
		}
	}


}
