package test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Materiel;
import model.Poney;
import model.User;
import repository.MaterielRepository;
import repository.PoneyRepository;
import repository.UserRepository;



public class TestBD {
	
	public static void main(String[] args) {

		//testCreatePoney();
		//testCreateMatos();
		//testFindAllPoneys();
		//testAddUser();
		addNewUser();
		
	}
	
private static void addNewUser() 
	{
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
	UserRepository pr = context.getBean(UserRepository.class);
	
	pr.save(new User("Gobin", "Jean", "Dans la grotte", 6, "test"));
	}

static void testCreatePoney() {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
	PoneyRepository pr = context.getBean(PoneyRepository.class);
	
	pr.save(new Poney("Petit Tonerre", "Pie", "Mustang", 152, "Petit mais vaillant", 1200));
	pr.save(new Poney("Picasso", "Alezan", "Quarter Horser", 170, "Cheval d'artiste, il a 3 pattes", 2000));
	pr.save(new Poney("Bucéphale", "Noir", "Lusitanien", 157, "A peur de son ombre mais ça passe", 8900));
	pr.save(new Poney("Cannabis", "Blanc", "Poney Sauvage", 165, "N'avance pas sauf quand on lui dit HUE", 2));
	
	context.close();
}

static void testCreateMatos() {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
	MaterielRepository pr = context.getBean(MaterielRepository.class);
	
	pr.save(new Materiel("Selle super stylée", 1000));
	pr.save(new Materiel("Bride avec mors en or", 100));
	pr.save(new Materiel("Fers pour courir vite", 2400));
	pr.save(new Materiel("Cravache magique", 189));
	pr.save(new Materiel("Potion magique pour cheval difficile", 250));
	pr.save(new Materiel("Tapis de selle d'invisibilité", 380));
	pr.save(new Materiel("Cravache en boyaux de chats", 500));
	pr.save(new Materiel("Selle ergonomique ejectable", 800));
	pr.save(new Materiel("Protection de guerre anti trous", 2000));
	
	
	context.close();
}

static void testAddUser()
{
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
	UserRepository rp = context.getBean(UserRepository.class);
//	rp.save(new User("Dalor", "Homer", "34 rue de la Boustifaille", 7));
//	rp.save(new User("Deuf", "John", "22 rue de la Boustifaille", 3));
//	rp.save(new User("Assous", "Steeve", "Dans nos coeur", 10));
//	rp.save(new User("Novotel", "Athéna", "Sous le pont", 1));
	context.close();
}


static void testFindAllPoneys() {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
	PoneyRepository pr = context.getBean(PoneyRepository.class);
	
	List<Poney> poneys = pr.findAll();
	for( Poney poney : poneys)
	System.out.println(poney);
	
	context.close();
}

}
