package com.zking.service;


import com.zking.pojo.UserInfo;

public interface UserinfoService {
    
	//通过userinfoid查找管理员所有信息(dfw)
  	public UserInfo findByAllUser(int userinfoid);
  	//通过userinfoid查找管理员所有信息(dfw)
  	public boolean upuserinfobyuserinfoid(int userinfoid);
  	//通过userinfoid查找管理员所有信息(dfw)
  	public boolean upuserinfo(UserInfo userinfo);
}
