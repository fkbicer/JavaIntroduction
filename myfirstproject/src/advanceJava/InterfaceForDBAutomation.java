package advanceJava;

import java.util.Scanner;

public class InterfaceForDBAutomation {

	public static void main(String[] args) {
		
		   DatabaseManager databaseManager;
	        // Değişken Tanımlaması:
	        int karar;
	        // Scanner Tanımlaması:
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("[1] - MysqlDatabase Baglan\n[2] - OracleDatabase Baglan\n-----------------\n-> Karariniz:");
	        karar = scanner.nextInt();
	        switch(karar){
	            case 1:
	                databaseManager = new DatabaseManager(new MysqlDatabase());
	                System.out.println("-----------------");
	                databaseManager.loginDatabase();
	                System.out.println("-----------------");
	                databaseManager.selectMenu();
	                break;
	            case 2:
	                databaseManager = new DatabaseManager(new OracleDatabase());
	                System.out.println("-----------------");
	                databaseManager.loginDatabase();
	                System.out.println("-----------------");
	                databaseManager.selectMenu();
	                break;
	            default:
	                System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
	                break;
	        }

	}
}
interface IDatabase {
	
	void login();
	void add();
	void delete();
	void get();
	void update();

}	

    class MysqlDatabase implements IDatabase {

	@Override
	public void login() {
		System.out.println("-> Mysql Veritabanına Bağlanıldı.");
		
	}

	@Override
	public void add() {
		System.out.println("-> Verilen İşlemler Mysql Veritabanına Kaydedildi.");
		
	}

	@Override
	public void delete() {
		  System.out.println("-> Verilen İşlemler Mysql Veritabanından Silindi.");
		
	}

	@Override
	public void get() {
		System.out.println("-> İstenilen İşlemler Mysql Veritabanından Getirildi.");
		
	}

	@Override
	public void update() {
		System.out.println("-> İstenilen İşlemler Mysql Veritabanı Üzerinde Güncellendi.");
		
	}
	
}
    
    class OracleDatabase implements IDatabase {

		@Override
		public void login() {
			 System.out.println("-> Oracle Veritabanına Bağlanıldı.");
			
		}

		@Override
		public void add() {
			 System.out.println("-> Verilen İşlemler Oracle Veritabanına Kaydedildi.");
			
		}

		@Override
		public void delete() {
			  System.out.println("-> Verilen İşlemler Oracle Veritabanından Silindi.");
			
		}

		@Override
		public void get() {
			System.out.println("-> İstenilen İşlemler Oracle Veritabanından Getirildi.");
			
		}

		@Override
		public void update() {
			 System.out.println("-> İstenilen İşlemler Oracle Veritabanı Üzerinde Güncellendi.");
			
		}
    	
    }

    class DatabaseManager {
    	
    	private IDatabase database;
        DatabaseManager(IDatabase database){
            this.database = database;
        }
        public void loginDatabase(){
            database.login();
        }
        public void addDatabase(){
            database.add();
        }
        public void deleteDatabase(){
            database.delete();
        }
        public void getDatabase(){
            database.get();
        }
        public void updateDatabase(){
            database.update();
        }
        public void selectMenu(){
            int kararVer;
            Scanner scanner = new Scanner(System.in);
            System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Veri Ekle\n[2] - Veri Sil\n[3] - Veri Getir\n[4] - Veri Güncelle\n-----------------\n-> Kararınız:");
            kararVer = scanner.nextInt();
            switch(kararVer){
                case 1:
                    System.out.println("-----------------");
                    addDatabase();
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    deleteDatabase();
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("-----------------");
                    getDatabase();
                    System.out.println("-----------------");
                    break;
                case 4:
                    System.out.println("-----------------");
                    updateDatabase();
                    System.out.println("-----------------");
                    break;
                default:
                    System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                    break;
            }
        }
    	
    	
    }