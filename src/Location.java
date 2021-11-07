
public class Location extends Area
{
	private String[] flags;
	private boolean inShuffle;
	
	public Location(String name, boolean inShuffle) {super(name); this.inShuffle = inShuffle;}
	
	public String[] getFlag() {return flags;}
	
	public boolean inShuffle() {return inShuffle;}
	
	public void setFlags(String[] f) {flags = f;}
}
