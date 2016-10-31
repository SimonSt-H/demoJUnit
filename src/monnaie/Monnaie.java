/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monnaie;

/**
 *
 * @author fc891127
 */
public class Monnaie {
    public long montant;

    public Monnaie (long pMontant){
        if(pMontant <= 0){
            throw new IllegalArgumentException();
        }
        montant = pMontant;
    }
    public Monnaie plus(Monnaie pMonnaie2){
        return new Monnaie(montant + pMonnaie2.montant);
    }
    
    public Monnaie pourcentage(double pPourcentage){
        return new Monnaie(Math.round(montant*pPourcentage));
    }
    
    public String toString(Monnaie pMonnaie){
        return (Long.toString(montant/100) + "$");
    }
    
    public Monnaie moins(Monnaie pMonnaie2){
        return new Monnaie(montant - pMonnaie2.montant);
    }
}
