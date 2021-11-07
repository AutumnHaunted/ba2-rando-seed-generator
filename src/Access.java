
public class Access {
	private Area to;
	private String[] reqs;
	
	public Access(Area to, String[] reqs) {this.to = to; this.reqs = reqs;}
	
	public Area getTo() {return to;}
	
	public String[] getReqs() {return reqs;}
}
