package interfaceJava;

import java.util.Scanner;

public class InterfaceTrain {

	public static void main(String[] args) {

		int karar;
		DatabaseManagere databaseManager;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mysql icin : 1");
		System.out.println("Oracle icin : 2");
		karar = scan.nextInt();
		
		switch(karar){
        case 1:
        	databaseManager = new DatabaseManagere(new MysqlDatabasee());
            System.out.println("-----------------");
            databaseManager.loginDatabase();
            System.out.println("-----------------");
            databaseManager.selectMenu();
            break;
        case 2:
            databaseManager = new DatabaseManagere(new OracleDatabasee());
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

	
interface IDatabasee {
	void login();
	void add();
	void delete();
	void get();
	void update();
}

class MysqlDatabasee implements IDatabasee {

	@Override
	public void login() {
		System.out.println("Mysql veritabanina giris yapildi.");
		
	}

	@Override
	public void add() {
		System.out.println("Mysql veritabanina veri eklendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql veritabanindan silme islemi gerceklestirildi.");
		
	}

	@Override
	public void get() {
		System.out.println("Mysql veritabanindan veri çekme islemi gerceklestirildi.");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql veritabaninda guncelleme islemi gerceklestirildi.");
		
	}
	
}

class OracleDatabasee implements IDatabasee {
	
	@Override
	public void login() {
		System.out.println("Oracle veritabanina giris yapildi.");
		
	}

	@Override
	public void add() {
		System.out.println("Oracle veritabanina veri eklendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle veritabanindan silme islemi gerceklestirildi.");
		
	}

	@Override
	public void get() {
		System.out.println("Oracle veritabanindan veri çekme islemi gerceklestirildi.");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle veritabaninda guncelleme islemi gerceklestirildi.");
		
	}
	
}


class DatabaseManagere {
	
	private IDatabasee database;
    DatabaseManagere(IDatabasee database){
        this.database = database;
    }
	
	public void loginDatabase() {
		database.login();
	}
	
	public void addDatabase() {
		database.add();
	}
	public void deleteDatabase() {
		database.delete();
	}
	public void getDatabase() {
		database.get();
	}
	public void updateDatabase() {
		database.update();
	}
	
	public void selectMenu() {
		
		int kararVer;
		Scanner scan = new Scanner(System.in);
		System.out.println("-- Veri eklemek için '1' giriniz");
		System.out.println("-- Veri silmek için '2' giriniz");
		System.out.println("-- Veri çekmek için '3' giriniz");
		System.out.println("-- Veri güncellemek için '4' giriniz");
		
		kararVer = scan.nextInt();
		
		 switch(kararVer) {
		 case 1 :
			 System.out.println("--------------------");
			 addDatabase();
			 System.out.println("--------------------");
			 break;
		 case 2 :
			 System.out.println("--------------------");
			 deleteDatabase();
			 System.out.println("--------------------");
			 break;
		 case 3 :
			 System.out.println("--------------------");
			 getDatabase();
			 System.out.println("--------------------");
			 break;
		 case 4 :
			 System.out.println("--------------------");
			 updateDatabase();
			 System.out.println("--------------------");
			 break;
		  default :
			 System.out.println("--------------------");
			 System.out.println("Geçersiz bir değer girdiniz.");
			 System.out.println("--------------------");
			 break;	 
		
		 }
		
	}
	
	
	
	
	
}


