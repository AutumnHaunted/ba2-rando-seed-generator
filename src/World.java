import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class World
{
	private static ArrayList<Area> areas = new ArrayList<Area>(
		Arrays.asList(
			new Area("Title Screen"), new Area("Beach"), new Area("NE Plains"), new Area("Desert"), new Area("Mountain Pass"),
			new Area("Forest of Crappiness North"), new Area("Forest of Crappiness South"), new Area("Grassy Valley"),
			new Area("Pond Island"), new Area("Canyon South"), new Area("Canyon North"), new Area("NW Forest"),
			new Area("Twin Islands"), new Area("SW Plains"), new Area("Heavy Rocks Island"), 
			new Area("Small Waterfall"), new Area ("Big Waterfall"), new Area("Fake Overworld"), new Area("Whistle Warp"),

			new Area("Bonus Level Entrance"), new Area("Beach NE Open Cave"), new Area("Beach Bombable Cave"),
			new Area("Beach Open Tree"), new Area("Beach Valley Bushes Building"), new Area("Beach Valley Open Building"),
			new Area("Old Level 9 Entrance"), new Area("Level 1 West Entrance"), new Area("Level 1 East Entrance"),
			new Area("Level 1 Middle Entrance"), new Area("NE Plains Burnable Cave"), new Area("NE Plains Open Cave"),
			new Area("Level 2 Entrance"), new Area("Desert Open Stairs"), new Area("Level 3-1 Entrance"),
			new Area("Level 3-2 Entrance"), new Area("Level 3-3 Entrance"), new Area("Level 3-4 Entrance"),
			new Area("Level 3-5 Entrance"), new Area("Level 3-6 Entrance"), new Area("Level 3 Middle Entrance"),
			new Area("Mountain Pass Open Cave"), new Area("Level 4 Entrance"), new Area("Forest of Crappiness Open Cave"),
			new Area("Forest of Crappiness Stairs Under Rock"), new Area("Grassy Valley Open Building"),
			new Area("Grassy Valley Graveyard Stairs"), new Area("Canyon Open Stairs Past Tunnel"),
			new Area("Canyon Raft Maze Cave"), new Area("Level 5 Entrance"), new Area("NW Forest Bushes Building"),
			new Area("NW Forest Fairy Pond"), new Area("NW Forest Statue Mouth"), new Area("NW Forest Open Tree"),
			new Area("Central Bay Arrow Stairs"), new Area("Central Bay Open Stairs"), new Area("Level 8 NW Entrance"),
			new Area("Level 8 NE Entrance"), new Area("Level 8 SW Entrance"), new Area("Level 8 SE Entrance"),
			new Area("Western Sea Island Open Stairs"), new Area("Western Sea Bridge Cave"), new Area("Level 7 Entrance"),
			new Area("SW Plains Open Cave"), new Area("SW Plains Behind Stumps Statue Mouth"), new Area("SW Plains Lake Cave"),
			new Area("Level 6 Entrance"), new Area("Level 9 Entrance"), 

			new Area("Old Level 9 Zelda Room"), new Area("Old Level 9 Lobby"), new Area("Level 1 West"),
			new Area("Level 1 West Past Key Door"), new Area("Level 1 East"), new Area("Level 1 East Past Key Door"),
			new Area("Level 1 Middle"), new Area("Level 2"), new Area("Level 3-1"), new Area("Level 3-2"),
			new Area("Level 3-3"), new Area("Level 3-4"), new Area("Level 3-5"), new Area("Level 3-6"),
			new Area("Level 3-7 Lobby"), new Area("Level 3-7 Past 1 Key Door"), new Area("Level 3-7 Past 2 Key Doors"),
			new Area("Level 3-7 Past 3 Key Doors"), new Area("Level 4 Mountain"), new Area("Level 4 Clouds"),
			new Area("Level 5 Lower Maze"), new Area("Level 5 Upper Maze"), new Area("Level 5 Old Woman Room"),
			new Area("Level 5 Two Buttons Room"), new Area("Level 5 Goriya Room"), new Area("Level 5 One Button Room"),
			new Area("Level 5 Isolated Platform"), new Area("Level 5 Past All Key Doors"), new Area("Level 6"),
			new Area("Level 7 Early"), new Area("Level 7 Main"), new Area("Level 7 2F East"), new Area("Level 8 Left Shaft"),
			new Area("Level 8 Middle Left Shaft"), new Area("Level 8 Right Shaft"), new Area("Level 8 Main"), new Area("Bonus Level"),
			new Area("Level 9"),
			
			new Area("Five Hearts Guy"), new Area("Only Purpose Guy 1"), new Area("Bonshop"), new Area("Slash Arrow Hint"),
			new Area("Burgled Shop"), new Area("Only Purpose Guy 2"), new Area("Walk Forward Hint"), new Area("Pay for Hint"),
			new Area("Clouds Hint"), new Area("Forest of Crappiness Info"), new Area("Grassy Valley Maze Path Guy"),
			new Area("Super Bomb Shop 1"), new Area("Off-Color Mountainside Hint"), new Area("Trade Guy"), new Area("Raft Maze Info Cave"),
			new Area("Teh Smrat Bidkip Reward"), new Area("Cheat Code Reward"), new Area("Lens Hint"), new Area("Bonus Level Unlock Guy"),
			new Area("Go Away Maze Path Guy"), new Area("Sorry Shop"), new Area("Wallet Lady"), new Area("Only Purpose Guy 3"),
			new Area("Super Bomb Shop 2"), new Area("Peeing Guy"), new Area("PegLegArm")
		));
	private static ArrayList<String> normalEntrances = new ArrayList<String>(
		Arrays.asList(
				"Bonus Level Entrance", "Beach NE Open Cave", "Beach Open Tree", "Beach Valley Open Building", "Old Level 9 Entrance",
				"Level 1 West Entrance", "Level 1 East Entrance", "NE Plains Open Cave", "Level 2 Entrance", "Desert Open Stairs",
				"Level 3-1 Entrance", "Level 3-4 Entrance", "Level 3-6 Entrance", "Level 3 Middle Entrance", "Mountain Pass Open Cave",
				"Level 4 Entrance", "Forest of Crappiness Open Cave", "Grassy Valley Open Building", "Canyon Open Stairs Past Tunnel",
				"Canyon Raft Maze Cave", "Level 5 Entrance", "NW Forest Bushes Building", "NW Forest Statue Mouth", "NW Forest Open Tree",
				"Central Bay Open Stairs", "Level 8 NW Entrance", "Level 8 NE Entrance", "Level 8 SW Entrance", "Level 8 SE Entrance",
				"Western Sea Island Open Stairs", "SW Plains Open Cave", "SW Plains Lake Cave", "Level 6 Entrance", "Level 9 Entrance"
		));
	private static ArrayList<String> reqEntrances = new ArrayList<String>(
		Arrays.asList(
				"Beach Bombable Cave", "Beach Valley Bushes Building", "Level 1 Middle Entrance", "NE Plains Burnable Cave",
				"Level 3-2 Entrance", "Level 3-3 Entrance", "Level 3-5 Entrance", "Forest of Crappiness Stairs Under Rock",
				"Grassy Valley Graveyard Stairs", "NW Forest Fairy Pond", "Central Bay Arrow Stairs", "Western Sea Bridge Cave",
				"Level 7 Entrance", "SW Plains Behind Stumps Statue Mouth"
		));
	private static ArrayList<String> entranceDests = new ArrayList<String>(
		Arrays.asList(
				"Old Level 9 Lobby", "Level 1 West", "Level 1 East", "Level 1 Middle", "Level 2", "Level 3-1", "Level 3-2", "Level 3-3",
				"Level 3-4", "Level 3-5", "Level 3-6", "Level 3-7 Lobby", "Level 4 Mountain", "Level 5 Lower Maze", "Level 6",
				"Level 7 Early", "Level 8 Left Shaft", "Level 8 Middle Left Shaft", "Level 8 Right Shaft", "Level 8 Main",
				"Bonus Level", "Level 9",
				
				"Five Hearts Guy", "Only Purpose Guy 1", "Bonshop", "Slash Arrow Hint", "Burgled Shop", "Only Purpose Guy 2",
				"Walk Forward Hint", "Pay for Hint", "Clouds Hint", "Forest of Crappiness Info", "Grassy Valley Maze Path Guy",
				"Super Bomb Shop 1", "Off-Color Mountainside Hint", "Trade Guy", "Raft Maze Info Cave", "Teh Smrat Bidkip Reward",
				"Cheat Code Reward", "Lens Hint", "Bonus Level Unlock Guy", "Go Away Maze Path Guy", "Sorry Shop", "Wallet Lady",
				"Only Purpose Guy 3", "Super Bomb Shop 2", "Peeing Guy", "PegLegArm"
		));
	private static String start;
	
	public World() {initAccess();}
	
	public static Area getArea(String name)
	{
		Area a;
		Iterator it = areas.iterator();
		while(it.hasNext())
		{
			a = (Area) it.next();
			if(a.getName().equals(name)) {return a;}
		}
		return null;
	}
	
	public void initAccess()
	{
		Location loc;
		
		getArea("Beach").addAccess(getArea("NE Plains Entry"), new String[] {"Medallion of Water", "Fire"});
		getArea("Beach").addAccess(getArea("NE Plains Entry"), new String[] {"Raft", "Fire"});
		getArea("Beach").addAccess(getArea("NE Plains Entry"), new String[] {"Ladder", "Weapon", "Fire"});
		getArea("Beach").addAccess(getArea("NE Plains Entry"), new String[] {"Ladder", "Boomerang", "Fire"});
		getArea("Beach").addAccess(getArea("NE Plains Entry"), new String[] {"Range", "Fire"});
		getArea("Beach").addAccess(getArea("Desert"), new String[] {"Sword"});
		getArea("Beach").addAccess(getArea("Small Waterfall"), new String[] {"Medallion of Water"});
		getArea("Beach").addAccess(getArea("Western Sea"), new String[] {"Medallion of Water"});
		getArea("NE Plains").addAccess(getArea("Beach"), new String[] {"Medallion of Water"});
		getArea("NE Plains").addAccess(getArea("Beach"), new String[] {"Raft"});
		getArea("NE Plains").addAccess(getArea("Beach"), new String[] {"Weapon"});
		getArea("NE Plains").addAccess(getArea("Beach"), new String[] {"Boomerang"});
		getArea("NE Plains").addAccess(getArea("Desert"), new String[] {"East Warp Ring"});
		getArea("NE Plains").addAccess(getArea("Mountain Pass"), new String[] {"East Warp Ring"});
		getArea("NE Plains").addAccess(getArea("Twin Islands"), new String[] {"East Warp Ring"});
		getArea("Desert").addAccess(getArea("Beach"), new String[] {"Sword"});
		getArea("Desert").addAccess(getArea("Mountain Pass"), new String[] {"Bombs", "Darknut Weapon"});
		getArea("Desert").addAccess(getArea("NE Plains"), new String[] {"East Warp Ring"});
		getArea("Desert").addAccess(getArea("Mountain Pass"), new String[] {"East Warp Ring"});
		getArea("Desert").addAccess(getArea("Twin Islands"), new String[] {"East Warp Ring"});
		getArea("Mountain Pass").addAccess(getArea("Desert"), null);
		getArea("Mountain Pass").addAccess(getArea("NE Plains"), new String[] {"East Warp Ring"});
		getArea("Mountain Pass").addAccess(getArea("Desert"), new String[] {"East Warp Ring"});
		getArea("Mountain Pass").addAccess(getArea("Twin Islands"), new String[] {"East Warp Ring"});
		getArea("Forest of Crappiness North").addAccess(getArea("Forest of Crappiness South"), new String[] {"Ladder", "Stun", "Weapon"});
		getArea("Forest of Crappiness North").addAccess(getArea("Forest of Crappiness South"), new String[] {"Ladder", "Mirror Shield"});
		getArea("Forest of Crappiness South").addAccess(getArea("Forest of Crappiness North"), new String[] {"Ladder", "Range"});
		getArea("Forest of Crappiness South").addAccess(getArea("Forest of Crappiness North"), new String[] {"Ladder", "Mirror Shield"});
		getArea("Forest of Crappiness South").addAccess(getArea("Grassy Valley"), new String[] {"Grassy Valley Maze Path"});
		getArea("Forest of Crappiness South").addAccess(getArea("Beach"), new String[] {"Fire"});
		getArea("Grassy Valley").addAccess(getArea("Pond Island"), new String[] {"Sword", "Medallion of Water"});
		getArea("Grassy Valley").addAccess(getArea("Canyon South"), new String[] {"Ocarina"});
		getArea("Grassy Valley").addAccess(getArea("Forest of Crappiness South"), null);
		getArea("Pond Island").addAccess(getArea("Grassy Valley"), new String[] {"Medallion of Water"});
		getArea("Pond Island").addAccess(getArea("Canyon South"), new String[] {"Medallion of Water"});
		getArea("Pond Island").addAccess(getArea("Canyon South"), new String[] {"West Warp Ring"});
		getArea("Pond Island").addAccess(getArea("Canyon North"), new String[] {"West Warp Ring"});
		getArea("Pond Island").addAccess(getArea("NW Forest"), new String[] {"West Warp Ring"});
		getArea("Canyon South").addAccess(getArea("Canyon North"), new String[] {"Raft", "Raft Maze Guide", "Medallion of Strength L2"});
		getArea("Canyon South").addAccess(getArea("Canyon North"), new String[] {"Medallion of Water", "Raft Maze Guide", "Medallion of Strength L2"});
		getArea("Canyon South").addAccess(getArea("Pond Island"), new String[] {"West Warp Ring"});
		getArea("Canyon South").addAccess(getArea("Canyon North"), new String[] {"West Warp Ring"});
		getArea("Canyon South").addAccess(getArea("NW Forest"), new String[] {"West Warp Ring"});
		getArea("Canyon North").addAccess(getArea("Pond Island"), new String[] {"West Warp Ring"});
		getArea("Canyon North").addAccess(getArea("Canyon South"), new String[] {"West Warp Ring"});
		getArea("Canyon North").addAccess(getArea("NW Forest"), new String[] {"West Warp Ring"});
		getArea("NW Forest").addAccess(getArea("Pond Island"), new String[] {"West Warp Ring"});
		getArea("NW Forest").addAccess(getArea("Canyon South"), new String[] {"West Warp Ring"});
		getArea("NW Forest").addAccess(getArea("Canyon North"), new String[] {"West Warp Ring"});
		getArea("NW Forest").addAccess(getArea("Twin Islands"), new String[] {"Medallion of Water"});
		getArea("NW Forest").addAccess(getArea("SW Plains"), new String[] {"Medallion of Strength L2"});
		getArea("NW Forest").addAccess(getArea("SW Plains"), new String[] {"Ladder", "Fire"});
		getArea("NW Forest").addAccess(getArea("SW Plains"), new String[] {"Medallion of Water"});
		getArea("Twin Islands").addAccess(getArea("NW Forest"), new String[] {"Medallion of Water"});
		getArea("SW Plains").addAccess(getArea("NW Forest"), new String[] {"Medallion of Strength L2"});
		getArea("SW Plains").addAccess(getArea("NW Forest"), new String[] {"Ladder", "Fire"});
		getArea("SW Plains").addAccess(getArea("NW Forest"), new String[] {"Medallion of Water"});
		getArea("SW Plains").addAccess(getArea("Small Waterfall"), new String[] {"Hammer"});
		getArea("SW Plains").addAccess(getArea("Big Waterfall"), new String[] {"Super Bombs", "Ladder"});
		getArea("SW Plains").addAccess(getArea("Big Waterfall"), new String[] {"Super Bombs", "Medallion of Water"});
		getArea("SW Plains").addAccess(getArea("Heavy Rocks Island"), new String[] {"Hammer"});
		getArea("SW Plains").addAccess(getArea("Heavy Rocks Island"), new String[] {"Medallion of Water"});
		getArea("Small Waterfall").addAccess(getArea("SW Plains"), new String[] {"Hammer"});
		getArea("Small Waterfall").addAccess(getArea("Beach"), new String[] {"Medallion of Water"});
		getArea("Big Waterfall").addAccess(getArea("SW Plains"), new String[] {"Super Bombs", "Ladder"});
		getArea("Big Waterfall").addAccess(getArea("SW Plains"), new String[] {"Super Bombs", "Medallion of Water"});
		getArea("Heavy Rocks Island").addAccess(getArea("SW Plains"), new String[] {"Hammer"});
		getArea("Heavy Rocks Island").addAccess(getArea("SW Plains"), new String[] {"Medallion of Strength L2"});
		getArea("Fake Overworld").addAccess(getArea("NW Forest"), new String[] {"Medallion of Water"});
		getArea("Fake Overworld").addAccess(getArea("NW Forest"), new String[] {"Raft", "Lens of Truth"});
		
		getArea("Beach").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("NE Plains").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Desert").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Mountain Pass").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Forest of Crappiness North").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Forest of Crappiness South").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Grassy Valley").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Pond Island").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Canyon South").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Canyon North").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("NW Forest").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Twin Islands").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("SW Plains").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Small Waterfall").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Big Waterfall").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		getArea("Fake Overworld").addAccess(getArea("Whistle Warp"), new String[] {"Ocarina"});
		
		getArea("Whistle Warp").addAccess(getArea("Level 4 Clouds"), new String[] {"Triforce 3"});
		getArea("Whistle Warp").addAccess(getArea("Forest of Crappiness"), new String[] {"Triforce 4"});
		getArea("Whistle Warp").addAccess(getArea("Heavy Rocks Island"), new String[] {"Triforce 6"});
		
		getArea("Title Screen").addAccess(getArea("Old Level 9 Zelda Room"), null);
		getArea("Title Screen").addAccess(getArea("Bonus Level Entrance"), new String[] {"Bonus Level Unlock"});
		getArea("Beach").addAccess(getArea("Beach NE Open Cave"), null);
		getArea("Beach").addAccess(getArea("Beach Bombable Cave"), new String[] {"Bombs"});
		getArea("Beach").addAccess(getArea("Beach Open Tree"), null);
		getArea("Beach").addAccess(getArea("Beach Valley Bushes Building"), new String[] {"Sword"});
		getArea("Beach").addAccess(getArea("Beach Valley Open Building"), null);
		getArea("Beach").addAccess(getArea("Old Level 9 Entrance"), null);
		getArea("Beach").addAccess(getArea("Level 1 West Entrance"), null);
		getArea("Beach").addAccess(getArea("Level 1 East Entrance"), null);
		getArea("Beach").addAccess(getArea("Level 1 Middle Entrance"), new String[] {"Fire"});
		getArea("NE Plains").addAccess(getArea("NE Plains Burnable Cave"), new String[] {"Fire"});
		getArea("NE Plains").addAccess(getArea("NE Plains Open Cave"), null);
		getArea("NE Plains").addAccess(getArea("Level 2 Entrance"), null);
		getArea("Desert").addAccess(getArea("Desert Open Stairs"), null);
		getArea("Desert").addAccess(getArea("Level 3-1 Entrance"), null);
		getArea("Desert").addAccess(getArea("Level 3-2 Entrance"), new String[] {"Super Bombs"});
		getArea("Desert").addAccess(getArea("Level 3-3 Entrance"), new String[] {"Medallion of Strength"});
		getArea("Desert").addAccess(getArea("Level 3-4 Entrance"), null);
		getArea("Desert").addAccess(getArea("Level 3-5 Entrance"), new String[] {"Medallion of Life"});
		getArea("Desert").addAccess(getArea("Level 3-6 Entrance"), null);
		getArea("Desert").addAccess(getArea("Level 3 Middle Entrance"), new String[] {"Ladder"});
		getArea("Desert").addAccess(getArea("Level 3 Middle Entrance"), new String[] {"Medallion of Water"});
		getArea("Desert").addAccess(getArea("Mountain Pass Open Cave"), new String[] {"Bombs"});
		loc = new Location("East Warp Ring", false);
		loc.setFlags(new String[] {"East Warp Ring"});
		getArea("Mountain Pass").addLocation(loc, null);
		getArea("Mountain Pass").addAccess(getArea("Level 4 Entrance"), null);
		getArea("Forest of Crappiness South").addAccess(getArea("Forest of Crappiness Open Cave"), null);
		getArea("Forest of Crappiness South").addAccess(getArea("Forest of Crappiness Stairs Under Rock"), new String[] {"Ocarina"});
		getArea("Grassy Valley").addAccess(getArea("Grassy Valley Open Building"), null);
		getArea("Grassy Valley").addAccess(getArea("Grassy Valley Graveyard Stairs"), new String[] {"Sword"});
		getArea("Canyon South").addAccess(getArea("Canyon Open Stairs Past Tunnel"), new String[] {"Bow", "Arrow"});
		getArea("Canyon South").addAccess(getArea("Canyon Raft Maze Cave"), new String[] {"Raft"});
		getArea("Canyon South").addAccess(getArea("Canyon Raft Maze Cave"), new String[] {"Medallion of Water"});
		getArea("Canyon South").addAccess(getArea("Level 5 Entrance"), new String[] {"Medallion of Strength L2"});
		loc = new Location("West Warp Ring", false);
		loc.setFlags(new String[] {"West Warp Ring"});
		getArea("Canyon North").addLocation(loc, new String[] {"Weapon"});
		getArea("NW Forest").addLocation(loc, null);
		getArea("NW Forest").addAccess(getArea("NW Forest Bushes Building"), new String[] {"Lens of Truth", "Sword"});
		getArea("NW Forest").addAccess(getArea("NW Forest Fairy Pond"), new String[] {"Medallion of Water"});
		getArea("NW Forest").addAccess(getArea("NW Forest Statue Mouth"), new String[] {"Lens of Truth", "Weapon"});
		getArea("NW Forest").addAccess(getArea("NW Forest Statue Mouth"), new String[] {"Lens of Truth", "Stun"});
		getArea("NW Forest").addAccess(getArea("NW Forest Open Tree"), new String[] {"Lens of Truth", "Weapon"});
		getArea("NW Forest").addAccess(getArea("NW Forest Open Tree"), new String[] {"Lens of Truth", "Stun"});
		getArea("NW Forest").addAccess(getArea("Level 7 Entrance"), new String[] {"Medallion of Water"});
		getArea("NW Forest").addAccess(getArea("Level 7 Entrance"), new String[] {"Lens of Truth", "Raft", "Weapon"});
		getArea("NW Forest").addAccess(getArea("Central Bay Arrow Stairs"), new String[] {"Hammer", "Medallion of Strength L2"});
		getArea("NW Forest").addAccess(getArea("Central Bay Open Stairs"), null);
		getArea("NW Forest").addAccess(getArea("Level 8 NW Entrance"), new String[] {"Medallion of Water", "Go Away Maze Path"});
		getArea("NW Forest").addAccess(getArea("Level 8 NE Entrance"), new String[] {"Medallion of Water", "Go Away Maze Path"});
		getArea("NW Forest").addAccess(getArea("Level 8 SW Entrance"), new String[] {"Medallion of Water", "Go Away Maze Path"});
		getArea("NW Forest").addAccess(getArea("Level 8 SE Entrance"), new String[] {"Medallion of Water", "Go Away Maze Path"});
		getArea("SW Plains").addAccess(getArea("Western Sea Island Open Stairs"), new String[] {"Medallion of Water"});
		getArea("SW Plains").addAccess(getArea("Western Sea Island Open Stairs"), new String[] {"Hammer"});
		getArea("SW Plains").addAccess(getArea("Western Sea Bombable Cave"), new String[] {"Bombs", "Medallion of Water"});
		getArea("SW Plains").addAccess(getArea("Western Sea Bombable Cave"), new String[] {"Bombs", "Hammer"});
		getArea("SW Plains").addAccess(getArea("SW Plains Open Cave"), null);
		getArea("SW Plains").addAccess(getArea("SW Plains Behind Stump Statue Mouth"), new String[] {"Hammer", "Medallion of Water"});
		getArea("Big Waterfall").addAccess(getArea("SW Plains Lake Cave"), new String[] {"Medallion of Water"});
		getArea("Big Waterfall").addAccess(getArea("Level 6 Entrance"), null);
		getArea("Small Waterfall").addAccess(getArea("Level 9 Entrance"), new String[] {"Wand", "Book of Magic"});
		loc = new Location("Heavy Rocks Removal", false);
		loc.setFlags(new String [] {"Heavy Rocks Removal"});
		getArea("Heavy Rocks Island").addLocation(loc, new String[] {"Medallion of Strength L2"});
		
		getArea("Bonus Level Entrance").addAccess(getArea("Title Screen"), null);
		getArea("Beach NE Open Cave").addAccess(getArea("Beach"), null);
		getArea("Beach Bombable Cave").addAccess(getArea("Beach"), null);
		getArea("Beach Open Tree").addAccess(getArea("Beach"), null);
		getArea("Beach Valley Bushes Building").addAccess(getArea("Beach"), null);
		getArea("Beach Valley Open Building").addAccess(getArea("Beach"), null);
		getArea("Old Level 9 Entrance").addAccess(getArea("Beach"), null);
		getArea("Level 1 West Entrance").addAccess(getArea("Beach"), null);
		getArea("Level 1 East Entrance").addAccess(getArea("Beach"), null);
		getArea("Level 1 Middle Entrance").addAccess(getArea("Beach"), null);
		getArea("NE Plains Burnable Cave").addAccess(getArea("NE Plains"), null);
		getArea("NE Plains Open Cave").addAccess(getArea("NE Plains"), null);
		getArea("Level 2 Entrance").addAccess(getArea("NE Plains"), null);
		getArea("Desert Open Stairs").addAccess(getArea("Desert"), null);
		getArea("Level 3-1 Entrance").addAccess(getArea("Desert"), null);
		getArea("Level 3-2 Entrance").addAccess(getArea("Desert"), null);
		getArea("Level 3-3 Entrance").addAccess(getArea("Desert"), null);
		getArea("Level 3-4 Entrance").addAccess(getArea("Desert"), null);
		getArea("Level 3-5 Entrance").addAccess(getArea("Desert"), new String[] {"Medallion of Life"});
		getArea("Level 3-6 Entrance").addAccess(getArea("Desert"), null);
		getArea("Level 3 Middle Entrance").addAccess(getArea("Desert"), new String[] {"Ladder"});
		getArea("Level 3 Middle Entrance").addAccess(getArea("Desert"), new String[] {"Medallion of Water"});
		getArea("Mountain Pass Open Cave").addAccess(getArea("Desert"), null);
		getArea("Level 4 Entrance").addAccess(getArea("Mountain Pass"), null);
		getArea("Forest of Crappiness Open Cave").addAccess(getArea("Forest of Crappiness South"), null);
		getArea("Forest of Crappiness Stairs Under Rock").addAccess(getArea("Forest of Crappiness South"), null);
		getArea("Grassy Valley Open Building").addAccess(getArea("Grassy Valley"), null);
		getArea("Grassy Valley Graveyard Stairs").addAccess(getArea("Pond Island"), new String[] {"Medallion of Water"});
		getArea("Grassy Valley Graveyard Stairs").addAccess(getArea("Grassy Valley"), new String[] {"Sword"});
		getArea("Canyon Open Stairs Past Tunnel").addAccess(getArea("Canyon South"), null);
		getArea("Canyon Raft Maze Cave").addAccess(getArea("Canyon South"), new String[] {"Raft"});
		getArea("Canyon Raft Maze Cave").addAccess(getArea("Canyon South"), new String[] {"Medallion of Water"});
		getArea("Level 5 Entrance").addAccess(getArea("Canyon South"), new String[] {"Medallion of Strength L2"});
		getArea("NW Forest Bushes Building").addAccess(getArea("NW Forest"), new String[] {"Lens of Truth", "Sword"});
		getArea("NW Forest Fairy Pond").addAccess(getArea("NW Forest"), null);
		getArea("NW Forest Statue Mouth").addAccess(getArea("NW Forest"), new String[] {"Lens of Truth", "Sword"});
		getArea("NW Forest Statue Mouth").addAccess(getArea("NW Forest"), new String[] {"Lens of Truth", "Stun"});
		getArea("NW Forest Open Tree").addAccess(getArea("NW Forest"), new String[] {"Lens of Truth", "Sword"});
		getArea("NW Forest Open Tree").addAccess(getArea("NW Forest"), new String[] {"Lens of Truth", "Stun"});
		getArea("Central Bay Arrow Stairs").addAccess(getArea("NW Forest"), null);
		getArea("Central Bay Open Stairs").addAccess(getArea("NW Forest"), null);
		getArea("Level 8 NW Entrance").addAccess(getArea("NW Forest"), new String[] {"Medallion of Water"});
		getArea("Level 8 NW Entrance").addAccess(getArea("Level 8 NE Entrance"), new String[] {"Medallion of Water"});
		getArea("Level 8 NW Entrance").addAccess(getArea("Level 8 SW Entrance"), new String[] {"Medallion of Water"});
		getArea("Level 8 NW Entrance").addAccess(getArea("Level 8 SE Entrance"), new String[] {"Medallion of Water"});
		getArea("Level 8 NE Entrance").addAccess(getArea("Level 8 NW Entrance"), new String[] {"Medallion of Water"});
		getArea("Level 8 SW Entrance").addAccess(getArea("Level 8 NW Entrance"), new String[] {"Medallion of Water"});
		getArea("Level 8 SE Entrance").addAccess(getArea("Level 8 NW Entrance"), new String[] {"Medallion of Water"});
		getArea("Western Sea Island Open Stairs").addAccess(getArea("SW Plains"), new String[] {"Medallion of Water"});
		getArea("Western Sea Island Open Stairs").addAccess(getArea("SW Plains"), new String[] {"Hammer"});
		getArea("Western Sea Bridge Cave").addAccess(getArea("SW Plains"), new String[] {"Medallion of Water"});
		getArea("Western Sea Bridge Cave").addAccess(getArea("SW Plains"), new String[] {"Hammer"});
		getArea("SW Plains Open Cave").addAccess(getArea("SW Plains"), null);
		getArea("SW Plains Behind Stumps Statue Mouth").addAccess(getArea("SW Plains"), new String[] {"Medallion of Water", "Hammer"});
		getArea("SW Plains Lake Cave").addAccess(getArea("Big Waterfall"), new String[] {"Medallion of Water"});
		getArea("Level 6 Entrance").addAccess(getArea("Big Waterfall"), null);
		getArea("Level 9 Entrance").addAccess(getArea("Small Waterfall"), new String[] {"Fire"});
		
		getArea("Old Level 9 Zelda Room").addAccess(getArea("Old Level 9 Lobby"), null);
		getArea("Level 1 West").addAccess(getArea("Level 1 West (Key Used)"), new String[] {"Key"});
		getArea("Level 1 West Past Key Door").addAccess(getArea("Level 1 East"), null);
		getArea("Level 1 East").addAccess(getArea("Level 1 East (Key Used)"), new String[] {"Key"});
		getArea("Level 1 East Past Key Door").addAccess(getArea("Level 1 West"), null);
		getArea("Level 5 Lower Maze").addAccess(getArea("Level 5 Upper Maze"), new String[] {"Super Bombs"});
		getArea("Level 5 Lower Maze").addAccess(getArea("Level 5 Old Woman Room"), new String[] {"Key"});
		getArea("Level 5 Upper Maze").addAccess(getArea("Level 5 Old Woman Room"), null);
		getArea("Level 5 Upper Maze").addAccess(getArea("Level 5 Old Goriya Room"), null);
		getArea("Level 5 Old Woman Room").addAccess(getArea("Level 5 Lower Maze"), null);
		getArea("Level 5 Old Woman Room").addAccess(getArea("Level 5 Two Buttons Room"), new String[] {"Key"});
		getArea("Level 5 Two Buttons Room").addAccess(getArea("Level 5 Upper Maze"), null);
		getArea("Level 5 Two Buttons Room").addAccess(getArea("Level 5 Goriya Room"), new String[] {"Key"});
		getArea("Level 5 Goriya Room").addAccess(getArea("Level 5 Upper Maze"), null);
		getArea("Level 5 Goriya Room").addAccess(getArea("Level 5 One Button Room"), new String[] {"Key"});
		getArea("Level 5 One Button Room").addAccess(getArea("Level 5 Isolated Platform"), null);
		getArea("Level 5 One Button Room").addAccess(getArea("Level 5 Past All Key Doors"), new String[] {"Key"});
		getArea("Level 5 Isolated Platform").addAccess(getArea("Level 5 One Button Room"), null);
		getArea("Level 7 Early").addAccess(getArea("Level 7 Main"), new String[] {"Ladder"});
		getArea("Level 7 Early").addAccess(getArea("Level 7 Main"), new String[] {"Raft"});
		getArea("Level 7 Early").addAccess(getArea("Level 7 Main"), new String[] {"Medallion of Water"});
		getArea("Level 7 Early").addAccess(getArea("Level 7 Main"), new String[] {"Level 7 Waffle Button"});
		getArea("Level 7 Main").addAccess(getArea("Level 7 2F East"), new String[] {"Ladder"});
		getArea("Level 7 Main").addAccess(getArea("Level 7 2F East"), new String[] {"Medallion of Water"});
		loc = new Location("Level 7 Waffle Button", false);
		loc.setFlags(new String[] {"Level 7 Waffle Button"});
		getArea("Level 7 Early").addLocation(loc, new String[] {"Super Bombs", "Sword"});
		loc = new Location("Level 7 2F North Button", false);
		loc.setFlags(new String[] {"Level 7 2F North Button"});
		getArea("Level 7 Early").addLocation(loc,  new String[] {"Level 7 Waffle Button", "Hookshot"});
		loc = new Location("Level 7 2F East Button", false);
		loc.setFlags(new String[] {"Level 7 2F East Button"});
		getArea("Level 7 2F East").addLocation(loc, new String[] {"Hookshot"});
		loc = new Location("Level 7 2F South Button", false);
		loc.setFlags(new String[] {"Level 7 2F South Button"});
		getArea("Level 7 Main").addLocation(loc, new String[] {"Hammer", "Hookshot"});
		loc = new Location("Level 7 2F West Button", false);
		loc.setFlags(new String[] {"Level 7 2F West Button"});
		getArea("Level 7 Main").addLocation(loc, new String[] {"Hammer", "Hookshot", "Bombs", "Sword"}); // Sword is a soft req to avoid a savewarp
		getArea("Level 8 Left Shaft").addAccess(getArea("Level 8 Main"), new String[] {"Hammer"});
		getArea("Level 8 Main").addAccess(getArea("Level 8 Left Shaft"), new String[] {"Hammer"});
		getArea("Level 8 Middle Left Shaft").addAccess(getArea("Level 8 Main"), new String[] {"Hammer"});
		getArea("Level 8 Main").addAccess(getArea("Level 8 Middle Left Shaft"), new String[] {"Hammer"});
		getArea("Level 8 Right Shaft").addAccess(getArea("Level 8 Main"), new String[] {"Hammer"});
		getArea("Level 8 Main").addAccess(getArea("Level 8 Right Shaft"), new String[] {"Hammer"});
		
		loc = new Location("Bonshop Bombs", false);
		loc.setFlags(new String[] {"Bombs"});
		getArea("Bonshop").addLocation(loc, new String[] {"Weapon"});
		loc = new Location("Grassy Valley Maze Path", false);
		loc.setFlags(new String[] {"Grassy Valley Maze Path"});
		getArea("Grassy Valley Maze Path Guy").addLocation(loc, null);
		loc = new Location("SB Shop 1 Super Bombs", false);
		loc.setFlags(new String[] {"Super Bombs"});
		getArea("Super Bomb Shop 1").addLocation(loc, new String[] {"Weapon", "Letter"});
		loc = new Location("SB Shop 2 Super Bombs", false);
		loc.setFlags(new String[] {"Super Bombs"});
		getArea("Super Bomb Shop 2").addLocation(loc, new String[] {"Weapon", "Letter"});
		loc = new Location("Raft Maze Info", false);
		loc.setFlags(new String[] {"Raft Maze Guide"});
		getArea("Raft Maze Info Cave").addLocation(loc, null);
		loc = new Location("Bonus Level Unlock", false);
		loc.setFlags(new String[] {"Bonus Level Unlock"});
		getArea("Bonus Level Unlock Guy").addLocation(loc, null);
		loc = new Location("Go Away Maze Path", false);
		loc.setFlags(new String[] {"Go Away Maze Path"});
		getArea("Go Away Maze Path Guy").addLocation(loc, null);
		loc = new Location("Sorry Shop Potion", false);
		loc.setFlags(new String[] {"Potion"});
		getArea("Sorry Shop").addLocation(loc, new String[] {"Weapon"});
	}
	
	public void randomEntrances(Random rand)
	{
		Area a;
		ArrayList<String> dests = new ArrayList<String>(entranceDests);
		String dest;
		
		System.out.println("Dests size: " + dests.size());
		System.out.println("Normal ents size: " + normalEntrances.size());
		System.out.println("Special ents size: " + reqEntrances.size());
		
		start = normalEntrances.get(rand.nextInt(normalEntrances.size()));		
		
		Iterator it = normalEntrances.iterator();
		while(it.hasNext())
		{
			a = getArea((String) it.next());
			dest = dests.get(rand.nextInt(dests.size()));
			a.addAccess(getArea(dest), null, true);
			if(dest.equals("Level 4 Mountain")) {getArea("Level 4 Clouds").addAccess(a, null);}
			dests.remove(dest);
		}
		dests = specialEntranceAssignment(rand, dests, "Beach Bombable Cave", new String[] {"Bombs"});
		dests = specialEntranceAssignment(rand, dests, "Beach Valley Bushes Building", new String[] {"Sword"});
		dests = specialEntranceAssignment(rand, dests, "Level 1 Middle Entrance", new String[] {"Fire"});
		dests = specialEntranceAssignment(rand, dests, "NE Plains Burnable Cave", new String[] {"Fire"});
		dests = specialEntranceAssignment(rand, dests, "Level 3-2 Entrance", new String[] {"Super Bombs"});
		dests = specialEntranceAssignment(rand, dests, "Level 3-3 Entrance", new String[] {"Medallion of Strength"});
		dests = specialEntranceAssignment(rand, dests, "Level 3-5 Entrance", new String[] {"Medallion of Life"});
		dests = specialEntranceAssignment(rand, dests, "Forest of Crappiness Stairs Under Rock", new String[] {"Ocarina"});
		dests = specialEntranceAssignment(rand, dests, "Grassy Valley Graveyard Stairs", new String[] {"Ocarina"});
		dests = specialEntranceAssignment(rand, dests, "NW Forest Fairy Pond", new String[] {"Medallion of Water"});
		dests = specialEntranceAssignment(rand, dests, "Central Bay Arrow Stairs", new String[] {"Hammer", "Medallion of Strength L2"});
		dests = specialEntranceAssignment(rand, dests, "Western Sea Bridge Cave", new String[] {"Bombs"});
		dests = specialEntranceAssignment(rand, dests, "Level 7 Entrance", new String[] {"Heavy Rocks Removal"});
		dests = specialEntranceAssignment(rand, dests, "SW Plains Behind Stumps Statue Mouth", new String[] {"Medallion of Water"});
		System.out.println("Dests list (should be empty): " + dests);
	}
	
	public ArrayList<String> specialEntranceAssignment(Random rand, ArrayList<String> dests, String entrance, String[] reqs)
	{
		String dest;
		dest = dests.get(rand.nextInt(dests.size()));
		getArea(entrance).addAccess(getArea(dest), reqs, true);
		if(dest.equals("Level 4 Mountain")) {getArea("Level 4 Clouds").addAccess(getArea(entrance), reqs);};
		dests.remove(dest);
		return dests;
	}
	
	public boolean randomizer(long seed)
	{
		Random rand = new Random(seed);
		randomEntrances(rand);
		
		return true;
	}
	
	public static void main(String[] args)
	{
		World w;
		long seed = 26;
		while(true)
		{
			w = new World();
			if(w.randomizer(seed)) {break;}
			seed++;
		}
	}
}
