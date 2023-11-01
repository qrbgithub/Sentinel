package com.alibaba.csp.sentinel.dashboard.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Descriptioin
 * @Author RenBo.Qin
 * @Date 2023/11/1 10:59
 */
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosProperties {

	private String serverAddr;

	private String dataId;

	private String groupId;

	private String namespace;

	public String getServerAddr() {
		return serverAddr;
	}

	public void setServerAddr(String serverAddr) {
		this.serverAddr = serverAddr;
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
}
