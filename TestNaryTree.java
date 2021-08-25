import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class TestNaryTree {
	    public static void main(String[] args) {
	       
	    	NaryTreeNode root = new NaryTreeNode("AppStore","General",0.0,100,0,4,5);
	    	root.createAppStore(root);
				Scanner scanner = new Scanner (System.in);
				System.out.println("**************************Welcome to Appstore****************************");	
				System.out.println("Operations:\n 1.Search App\n 2.Add App\n 3.Remove App\n 4.Print All Features Of App\n 5.Display All Apps");
				System.out.println("For quit, press q");
				while  (true) {
					System.out.println("Choose operation: ");
					String operation = scanner.nextLine();
					if (operation.toLowerCase().equals("q")) {
						System.out.println("Program is shut down.");
						break;	
					}
					
					else if (operation.equals("1")) {
						System.out.println("Enter the category that you want to search: ");
						String category = scanner.nextLine();
						System.out.println("Enter the rank: ");
						int rank = scanner.nextInt();
						scanner.nextLine();
						
						System.out.println(root.searchWithPopularity(category, rank));
					}
					
					else if (operation.equals("2")) {
						System.out.println("Enter the app information that you want to add ");
						System.out.println("Name: ");
						String name = scanner.nextLine();
						System.out.println("Category: ");
						String category=scanner.nextLine();
						System.out.println("Price: ");
						double price=scanner.nextDouble();
						System.out.println("Downloads:(M) ");
						double downloads=scanner.nextDouble();
						System.out.println("Age Limit: ");
						int ageLimit=scanner.nextInt();
						scanner.nextLine();
						System.out.println("Size:(Mb) ");
						double size=scanner.nextDouble();
						System.out.println("Score: ");
						double score=scanner.nextDouble();
						scanner.nextLine();
						System.out.println("The app is adding to AppStore..");
						try {
							  Thread.sleep(5000);
							} catch (InterruptedException e) {e.printStackTrace();}
						System.out.println("The app is successfully added.");
						root.Addapp(name, category, price, downloads, ageLimit, size, score);
						
					}
					
					else if (operation.equals("3")) {
						System.out.println("Enter the app that you want to remove: ");
						String app = scanner.nextLine();
						System.out.println("The app is removing to AppStore...");
						try {
							  Thread.sleep(3000);
							} catch (InterruptedException e) {e.printStackTrace();}
						System.out.println("The app is deleted.");
						 root.removeapp(app);
					}
					
					else if (operation.equals("4")) {
						System.out.println("Enter the app name that you want to display its all details: ");
						String app2 = scanner.nextLine();
						System.out.println("The app is displaying...");
						try {
							  Thread.sleep(3000);
							} catch (InterruptedException e) {e.printStackTrace();}
						
						root.printAllFeatures(app2);
					}
					
					else if (operation.equals("5")) {
						System.out.println("The AppStore is displaying...");
						try {
							  Thread.sleep(4000);
							} catch (InterruptedException e) {e.printStackTrace();}
						NaryTreeNode.print(root);
					}
					else {
						
						System.out.println("Incorrect Selection! Please Check Your Selection");
					}
				}
	    }
	  
	}
	