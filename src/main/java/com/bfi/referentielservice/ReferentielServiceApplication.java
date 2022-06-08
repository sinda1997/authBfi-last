package com.bfi.referentielservice;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableGlobalMethodSecurity(prePostEnabled = true , securedEnabled = true)

public class ReferentielServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferentielServiceApplication.class, args);
	}



	/*@Bean
	CommandLineRunner start(PersonnePhysiqueRepository personnePhysiqueRepository, TiersRepository tiersRepository,
							PersonneMoraleRepository personneMoraleRepository, BanqueRepository banqueRepository,
							CompteRepository compteRepository) {
		return args -> {

			Compte c1 = compteRepository.save(new Compte(null,"NUM_1123115","Compte epargne","1511321131615610",20000L,12000L,false,null,null,null,null));
			Compte c2 = compteRepository.save(new Compte(null,"NUM_2111899","Compte epargne","1511321131615610",100000L,8800L,false,null,null,null,null));
			Compte c3 = compteRepository.save(new Compte(null,"NUM_5615161","Compte cheque","1511321131615610",2000L,-2500L,false,null,null,null,null));


			//PersonnePhysique pp1 = personnePhysiqueRepository.save(new PersonnePhysique(26,"célibataire","ali","raoudha", "Tunisie","tunisie","tunis",29677860L));
			//PersonnePhysique pp2 = personnePhysiqueRepository.save(new PersonnePhysique(30,"Mriié","samir","raoudha", "Congo","tunisie","tunis",29677860L));
			//PersonnePhysique pp3 = personnePhysiqueRepository.save(new PersonnePhysique(18,"Celibataire","sami","monjia", "Tunisie","tunisie","tunis",29677860L));
			//PersonnePhysique pp4 = personnePhysiqueRepository.save(new PersonnePhysique(28,"célibataire","dali","olfa", "Tunisie","tunisie","tunis",29677860L));
			//PersonnePhysique pp5 = personnePhysiqueRepository.save(new PersonnePhysique(42,"Marié","mohamed","sarra", "Italie","tunisie","tunis",29677860L));
			//PersonnePhysique pp6 = personnePhysiqueRepository.save(new PersonnePhysique(42,"Marié","mohamed","sarra", "Italie","tunisie","tunis",29677860L));

			//PersonnePhysique pp7 = personnePhysiqueRepository.save(new PersonnePhysique(42,"Marié","mohamed","sarra", "Italie","tunisie","tunis",29677860L));



			/*appUserService.saveUser(new AppUser(null,"souhail","souhail001","1234",new Date(),new ArrayList<>()));
			appUserService.saveUser(new AppUser(null,"mohammed","med007","1234",new Date(),new ArrayList<>()));
			appUserService.saveUser(new AppUser(null,"amine","amuneTwil02","1234",new Date(),new ArrayList<>()));
			appUserService.saveUser(new AppUser(null,"khaled","groomftw","1234",new Date(),new ArrayList<>()));

			appUserService.saveRole(new AppRole(null,"ROLE_USER",new Date()));
			appUserService.saveRole(new AppRole(null,"ROLE_ADMIN",new Date()));
			appUserService.saveRole(new AppRole(null,"ROLE_MANAGER",new Date()));
			appUserService.saveRole(new AppRole(null,"ROLE_SUPER_ADMIN",new Date()));

			appUserService.addRoleToUser("souhail001",	"ROLE_ADMIN");
			appUserService.addRoleToUser("amuneTwil02","ROLE_USER");
			appUserService.addRoleToUser("groomftw","ROLE_MANAGER");
			appUserService.addRoleToUser("med007","ROLE_USER");
			appUserService.addRoleToUser("med007","ROLE_ADMIN");
			appUserService.addRoleToUser("med007","ROLE_MANAGER");*/

		/*};
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}*/
}
