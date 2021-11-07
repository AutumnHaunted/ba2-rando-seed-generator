import java.util.ArrayList;

public class Area {
	private String name;
	private ArrayList<Access> accs;
	private ArrayList<Access> locs;
	
	public Area(String name) {this.name = name; accs = new ArrayList<Access>(); locs = new ArrayList<Access>();}
	
	public String getName() {return name;}
	public ArrayList<Access> getAccs() {return accs;}
	public ArrayList<Access> getLocs() {return locs;}
	
	public void addAccess(Area to, String[] reqs) {accs.add(new Access(to, reqs));}
	public void addAccess(Area to, String[] reqs, boolean viceVersa) {accs.add(new Access(to, reqs)); if(viceVersa) {to.addAccess(this, reqs);}}
	public void addLocation(Location loc, String[] reqs) {locs.add(new Access(loc, reqs));}
}
