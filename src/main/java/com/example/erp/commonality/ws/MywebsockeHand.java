package com.example.erp.commonality.ws;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
@ServerEndpoint("/ws/talk/{userName}")
public class MywebsockeHand {
	private final static Map<String, Session> userMao = new ConcurrentHashMap<String, Session>();// 线程安全
	private String username;

	@OnOpen
	public void onOpen(Session session, @PathParam("userName") String userName) { // 只能在open中获取
		System.out.println("接受一个客户端:" + session.getId());
		System.out.println("用户名称:" + userName);
		username = userName;
		userMao.put(userName, session);
	}

	@OnClose
	public void OnClose(Session session) {
		System.out.println("失去一个客户端:" + session.getId());
		userMao.remove(this.username);
	}

	@OnMessage
	public void OnMessage(String mag, Session session) {
		System.out.println("接受一个客户端【" + session.getId() + "】信息:" + mag);
		// 回复[同步]
		// try {
		//// if(mag.equals("陈汉是谁")) {
		//// session.getBasicRemote().sendText("瞿文佳他就是一个弟弟");
		//// }else {
		//// session.getBasicRemote().sendText("汉少客服为你服务");
		//// }
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		if(!"ping".equals(mag)) {
	
		if (mag.lastIndexOf("#") != -1) {
			String[] cnts = mag.split("#");
			System.out.println(cnts[0]);
			this.senAlluser(cnts[0]);
		} else if (mag.lastIndexOf("@") != -1) {
			String[] cnts = mag.split("@");
			String cnts1 = cnts[0];
			cnts[0] = null;
			GetAlluser(cnts, cnts1);
		} else {
			try {
				session.getBasicRemote().sendText("汉少客服为你服务");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}else {
			
		}
		// 回复[异步]
		// session.getAsyncRemote();
	}

	private void senAlluser(String msg) {
		Map<String, String> map = new HashMap<String, String>();
		for (String keys : userMao.keySet()) {
			try {
				map.put("name", username);
				map.put("val", msg);
				userMao.get(keys).getBasicRemote().sendText(JSON.toJSONString(map));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				continue;
			}
		}
	}

	private void GetAlluser(String[] name, String msg) {
		System.out.println(JSON.toJSONString(name));
		Map<String, String> map = new HashMap<String, String>();
		for (String keys : userMao.keySet()) {
			for (String names : name) {
				try {
					if (keys.equals(names)) {
						map.put("name", username);
						map.put("val", msg);
						userMao.get(keys).getBasicRemote().sendText(JSON.toJSONString(map));
					} 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					continue;
				} 
			}

		}
	}

}
