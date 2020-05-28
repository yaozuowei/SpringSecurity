package com.sans.common.util;

/**
 * 
 * @author Super
 *
 */
public enum BizIdUtil {
	/**
	 * 
	 */
	INSTANCE;
	private BizIdGenerator bizId = null;
	private BizIdUtil() {
		bizId = new BizIdGenerator(0L, 0L);
	}
	
	/**
	 * 生成业务ID
	 * @return
	 */
	public synchronized String nextId() {
		return bizId.nextId();
    }
}
