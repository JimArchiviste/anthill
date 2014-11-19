package ants;

import places.Site;

public class Position {
	
	private Site site;
	private int position;

	public Position(Site site, int position) {
		super();
		this.site = site;
		this.position = position;
	}

	public Site getSite() {
		return site;
	}

	public int getPosition() {
		return position;
	}

	public void add(int position) {
		this.position += position;
	}
	
	public void remove(int position) {
		this.position -= position;
	}
}
