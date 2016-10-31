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
    public Monnaie plus(Monnaie pMontant2){
        return new Monnaie(montant + pMontant2.montant);
    }
    
    public Monnaie pourcentage(double pPourcentage){
        return new Monnaie(Math.round(montant*pPourcentage));
    }
    
    public String toString(Monnaie pMonnaie){
        return (Long.toString(montant));
    }
    
    public Monnaie moins(Monnaie pMontant2){
        return new Monnaie(montant - pMontant2.montant);
    }
}
