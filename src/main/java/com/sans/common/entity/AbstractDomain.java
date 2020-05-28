package com.sans.common.entity;



import com.sans.common.util.DateUtil;

import java.util.Date;

public abstract class AbstractDomain implements IDomain {
	private static final long serialVersionUID = 1L;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
	private String createUserLabel;
	private String updateUserLabel;
	private String deleteUserLabel;
	private Integer recordVersion;
	private String tenantId;

	@Override
	public Date getCreateDate() {
		return this.createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String getCreateUserLabel() {
		return this.createUserLabel;
	}

	@Override
	public void setCreateUserLabel(String createUserLabel) {
		this.createUserLabel = createUserLabel;
	}

	@Override
	public Date getDeleteDate() {
		return this.deleteDate;
	}

	@Override
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public String getDeleteUserLabel() {
		return this.deleteUserLabel;
	}

	@Override
	public void setDeleteUserLabel(String deleteUserLabel) {
		this.deleteUserLabel = deleteUserLabel;
	}

	@Override
	public Integer getRecordVersion() {
		return this.recordVersion;
	}

	@Override
	public void setRecordVersion(Integer recordVersion) {
		this.recordVersion = recordVersion;
	}

	@Override
	public Date getUpdateDate() {
		return this.updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String getUpdateUserLabel() {
		return this.updateUserLabel;
	}

	@Override
	public void setUpdateUserLabel(String updateUserLabel) {
		this.updateUserLabel = updateUserLabel;
	}
	
	@Override
	public String getTenantId() {
		return this.tenantId;
	}

	@Override
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public static void transfer(AbstractDomain from, AbstractDomain to) {
		to.setCreateDate(from.getCreateDate());
		to.setCreateUserLabel(from.getCreateUserLabel());
		to.setDeleteDate(from.getDeleteDate());
		to.setDeleteUserLabel(from.getDeleteUserLabel());
		to.setUpdateDate(from.getUpdateDate());
		to.setUpdateUserLabel(from.getUpdateUserLabel());
		to.setRecordVersion(from.getRecordVersion());
		to.setTenantId(from.getTenantId());
	}

	public void initial() {
		setCreateUserLabel(null);
		setUpdateUserLabel(null);
		setDeleteUserLabel(null);
		setCreateDate(null);
		setUpdateDate(null);
		setDeleteDate(null);
		setTenantId(null);
	}
	
	public void initAdd(String operator) {
		setCreateUserLabel(operator);
		setUpdateUserLabel(operator);
		setCreateDate(DateUtil.currentDate());
		setUpdateDate(DateUtil.currentDate());
	}
	
	public void initUpdate(String operator) {
		setUpdateUserLabel(operator);
		setUpdateDate(DateUtil.currentDate());
	}
	
	public void initLogicDel(String operator) {
		setDeleteUserLabel(operator);
		setDeleteDate(DateUtil.currentDate());
	}
}
