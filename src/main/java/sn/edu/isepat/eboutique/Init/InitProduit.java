package sn.edu.isepat.eboutique.Init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sn.edu.isepat.eboutique.entities.ProduitDieyeBineta;
import sn.edu.isepat.eboutique.repositories.ProduitDieyeBinetaRepository;

@Component
@Order(2)
public class InitProduit implements CommandLineRunner {

    private final ProduitDieyeBinetaRepository produitDieyeBinetaRepository;

    public InitProduit(ProduitDieyeBinetaRepository produitDieyeBinetaRepository) {
        this.produitDieyeBinetaRepository = produitDieyeBinetaRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("###Initialisation produit");

        ProduitDieyeBineta produit = new ProduitDieyeBineta();
        produit.setNom("Micro-onde");
        produit.setPrix(150000.0);
        produit.setDescription("Haute qualité");

        produitDieyeBinetaRepository.save(produit);
    }
}
