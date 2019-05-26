package com.yy.mapper;

import java.util.List;

import com.yy.pojo.Users;
import com.yy.pojo.vo.FriendRequestVO;
import com.yy.pojo.vo.MyFriendsVO;
import com.yy.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}