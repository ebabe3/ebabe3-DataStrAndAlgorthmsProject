import java.util.LinkedList;

	public class NaryTreeNode {
	    public String name;
	    public String category;
	    public double price;
	    public double downloads;
	    public int ageLimit;
	    public double size;
	    public double score;
	   
	    public String getName() {
			return name;
		}
	    public String getCategory() {
			return category;
		}

		 public final LinkedList<NaryTreeNode> children;
	    
	    public NaryTreeNode(String name,String category,double price,double downloads,int ageLimit,double size,double score) {
	        this.name = name;
	        this.category=category;
	        this.price=price;
	        this.downloads=downloads;
	        this.ageLimit=ageLimit;
	        this.size=size;
	        this.score=score;
	        children = new LinkedList<>();
	    }
	   
	    public void removeapp(String AppName) {
	 	   
	 	   int i=0, j=0;
	 	   for (i = 0; i < 2;i++) {
	 	       for (j = 0; j < 6; j++){
	 	    	   for (NaryTreeNode p: getChild(i).getChild(j).children) { 
	 	    		   if (p.getName().toLowerCase().equals(AppName.toLowerCase())){
	 	    			   getChild(i).getChild(j).children.remove(p);
	 	    			   break;
	 	    		   }         
	 	    	   }
	 	       }	  
	 	       }
	 	       }
	    
	    public void Addapp(String name,String category,double price,double downloads,int ageLimit,double size,double score) {
		 	   
		 	   int i=0, j=0;
		 	   for (i = 0; i < 2;i++) {
		 	       for (j = 0; j < 6; j++){
		 	    	   for (NaryTreeNode p: getChild(i).getChild(j).children) { 
		 	    		   if (p.getCategory().toLowerCase().equals(category.toLowerCase())){
		 	    			   getChild(i).getChild(j).children.add(new NaryTreeNode(name, category, price, downloads, ageLimit, size, score));
		 	    			   break;
		 	    		   }          
		 	    	   }
		 	       }	  
		 	       }
		 	       }
	    
	    public void printAllFeatures(String AppName) {
	 	   int i,j;
	 	   for (i = 0; i < 2;i++) {
	 	       for (j = 0; j < 6; j++){
	 		   for (NaryTreeNode p: getChild(i).getChild(j).children)
	 	           if (p.getName().toLowerCase().equals(AppName.toLowerCase()))
	 	           {
	 	           System.out.println("Name: "+p.name + "\nCategory: " + p.category + "\nPrice: " +p.price+ " $" + "\nDownloads: " + p.downloads+" M+" + "\nAge Limit:  " + "+" + p.ageLimit + "\nScore: " + p.score + "\nSize: " + p.size + " Mb");
	 	           	break;
	 	           }
	 	           }
	 	       }
	 	       }

	    public String searchWithPopularity(String category,int rank) {
	    	switch(category) {
	    	case "Strategy":
	    		return getChild(0).getChild(0).getChild(rank-1).name;
	    	case "Race":
	    		return getChild(0).getChild(1).getChild(rank-1).name;
	    	case "Sport":
	    		return getChild(0).getChild(2).getChild(rank-1).name;
	    	case "Action":
	    		return getChild(0).getChild(3).getChild(rank-1).name;
	    	case "Simulation":
	    		return getChild(0).getChild(4).getChild(rank-1).name;
	    	case "Casual":
	    		return getChild(0).getChild(5).getChild(rank-1).name;
	    	case "Education":
	    		return getChild(1).getChild(0).getChild(rank-1).name;
	    	case "Health":
	    		return getChild(1).getChild(1).getChild(rank-1).name;
	    	case "Shopping":
	    		return getChild(1).getChild(2).getChild(rank-1).name;
	    	case "Fun":
	    		return getChild(1).getChild(3).getChild(rank-1).name;
	    	case "Communication":
	    		return getChild(1).getChild(4).getChild(rank-1).name;
	    	case "Finance":
	    		return getChild(1).getChild(5).getChild(rank-1).name;
	    	default:
	    		return "Bulunamadý!";
	    	}
	    }
	    
	    public void addChild(String name,String category,double price,double downloads,int ageLimit,double size,double score) {
	         children.add(new NaryTreeNode(name,category,price,downloads,ageLimit,size,score));
	         
	    }
	    
	    public LinkedList<NaryTreeNode> getChildren() {
	        return new LinkedList<>(children);
	    }
	    
	    public NaryTreeNode getChild(int index) {
	        if (index < children.size()) {
	            return children.get(index);
	        }
	        
	        return null;
	    }
	    
	    public static void print(NaryTreeNode root) {
	        printUtil(root, 0);
	    }
	    
	    private static void printUtil(NaryTreeNode node, int depth) {
	        for (int i = 0; i < depth; ++i) {
	            System.out.print("   ");
	        }
	        System.out.println(node.name);
	        
	        for (NaryTreeNode child : node.getChildren()) {
	            printUtil(child, depth + 1);
	        }
	    }
	
	    
	    public void createAppStore(NaryTreeNode root) {

	        
	        root.addChild("AllGames","Games",0.0,100,0,4,5);
	        
	        root.getChild(0).addChild("AllStrategy","Strategy",0.0,100,0,4,5);
	        	root.getChild(0).getChild(0).addChild("Mini Metro","Strategy", 36.99,1,4,207.4,4.8);
	        	root.getChild(0).getChild(0).addChild("Plants vs.Zombies",	"Strategy",	0,	100,	9,	142.5,	4.8);
	        	root.getChild(0).getChild(0).addChild("Rome Total War",	"Strategy",	89.99,	0.1,	12,	3900,	4.6	);
	        	root.getChild(0).getChild(0).addChild("Clash Of Clans",	"Strategy",	0,	500,	9,	266.9,	4.5	);
	        	root.getChild(0).getChild(0).addChild("Five Nights at Freddy's",	"Strategy",	27.99,	1,	12,	112.3,	4.5	);
	        	root.getChild(0).getChild(0).addChild("Pocket City",	"Strategy",	27.99,	0.5,	9,	67.5,	4.4	);
	        	root.getChild(0).getChild(0).addChild("Monopoly",	"Strategy",	36.99,	1,	4,	590,	4.3	);
	        	root.getChild(0).getChild(0).addChild("Among Us!",	"Strategy",	0,	100,	9,	258.5,	3.8	);
	        	root.getChild(0).getChild(0).addChild("Bad North: Jotunn Edition",	"Strategy",	46.99,	0.1	,12,	355.3,	3.6	);
	        	root.getChild(0).getChild(0).addChild("Civilization VI",	"Strategy",	0,	0.1,	12,	3100,	2.9	);
	             
	        root.getChild(0).addChild("AllRace","Race",0.0,100,0,4,5);
	        	root.getChild(0).getChild(1).addChild("Rebel Racing","Race",	0,	10,	4,	504.6,	4.7	);
	        	root.getChild(0).getChild(1).addChild("Asphalt 9: Legends",	"Race",	0,  50,  12,	2.2,	4.7	);
	        	root.getChild(0).getChild(1).addChild("Asphalt 8:Real Racing", "Race",	0,	100,	12,	2900,	4.6	);
	        	root.getChild(0).getChild(1).addChild("Trials Frontier",	"Race",	0,	10,	12,	281,	4.5	);
	        	root.getChild(0).getChild(1).addChild("Traffic Rider",	"Race",	0,	100,	4,	243.1,	4.5	);
	        	root.getChild(0).getChild(1).addChild("Jetpack Joyride",	"Race",	0,	100,	9,	176.5,	4.5);	
	        	root.getChild(0).getChild(1).addChild("GT. Racing 2",	"Race"	,0,	10,	12,	1600,	4.4	);
	        	root.getChild(0).getChild(1).addChild("Fun Run 3D",	"Race",	0,	100,	4,	148.9,	4.4	);
	        	root.getChild(0).getChild(1).addChild("Driving Zone: Germany", 	"Race",	0,	10,	4,	194.5,	3.8);
	        	root.getChild(0).getChild(1).addChild("Need for Speed Most Wanted",	"Race",	46.99,	1,	4,	2100,	3.7	);
 	
	        root.getChild(0).addChild("AllSport","Sport",0.0,100,0,4,50);
	        	root.getChild(0).getChild(2).addChild("Tennis Clash: Live Sport Games",	"Sport",	0,	10,	12,	245.1,	4.6);
	        	root.getChild(0).getChild(2).addChild("Football Strike", 	"Sport",	0,	100,	4,	188.8,	4.6	);
	        	root.getChild(0).getChild(2).addChild("Ski Safari 2",	"Sport",	1.99,	10,	4,	157.6,	4.5);
	        	root.getChild(0).getChild(2).addChild("Ski Safari", 	"Sport",	1.99,	0.5,	4,	143.3,	4.5	);
	        	root.getChild(0).getChild(2).addChild("NBA Lýve Mobile Basketball",	"Sport",	0,	50,	4,	183.6,	4.4	);
	        	root.getChild(0).getChild(2).addChild("GT Racing 2", 	"Sport",	0,	10,	12,	1600,	4.4	);
	        	root.getChild(0).getChild(2).addChild("Football Manager 2021 Mobile",	"Sport",	79.99,	0.1,	4,	1600,	4.4	);
	        	root.getChild(0).getChild(2).addChild("FIFA Football",	"Sport",	0,	100,  4,	167.7,	4.3	);
	        	root.getChild(0).getChild(2).addChild("Pixel Cup Soccer 16", 	"Sport",	1.99,	0.01,	4,	64.4,	3.9	);
	        	root.getChild(0).getChild(2).addChild("NBA JAM by EA SPORTS",	"Sport",	46.99,	0.1,	4,	530.9,	3.6	);
	        		

	        root.getChild(0).addChild("AllAction","Action",0.0,100,0,4,5);
	        	root.getChild(0).getChild(3).addChild("Shadow Fight 2",	"Action",	0,	100,	12,	390.2,	4.6	);
	        	root.getChild(0).getChild(3).addChild("Hungry Shark Evolution", "Action",	0,	100,	12,	318.4,	4.5	);
	        	root.getChild(0).getChild(3).addChild("Call of Duty : Mobile","Action",	0,	100, 17,	2900,	4.4	);
	        	root.getChild(0).getChild(3).addChild("Subway Surfers",	"Action",0,	1000,	9,	267.1,	4.4	);
	        	root.getChild(0).getChild(3).addChild("World of Tanks Blitz tank PVP",	"Action",	0,	100,	12,	2900,	4.3	);
	        	root.getChild(0).getChild(3).addChild("Red Ball 4",	"Action",	0,	100,	4,	95.1,	4.3);
	        	root.getChild(0).getChild(3).addChild("PUBG Mobile",	"Action",	0,	100,	17,	1800,	4.2	);
	        	root.getChild(0).getChild(3).addChild("Warface: Global Operations",	"Action",	0,	10,	17,	2000,	4.0	);
	        	root.getChild(0).getChild(3).addChild("Justice Gun 2",	"Action",	8.99,	0.01,	17,	295.5,	3.5);
	        	root.getChild(0).getChild(3).addChild("Assassin's Creed Identýty",	"Action",	18.99,	1,	12,	2600,	3.4	);
	        	
	        
	       root.getChild(0).addChild("AllSimulation","Simulation",0.0,100,0,4,5);
       			root.getChild(0).getChild(4).addChild("Dragon City",	"Simulation",	0,	100,	4,	191.3,	4.7	);
       			root.getChild(0).getChild(4).addChild("House Flipper",	"Simulation",	0,	10,	4,	343.2,	4.6	);
       			root.getChild(0).getChild(4).addChild("Global City",	"Simulation",	0,	1,	4,	177.7,	4.6	);
       			root.getChild(0).getChild(4).addChild("The Sims Mobil",	"Simulation",	0,	50,	12,	142,	4.5	);
       			root.getChild(0).getChild(4).addChild("Otobüs Simulator : Ultimate",	"Simulation",	0,	50,	4,	906,	4.4);
       			root.getChild(0).getChild(4).addChild("RFS - Real Flight Simulator",	"Simulation",	2.99,	1,	4,	430,	4.1);
       			root.getChild(0).getChild(4).addChild("Construction Simulator 2",	"Simulation",	18.99,	0.1,	4,	1640,	4.1	);
       			root.getChild(0).getChild(4).addChild("Taxi Sim 2020",	"Simulation",	0,	10,	12,	2150,	3.9		);
       			root.getChild(0).getChild(4).addChild("Farming Simulator 20",	"Simulation",	54.99,	0.1,	4,	640.8,	3.6	);
       			root.getChild(0).getChild(4).addChild("TruckSimulation 16",	"Simulation",	8.99,	0.1,	4,	2830,	3.4	);
       		
       		
       		root.getChild(0).addChild("AllCasual","Casual",0.0,100,0,4,5);			
       			root.getChild(0).getChild(5).addChild("Candy Crush Saga",	"Casual",	0,	1000,	4,	72,	4.6	);
       			root.getChild(0).getChild(5).addChild("Hay Day",	"Casual",	0,	100,	4,	148,	4.4	);
       			root.getChild(0).getChild(5).addChild("Hangman",	"Casual",	0,	10,	4,	33,	4.4	);
       			root.getChild(0).getChild(5).addChild("My Talking Tom",	"Casual",	0,	500,	4,	95,	4.3	);
       			root.getChild(0).getChild(5).addChild("Angry Birds 2",	"Casual",	0,	100,	4,	210,	4.3	);
       			root.getChild(0).getChild(5).addChild("Buble Shooter",	"Casual",	0,	100,	4,	24,	4.3	);
       			root.getChild(0).getChild(5).addChild("Tic Tac Toe Glow",	"Casual",	0,	100,	4,	59,	4.2	);
       			root.getChild(0).getChild(5).addChild("Bricks Breaker",	"Casual",	0,	10,	4,	26,    4.0);
       			root.getChild(0).getChild(5).addChild("Bridge Race",	"Casual",	0,	10,	9,	71,	3.7	);
       			root.getChild(0).getChild(5).addChild("Going Balls",	"Casual",	0,	10,	4,	88,	3.8	);
       		
       			
       			
	        root.addChild("AllApps","Apps",0.0,100,0,4,5);
	         
	        root.getChild(1).addChild("AllEducation","Education",0.0,100,0,4,5);
	        	root.getChild(1).getChild(0).addChild("Coursera","Education",	0,	10,	4,	50.2,	4.8);
	        	root.getChild(1).getChild(0).addChild("Quizlet Flashcards & Homework", 	"Education",	0,	10,	4,	36.5,	4.8);
	        	root.getChild(1).getChild(0).addChild("Skillshare-Creative Classes", 	"Education",	0,	1,	12,	32.3,	4.7);
	        	root.getChild(1).getChild(0).addChild("SkyView",	"Education",	18.99,	10,	4,	77.3,	4.7);
	        	root.getChild(1).getChild(0).addChild("Wikipedia",  	"Education",	0,	50,	17,	35.4,	4.7);
	        	root.getChild(1).getChild(0).addChild("Busuu",	"Education",	0,	10,	4,	93.8,	4.7);
	        	root.getChild(1).getChild(0).addChild("Udemy", 	"Education",	0,	10,	4,	74.5,	4.6);
	        	root.getChild(1).getChild(0).addChild("Dualingo",	"Education",	0,	100,	4,	186.8,	4.6);
	        	root.getChild(1).getChild(0).addChild("Kahoot",	"Education",	0,	10,	4,	48.7,	4.5);
	        	root.getChild(1).getChild(0).addChild("itslearning", 	"Education",	0,	1,	4,	18.3,	4.4);
	        	
	        	
	        root.getChild(1).addChild("AllHealth","Health",0.0,100,0,4,5);
	        	root.getChild(1).getChild(1).addChild("Noisli",	"Health",	18.99,	0.1,	4,	262.2,	5);
	        	root.getChild(1).getChild(1).addChild("Ev Egzersizleri - Ekipmansýz",	"Health",	0,	100,	4,	238.7,	4.9);
	        	root.getChild(1).getChild(1).addChild("30 Day Workout at Home",	"Health",	0,	10,	12,	177.9,	4.9);
	        	root.getChild(1).getChild(1).addChild("Nike Training Club",	"Health",	0,	10,	4,	152.3,	4.8);
	        	root.getChild(1).getChild(1).addChild("Meditopia : Medidation, Breath",	"Health",	0,	10,	4,	68.9,	4.8);
	        	root.getChild(1).getChild(1).addChild("Calorie Counter by FatSecret", 	"Health",	0,	10,	4,	38.5,	4.7);
	        	root.getChild(1).getChild(1).addChild("Oral-B",	"Health",	0,	1,  4,	110.6,	4.7);
	        	root.getChild(1).getChild(1).addChild("Pedometre",	"Health",	0,	10,	4,	12.1,	4.7);
	        	root.getChild(1).getChild(1).addChild("Fitness Point PRO : Home&GYM",	"Health",	46.99,	0.01,	9,	69,	4.4);
	        	root.getChild(1).getChild(1).addChild("Mi Fit",	"Health",	0,	50,	4,	303.7,	4.3);
	        	
	        	
	       	root.getChild(1).addChild("AllShopping","Shopping",0.0,100,0,4,5);
        		root.getChild(1).getChild(2).addChild("getir: groceries in minutes",	"Shopping",	0,	5,	4,	66.1,	4.8);
        		root.getChild(1).getChild(2).addChild("H&M",	"Shopping",	0,	10,	4,	117.9,	4.7);
        		root.getChild(1).getChild(2).addChild("Yemeksepeti: Food & Grocery",	"Shopping",	0,	10,	4,	99.1,	4.7);
        		root.getChild(1).getChild(2).addChild("Hepsiburada:Online Alýþveriþ", 	"Shopping",	0,	10,	4,	92.6,	4.7);
        		root.getChild(1).getChild(2).addChild("Trendyol",	"Shopping",	0,	10,	4,	136.7,	4.6);
        		root.getChild(1).getChild(2).addChild("Dolap", 	"Shopping",	0,	10,	4,	76.0,	4.6);
        		root.getChild(1).getChild(2).addChild("letgo",	"Shopping",	0,	100,	12,	73.3,	4.4);
        		root.getChild(1).getChild(2).addChild("Bershka", 	"Shopping",	0,	10,	4,	95.7,	4.3);
        		root.getChild(1).getChild(2).addChild("Amazon",	"Shopping",	0,	100,4,	113.9,	4.3);
        		root.getChild(1).getChild(2).addChild("ZARA",	"Shopping",	0,	10,	4,	148.8,	3.9);

        		
        	root.getChild(1).addChild("AllFun","Fun",0.0,100,0,4,5);
    			root.getChild(1).getChild(3).addChild("Spotify", 	"Fun",	0,	1000,	12,	126.1,	4.7);
    			root.getChild(1).getChild(3).addChild("Instagram",	"Fun",	0,	1000,	12,	154.4,	4.6);
    			root.getChild(1).getChild(3).addChild("BluTV",	"Fun",	0,	5,	17,	32.4,	4.5);
    			root.getChild(1).getChild(3).addChild("Youtube", 	"Fun",	0,	5000,	17,	226.2,	4.5);
    			root.getChild(1).getChild(3).addChild("TikTok",	"Fun",	0,	1000,	12,	218.6,	4.3	);
    			root.getChild(1).getChild(3).addChild("Gain",	"Fun",	0,	0.5,	12,	108.8,	3.6);
    			root.getChild(1).getChild(3).addChild("puhutv",	"Fun",	0,	5,	4,	37.2,	3.6);
    			root.getChild(1).getChild(3).addChild("Netflix",	"Fun",	0,	1000,	4,	21.8,	3.5);
    			root.getChild(1).getChild(3).addChild("Snapchat", 	"Fun",	0,	1000,	12,	201.8,	3.4);
    			root.getChild(1).getChild(3).addChild("Exxen",  "Fun",	0,	1,	4,	21.8,	2.5);
    			

        	root.getChild(1).addChild("AllCommunication","Communication",0.0,100,0,4,5);	
    			root.getChild(1).getChild(4).addChild("Microsoft Teams",	"Communication",	0,	100,	4,	231.7,	4.7);
    			root.getChild(1).getChild(4).addChild("WhatsApp Business",	"Communication",	0,	5000,	12,	88.7,	4.7);
    			root.getChild(1).getChild(4).addChild("Discord",	"Communication",	0,	100,	17,	134.6,	4.6);
    			root.getChild(1).getChild(4).addChild("BÝP-Messenger,Video Call",	"Communication",	0,	50,	12,	209.4,	4.5);
    			root.getChild(1).getChild(4).addChild("WhatsApp Messenger", 	"Communication",	0,	5000,	12,	84.2,	4.5);
    			root.getChild(1).getChild(4).addChild("Signal",	"Communication",	0,	50,	12,	127.9,	4.5);
    			root.getChild(1).getChild(4).addChild("Skype", 	"Communication",	0,	1000,	12,	105.6,	4.3);
    			root.getChild(1).getChild(4).addChild("Gmail", 	"Communication",	0,	5000,	4,	312.3,	4.3);
    			root.getChild(1).getChild(4).addChild("Zoom Cloud Meetings", 	"Communication",	0,	500,	4,	81.5, 	4.2);
    			root.getChild(1).getChild(4).addChild("Telegram",	"Communication",	0,	500,	17,	78.5,	3.9);
    		
    			
            root.getChild(1).addChild("AllFinance","Finance",0.0,100,0,4,5);	
				root.getChild(1).getChild(5).addChild("VakýfBank Mobil Bankacýlýk", 	"Finance", 	0,	10,	17,	209.7,	4.8);
				root.getChild(1).getChild(5).addChild("BtcTurk I PRO Buy-Sell Bitcoin", 	"Finance", 	0,	1,	4,	82.4,	4.8);
				root.getChild(1).getChild(5).addChild("Papara",	"Finance", 	0,	1,	4,	60.4,	4.8);
				root.getChild(1).getChild(5).addChild("Paycell", 	"Finance", 	0,	5,	4,	131.5,	4.8);
				root.getChild(1).getChild(5).addChild("ÝþCep",	"Finance", 	0,	10,	17,	186.9,	4.6);
				root.getChild(1).getChild(5).addChild("Garanti BBVA Mobile", 	"Finance",	0,	10,	17,	184.8,	4.4);
				root.getChild(1).getChild(5).addChild("MobilDeniz",	"Finance", 	0,	5,	12,	152.3,	3.4);
				root.getChild(1).getChild(5).addChild("gate.io",	"Finance", 	0,	0.5,	9,	159.3,	2.7);
				root.getChild(1).getChild(5).addChild("Binance TR I Bitcoin Al & Sat", 	"Finance", 	0,	1,	4,	36.3,	2.6);
				root.getChild(1).getChild(5).addChild("Paribu",	"Finance", 	0,	1,	4,	25.6,	2.0);
	    }
	  
	    
	} 

