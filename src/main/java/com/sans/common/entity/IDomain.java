package com.sans.common.entity;

import java.io.Serializable;
import java.util.Date;

public abstract interface IDomain extends Serializable {
	public abstract Date getCreateDate();

	public abstract void setCreateDate(Date paramDate);

	public abstract Date getUpdateDate();

	public abstract void setUpdateDate(Date paramDate);

	public abstract Date getDeleteDate();

	public abstract void setDeleteDate(Date paramDate);

	public abstract String getCreateUserLabel();

	public abstract void setCreateUserLabel(String paramString);

	public abstract String getUpdateUserLabel();

	public abstract void setUpdateUserLabel(String paramString);

	public abstract String getDeleteUserLabel();

	public abstract void setDeleteUserLabel(String paramString);

	public abstract Integer getRecordVersion();

	public abstract void setRecordVersion(Integer paramInteger);
	
	public abstract String getTenantId();

	public abstract void setTenantId(String tenantId);
}
