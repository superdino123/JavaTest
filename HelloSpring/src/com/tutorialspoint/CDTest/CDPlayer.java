package com.tutorialspoint.CDTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		// TODO 自动生成的方法存根
		cd.play();
	}
	
	@Autowired(required=false)
	public void setCompactDisc(CompactDisc cd) {
		// required 默认为true,当没有装配成功时，抛出异常；设置为false时，如果没有装配成功不抛出异常，变量为null
		
		this.cd = cd;
	}
}