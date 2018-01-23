package com.kkzhixia.po;

public class Article {
	/* 主键 */
	public String id;
	/* 标题 */
	public String title;
	/* 内容 */
	public String content;
	/* 分类 */
	public int type;
	/* 评论数 */
	public int pl;
	/* 查看数 */
	public int ck;
	/* 日期 */
	public String datetime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPl() {
		return pl;
	}

	public void setPl(int pl) {
		this.pl = pl;
	}

	public int getCk() {
		return ck;
	}

	public void setCk(int ck) {
		this.ck = ck;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	public Article(){
		
	} 

}
