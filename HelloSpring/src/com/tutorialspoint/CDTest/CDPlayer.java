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
		// TODO �Զ����ɵķ������
		cd.play();
	}
	
	@Autowired(required=false)
	public void setCompactDisc(CompactDisc cd) {
		// required Ĭ��Ϊtrue,��û��װ��ɹ�ʱ���׳��쳣������Ϊfalseʱ�����û��װ��ɹ����׳��쳣������Ϊnull
		
		this.cd = cd;
	}
}