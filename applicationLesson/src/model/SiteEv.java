package model;

import java.io.Serializable;

public class SiteEv implements Serializable{
	private int like;
	private int dislike;

	public SiteEv() {
		// TODO 自動生成されたコンストラクター・スタブ
		like=0;
		dislike=0;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like=like;
	}

	public int getDislike() {
		return dislike;
	}
	public void setDislike(int dislike) {
		this.dislike=dislike;
	}

}
